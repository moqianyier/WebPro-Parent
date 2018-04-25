package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.ReproductiveHealthMapper;
import okkpp.biz.model.population.ReproductiveHealth;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReproductiveHealthService {

	@Autowired
	ReproductiveHealthMapper mapper;
	
	public List<ReproductiveHealth> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ReproductiveHealth.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ReproductiveHealth.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ReproductiveHealth����
	public int updateReproductiveHealth(ReproductiveHealth reproductiveHealth) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(reproductiveHealth);
	}

	// ReproductiveHealth����
	public int insertReproductiveHealth(ReproductiveHealth reproductiveHealth) {
		return mapper.insertSelective(reproductiveHealth);
	}

	// ReproductiveHealthɾ��
	public int deleteReproductiveHealth(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
