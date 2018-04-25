package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.EmploymentMapper;
import okkpp.biz.model.employment.Employment;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class EmploymentService {

	@Autowired
	EmploymentMapper mapper;
	public List<Employment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Employment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Employment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Employment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Employment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Employment����
	public int updateEmployment(Employment employment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(employment);
	}

	// Employment����
	public int insertEmployment(Employment employment) {
		return mapper.insertSelective(employment);
	}

	// Employmentɾ��
	public int deleteEmployment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
