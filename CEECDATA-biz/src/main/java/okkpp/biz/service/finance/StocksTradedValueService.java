package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.StocksTradedValueMapper;
import okkpp.biz.model.finance.StocksTradedValue;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class StocksTradedValueService {

	@Autowired
	StocksTradedValueMapper mapper;
	public List<StocksTradedValue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(StocksTradedValue.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<StocksTradedValue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(StocksTradedValue.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<StocksTradedValue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// StocksTradedValue����
	public int updateStocksTradedValue(StocksTradedValue stocksTradedValue) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(stocksTradedValue);
	}

	// StocksTradedValue����
	public int insertStocksTradedValue(StocksTradedValue stocksTradedValue) {
		return mapper.insertSelective(stocksTradedValue);
	}

	// StocksTradedValueɾ��
	public int deleteStocksTradedValue(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
