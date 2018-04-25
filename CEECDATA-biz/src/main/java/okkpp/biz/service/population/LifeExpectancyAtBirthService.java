package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.LifeExpectancyAtBirthMapper;
import okkpp.biz.model.population.LifeExpectancyAtBirth;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class LifeExpectancyAtBirthService {

	@Autowired
	LifeExpectancyAtBirthMapper mapper;
	
	public List<LifeExpectancyAtBirth> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(LifeExpectancyAtBirth.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<LifeExpectancyAtBirth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(LifeExpectancyAtBirth.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<LifeExpectancyAtBirth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// LifeExpectancyAtBirth����
	public int updateLifeExpectancyAtBirth(LifeExpectancyAtBirth lifeExpectancyAtBirth) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(lifeExpectancyAtBirth);
	}

	// LifeExpectancyAtBirth����
	public int insertLifeExpectancyAtBirth(LifeExpectancyAtBirth lifeExpectancyAtBirth) {
		return mapper.insertSelective(lifeExpectancyAtBirth);
	}

	// LifeExpectancyAtBirthɾ��
	public int deleteLifeExpectancyAtBirth(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
