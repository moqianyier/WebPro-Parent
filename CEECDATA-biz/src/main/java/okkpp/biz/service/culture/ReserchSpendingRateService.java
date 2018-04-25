package okkpp.biz.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.culture.ReserchSpendingRateMapper;
import okkpp.biz.model.culture.ReserchSpendingRate;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ReserchSpendingRateService {

	@Autowired
	ReserchSpendingRateMapper mapper;
	public List<ReserchSpendingRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ReserchSpendingRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ReserchSpendingRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ReserchSpendingRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ReserchSpendingRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ReserchSpendingRate����
	public int updateReserchSpendingRate(ReserchSpendingRate reserchSpendingRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(reserchSpendingRate);
	}

	// ReserchSpendingRate����
	public int insertReserchSpendingRate(ReserchSpendingRate reserchSpendingRate) {
		return mapper.insertSelective(reserchSpendingRate);
	}

	// ReserchSpendingRateɾ��
	public int deleteReserchSpendingRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
