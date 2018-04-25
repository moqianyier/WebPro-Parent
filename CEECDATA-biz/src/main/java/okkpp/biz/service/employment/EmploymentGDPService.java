package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.EmploymentGDPMapper;
import okkpp.biz.model.employment.EmploymentGDP;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class EmploymentGDPService {

	@Autowired
	EmploymentGDPMapper mapper;
	public List<EmploymentGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EmploymentGDP.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EmploymentGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EmploymentGDP.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EmploymentGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EmploymentGDP����
	public int updateEmploymentGDP(EmploymentGDP employmentGDP) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(employmentGDP);
	}

	// EmploymentGDP����
	public int insertEmploymentGDP(EmploymentGDP employmentGDP) {
		return mapper.insertSelective(employmentGDP);
	}

	// EmploymentGDPɾ��
	public int deleteEmploymentGDP(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
