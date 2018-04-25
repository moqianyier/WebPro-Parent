package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.EducationalUnemploymentMapper;
import okkpp.biz.model.employment.EducationalUnemployment;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class EducationalUnemploymentService {

	@Autowired
	EducationalUnemploymentMapper mapper;
	public List<EducationalUnemployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EducationalUnemployment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EducationalUnemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EducationalUnemployment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EducationalUnemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EducationalUnemployment����
	public int updateEducationalUnemployment(EducationalUnemployment educationalUnemployment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(educationalUnemployment);
	}

	// EducationalUnemployment����
	public int insertEducationalUnemployment(EducationalUnemployment educationalUnemployment) {
		return mapper.insertSelective(educationalUnemployment);
	}

	// EducationalUnemploymentɾ��
	public int deleteEducationalUnemployment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
