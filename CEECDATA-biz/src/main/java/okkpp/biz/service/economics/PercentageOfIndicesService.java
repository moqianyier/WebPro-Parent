package okkpp.biz.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.economics.PercentageOfIndicesMapper;
import okkpp.biz.model.economics.PercentageOfIndices;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PercentageOfIndicesService {

	@Autowired
	PercentageOfIndicesMapper mapper;
	public List<PercentageOfIndices> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PercentageOfIndices.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PercentageOfIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PercentageOfIndices.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PercentageOfIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PercentageOfIndices����
	public int updatePercentageOfIndices(PercentageOfIndices percentageOfIndices) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(percentageOfIndices);
	}

	// PercentageOfIndices����
	public int insertPercentageOfIndices(PercentageOfIndices percentageOfIndices) {
		return mapper.insertSelective(percentageOfIndices);
	}

	// PercentageOfIndicesɾ��
	public int deletePercentageOfIndices(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
