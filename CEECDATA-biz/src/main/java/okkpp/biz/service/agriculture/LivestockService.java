package okkpp.biz.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.agriculture.LivestockMapper;
import okkpp.biz.model.agriculture.Livestock;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class LivestockService {

	@Autowired
	LivestockMapper mapper;
	public List<Livestock> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Livestock.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Livestock> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Livestock.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Livestock> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Livestock����
	public int updateLivestock(Livestock livestock) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(livestock);
	}

	// Livestock����
	public int insertLivestock(Livestock livestock) {
		return mapper.insertSelective(livestock);
	}

	// Livestockɾ��
	public int deleteLivestock(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
