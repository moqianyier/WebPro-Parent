package okkpp.biz.service.overall;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.overall.LandUtilizationMapper;
import okkpp.biz.model.overall.LandUtilization;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class LandUtilizationService {

	@Autowired
	LandUtilizationMapper mapper;
	public List<LandUtilization> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(LandUtilization.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<LandUtilization> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(LandUtilization.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<LandUtilization> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// LandUtilization����
	public int updateLandUtilization(LandUtilization landUtilization) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(landUtilization);
	}

	// LandUtilization����
	public int insertLandUtilization(LandUtilization landUtilization) {
		return mapper.insertSelective(landUtilization);
	}

	// LandUtilizationɾ��
	public int deleteLandUtilization(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
