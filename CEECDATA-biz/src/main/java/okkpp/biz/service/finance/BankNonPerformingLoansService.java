package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.BankNonPerformingLoansMapper;
import okkpp.biz.model.finance.BankNonPerformingLoans;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class BankNonPerformingLoansService {

	@Autowired
	BankNonPerformingLoansMapper mapper;
	public List<BankNonPerformingLoans> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BankNonPerformingLoans.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BankNonPerformingLoans> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BankNonPerformingLoans.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BankNonPerformingLoans> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BankNonPerformingLoans����
	public int updateBankNonPerformingLoans(BankNonPerformingLoans bankNonPerformingLoans) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(bankNonPerformingLoans);
	}

	// BankNonPerformingLoans����
	public int insertBankNonPerformingLoans(BankNonPerformingLoans bankNonPerformingLoans) {
		return mapper.insertSelective(bankNonPerformingLoans);
	}

	// BankNonPerformingLoanslɾ��
	public int deleteBankNonPerformingLoans(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
