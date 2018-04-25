package okkpp.biz.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.economics.GrowthRateGdppcMapper;
import okkpp.biz.model.economics.GrowthRateGdppc;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class GrowthRateGdppcService {

	@Autowired
	GrowthRateGdppcMapper mapper;
	public List<GrowthRateGdppc> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(GrowthRateGdppc.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GrowthRateGdppc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(GrowthRateGdppc.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<GrowthRateGdppc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// GrowthRateGdppc����
	public int updateGrowthRateGdppc(GrowthRateGdppc growthRateGdppc) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(growthRateGdppc);
	}

	// GrowthRateGdppc����
	public int insertGrowthRateGdppc(GrowthRateGdppc growthRateGdppc) {
		return mapper.insertSelective(growthRateGdppc);
	}

	// GrowthRateGdppcɾ��
	public int deleteGrowthRateGdppc(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
