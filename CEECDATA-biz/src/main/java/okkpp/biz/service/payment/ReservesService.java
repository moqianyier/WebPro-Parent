package okkpp.biz.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.payment.ReservesMapper;
import okkpp.biz.model.payment.Reserves;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ReservesService {

	@Autowired
	ReservesMapper mapper;
	
	public List<Reserves> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Reserves.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Reserves> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Reserves.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Reserves> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Reserves����
	public int updateReserves(Reserves reserves) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(reserves);
	}

	// Reserves����
	public int insertReserves(Reserves reserves) {
		return mapper.insertSelective(reserves);
	}

	// Reservesɾ��
	public int deleteReserves(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
