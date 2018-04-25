package okkpp.biz.service.overall;

import java.util.List;
import okkpp.biz.dao.overall.FreshWaterMapper;
import okkpp.biz.model.overall.FreshWater;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class FreshWaterService {

	@Autowired
	FreshWaterMapper mapper;
	public List<FreshWater> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(FreshWater.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<FreshWater> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(FreshWater.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<FreshWater> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// FreshWater����
	public int updateFreshWater(FreshWater freshWaterf) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(freshWaterf);
	}

	// FreshWater����
	public int insertFreshWater(FreshWater freshWater) {
		return mapper.insertSelective(freshWater);
	}

	// FreshWaterɾ��
	public int deleteFreshWater(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
