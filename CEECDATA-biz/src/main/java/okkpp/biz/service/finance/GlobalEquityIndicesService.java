package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.GlobalEquityIndicesMapper;
import okkpp.biz.model.finance.GlobalEquityIndices;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class GlobalEquityIndicesService {

	@Autowired
	GlobalEquityIndicesMapper mapper;
	public List<GlobalEquityIndices> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(GlobalEquityIndices.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GlobalEquityIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(GlobalEquityIndices.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<GlobalEquityIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// GlobalEquityIndices����
	public int updateGlobalEquityIndices(GlobalEquityIndices globalEquityIndices) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(globalEquityIndices);
	}

	// GlobalEquityIndices����
	public int insertGlobalEquityIndices(GlobalEquityIndices globalEquityIndices) {
		return mapper.insertSelective(globalEquityIndices);
	}

	// GlobalEquityIndicesɾ��
	public int deleteGlobalEquityIndices(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
