package okkpp.biz.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.economics.PercentageOfAgricultureMapper;
import okkpp.biz.model.economics.PercentageOfAgriculture;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PercentageOfAgricultureService {

	@Autowired
	PercentageOfAgricultureMapper mapper;
	public List<PercentageOfAgriculture> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PercentageOfAgriculture.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PercentageOfAgriculture> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PercentageOfAgriculture.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PercentageOfAgriculture> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PercentageOfAgriculture����
	public int updatePercentageOfAgriculture(PercentageOfAgriculture percentageOfAgriculture) {
		// TODO Auto-generated method 
		return mapper.updateByPrimaryKeySelective(percentageOfAgriculture);
	}

	// PercentageOfAgriculture����
	public int inserttPercentageOfAgriculture(PercentageOfAgriculture percentageOfAgriculture) {
		return mapper.insertSelective(percentageOfAgriculture);
	}

	// PercentageOfAgricultureɾ��
	public int deletePercentageOfAgriculture(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
