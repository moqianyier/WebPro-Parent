package okkpp.biz.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.biz.base.service.BaseService;
import okkpp.biz.dao.agriculture.HarvestAreasMapper;
import okkpp.biz.model.agriculture.HarvestAreas;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class HarvestAreasService extends BaseService<HarvestAreas>{

	@Autowired
	HarvestAreasMapper mapper;
	public List<HarvestAreas> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(HarvestAreas.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<HarvestAreas> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(HarvestAreas.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<HarvestAreas> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// HarvestAreas����
	public int updateHarvestAreas(HarvestAreas harvestAreas) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(harvestAreas);
	}

	// HarvestAreas����
	public int insertHarvestAreas(HarvestAreas harvestAreas) {
		return mapper.insertSelective(harvestAreas);
	}

	// HarvestAreasɾ��
	public int deleteHarvestAreas(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
