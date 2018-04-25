package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.TaxAsPercentageOfEvenueMapper;
import okkpp.biz.model.finance.TaxAsPercentageOfEvenue;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class TaxAsPercentageOfEvenueService {

	@Autowired
	TaxAsPercentageOfEvenueMapper mapper;
	public List<TaxAsPercentageOfEvenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(TaxAsPercentageOfEvenue.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<TaxAsPercentageOfEvenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(TaxAsPercentageOfEvenue.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<TaxAsPercentageOfEvenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// TaxAsPercentageOfEvenue����
	public int updateTaxAsPercentageOfEvenue(TaxAsPercentageOfEvenue taxAsPercentageOfEvenue) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(taxAsPercentageOfEvenue);
	}

	// TaxAsPercentageOfEvenue����
	public int insertTaxAsPercentageOfEvenue(TaxAsPercentageOfEvenue taxAsPercentageOfEvenue) {
		return mapper.insertSelective(taxAsPercentageOfEvenue);
	}

	// TaxAsPercentageOfEvenueɾ��
	public int deleteTaxAsPercentageOfEvenue(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
