package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.population.MidYearPoplationMapper;
import okkpp.biz.model.population.MidYearPoplation;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MidYearPoplationService {

	@Autowired
	MidYearPoplationMapper mapper;
	
	public List<MidYearPoplation> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(MidYearPoplation.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(MidYearPoplation.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// MidYearPoplation����
	public int updateMidYearPoplation(MidYearPoplation midYearPoplation) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(midYearPoplation);
	}

	// MidYearPoplation����
	public int insertMidYearPoplation(MidYearPoplation midYearPoplation) {
		return mapper.insertSelective(midYearPoplation);
	}

	// MidYearPoplationɾ��
	public int deleteMidYearPoplation(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
