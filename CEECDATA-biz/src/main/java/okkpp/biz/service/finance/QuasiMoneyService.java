package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.QuasiMoneyMapper;
import okkpp.biz.model.finance.QuasiMoney;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class QuasiMoneyService {

	@Autowired
	QuasiMoneyMapper mapper;
	public List<QuasiMoney> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(QuasiMoney.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<QuasiMoney> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(QuasiMoney.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<QuasiMoney> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// QuasiMoney����
	public int updateQuasiMoney(QuasiMoney quasiMoney) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(quasiMoney);
	}

	// QuasiMoney����
	public int insertQuasiMoney(QuasiMoney quasiMoney) {
		return mapper.insertSelective(quasiMoney);
	}

	// QuasiMoneyɾ��
	public int deleteQuasiMoney(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
