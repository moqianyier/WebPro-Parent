package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.SurplusMapper;
import okkpp.biz.model.finance.Surplus;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class SurplusService {

	@Autowired
	SurplusMapper mapper;
	public List<Surplus> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Surplus.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Surplus> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Surplus.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Surplus> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Surplus����
	public int updateSurplus(Surplus surplus) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(surplus);
	}

	// Surplus����
	public int insertSurplus(Surplus surplus) {
		return mapper.insertSelective(surplus);
	}

	// Surplusɾ��
	public int deleteSurplus(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
