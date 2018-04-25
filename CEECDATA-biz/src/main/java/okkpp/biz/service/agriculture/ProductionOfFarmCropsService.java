package okkpp.biz.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.agriculture.ProductionOfFarmCropsMapper;
import okkpp.biz.model.agriculture.ProductionOfFarmCrops;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ProductionOfFarmCropsService {

	@Autowired
	ProductionOfFarmCropsMapper mapper;
	public List<ProductionOfFarmCrops> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ProductionOfFarmCrops.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ProductionOfFarmCrops> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ProductionOfFarmCrops.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ProductionOfFarmCrops> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ProductionOfFarmCrops����
	public int updateProductionOfFarmCrops(ProductionOfFarmCrops productionOfFarmCrops) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(productionOfFarmCrops);
	}

	// ProductionOfFarmCrops����
	public int insertProductionOfFarmCrops(ProductionOfFarmCrops productionOfFarmCrops) {
		return mapper.insertSelective(productionOfFarmCrops);
	}

	// ProductionOfFarmCropsɾ��
	public int deleteProductionOfFarmCrops(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
