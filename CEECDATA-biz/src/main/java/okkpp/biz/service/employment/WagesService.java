package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.WagesMapper;
import okkpp.biz.model.employment.Wages;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class WagesService {

	@Autowired
	WagesMapper mapper;
	public List<Wages> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Wages.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Wages> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Wages.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Wages> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Wages����
	public int updateWages(Wages wages) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(wages);
	}

	// Wages����
	public int insertWages(Wages wages) {
		return mapper.insertSelective(wages);
	}

	// Wagesɾ��
	public int deleteWagest(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
