package okkpp.biz.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.energy.BalanceSheetMapper;
import okkpp.biz.model.energy.BalanceSheet;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class BalanceSheetService {

	@Autowired
	BalanceSheetMapper mapper;
	public List<BalanceSheet> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BalanceSheet.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BalanceSheet> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BalanceSheet.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BalanceSheet> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BalanceSheet����
	public int updateBalanceSheet(BalanceSheet balanceSheet) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(balanceSheet);
	}

	// BalanceSheet����
	public int insertBalanceSheet(BalanceSheet balanceSheet) {
		return mapper.insertSelective(balanceSheet);
	}

	// BalanceSheetɾ��
	public int deleteBalanceSheet(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
