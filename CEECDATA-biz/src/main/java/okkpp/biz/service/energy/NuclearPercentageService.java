package okkpp.biz.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.energy.NuclearPercentageMapper;
import okkpp.biz.model.energy.NuclearPercentage;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class NuclearPercentageService {

	@Autowired
	NuclearPercentageMapper mapper;
	public List<NuclearPercentage> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(NuclearPercentage.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<NuclearPercentage> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(NuclearPercentage.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<NuclearPercentage> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// NuclearPercentage����
	public int updateNuclearPercentage(NuclearPercentage nuclearPercentage) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(nuclearPercentage);
	}

	// NuclearPercentage����
	public int insertNuclearPercentage(NuclearPercentage nuclearPercentage) {
		return mapper.insertSelective(nuclearPercentage);
	}

	// NuclearPercentageɾ��
	public int deleteNuclearPercentage(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
