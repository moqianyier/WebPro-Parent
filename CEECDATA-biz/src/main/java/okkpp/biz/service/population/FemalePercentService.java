package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.FemalePercentMapper;
import okkpp.biz.model.population.FemalePercent;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class FemalePercentService {

	@Autowired
	FemalePercentMapper mapper;
	
	public List<FemalePercent> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(FemalePercent.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<FemalePercent> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(FemalePercent.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<FemalePercent> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// FemalePercent����
	public int updateFemalePercent(FemalePercent femalePercent) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(femalePercent);
	}

	// FemalePercent����
	public int insertFemalePercent(FemalePercent femalePercent) {
		return mapper.insertSelective(femalePercent);
	}

	// FemalePercentɾ��
	public int deleteFemalePercent(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
