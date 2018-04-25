package okkpp.biz.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.culture.WaterPeopleRateMapper;
import okkpp.biz.model.culture.WaterPeopleRate;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class WaterPeopleRateService {

	@Autowired
	WaterPeopleRateMapper mapper;
	public List<WaterPeopleRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(WaterPeopleRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<WaterPeopleRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(WaterPeopleRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<WaterPeopleRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// WaterPeopleRate����
	public int updateWaterPeopleRate(WaterPeopleRate waterPeopleRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(waterPeopleRate);
	}

	// WaterPeopleRate����
	public int insertWaterPeopleRate(WaterPeopleRate waterPeopleRate) {
		return mapper.insertSelective(waterPeopleRate);
	}

	// WaterPeopleRateɾ��
	public int deleteWaterPeopleRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
