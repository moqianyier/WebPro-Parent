package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.RuralAndUrbanRateMapper;
import okkpp.biz.model.population.RuralAndUrbanRate;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RuralAndUrbanRateService {

	@Autowired
	RuralAndUrbanRateMapper mapper;
	
	public List<RuralAndUrbanRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RuralAndUrbanRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RuralAndUrbanRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RuralAndUrbanRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RuralAndUrbanRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RuralAndUrbanRate����
	public int updateRuralAndUrbanRate(RuralAndUrbanRate ruralAndUrbanRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(ruralAndUrbanRate);
	}

	// RuralAndUrbanRate����
	public int insertRuralAndUrbanRate(RuralAndUrbanRate ruralAndUrbanRate) {
		return mapper.insertSelective(ruralAndUrbanRate);
	}

	// RuralAndUrbanRateɾ��
	public int deleteRuralAndUrbanRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
