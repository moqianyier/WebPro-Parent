package okkpp.biz.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.economics.RateOfConsumptionMapper;
import okkpp.biz.model.economics.RateOfConsumption;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RateOfConsumptionService {

	@Autowired
	RateOfConsumptionMapper mapper;
	public List<RateOfConsumption> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RateOfConsumption.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RateOfConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RateOfConsumption.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RateOfConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RateOfConsumption����
	public int updateRateOfConsumption(RateOfConsumption rateOfConsumption) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(rateOfConsumption);
	}

	// RateOfConsumption����
	public int insertRateOfConsumption(RateOfConsumption rateOfConsumption) {
		return mapper.insertSelective(rateOfConsumption);
	}

	// RateOfConsumptionɾ��
	public int deleteRateOfConsumption(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
