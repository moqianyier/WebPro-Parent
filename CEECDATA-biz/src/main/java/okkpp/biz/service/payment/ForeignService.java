package okkpp.biz.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.payment.ForeignMapper;
import okkpp.biz.model.payment.Foreign;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ForeignService {

	@Autowired
	ForeignMapper mapper;
	
	public List<Foreign> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Foreign.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Foreign> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Foreign.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Foreign> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Foreign����
	public int updateForeign(Foreign foreign) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(foreign);
	}

	// Foreign����
	public int insertForeign(Foreign foreign) {
		return mapper.insertSelective(foreign);
	}

	// Foreignɾ��
	public int deleteForeign(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
