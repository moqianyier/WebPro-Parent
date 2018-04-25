package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.LaborForceMapper;
import okkpp.biz.model.employment.LaborForce;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class LaborForceService {

	@Autowired
	LaborForceMapper mapper;
	public List<LaborForce> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(LaborForce.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<LaborForce> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(LaborForce.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<LaborForce> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// LaborForce����
	public int updateLaborForce(LaborForce laborForce) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(laborForce);
	}

	// LaborForce����
	public int insertLaborForce(LaborForce laborForce) {
		return mapper.insertSelective(laborForce);
	}

	// LaborForceɾ��
	public int deleteLaborForce(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
