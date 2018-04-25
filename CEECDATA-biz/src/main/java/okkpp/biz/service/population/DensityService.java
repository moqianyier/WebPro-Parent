package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.DensityMapper;
import okkpp.biz.model.population.Density;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class DensityService {

	@Autowired
	DensityMapper mapper;
	
	public List<Density> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Density.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Density> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Density.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Density> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Density����
	public int updateDensity(Density density) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(density);
	}

	// Density����
	public int insertDensity(Density density) {
		return mapper.insertSelective(density);
	}

	// Densityɾ��
	public int deleteDensity(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
