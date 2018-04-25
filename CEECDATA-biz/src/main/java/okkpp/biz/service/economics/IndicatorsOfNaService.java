package okkpp.biz.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.economics.IndicatorsOfNaMapper;
import okkpp.biz.model.economics.IndicatorsOfNa;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class IndicatorsOfNaService {

	@Autowired
	IndicatorsOfNaMapper mapper;
	public List<IndicatorsOfNa> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(IndicatorsOfNa.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<IndicatorsOfNa> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(IndicatorsOfNa.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<IndicatorsOfNa> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// IndicatorsOfNa����
	public int updateIndicatorsOfNa(IndicatorsOfNa indicatorsOfNa) {
		// TODO Auto-generated method 
		return mapper.updateByPrimaryKeySelective(indicatorsOfNa);
	}

	// IndicatorsOfNa����
	public int insertIndicatorsOfNa(IndicatorsOfNa indicatorsOfNa) {
		return mapper.insertSelective(indicatorsOfNa);
	}

	// IndicatorsOfNaɾ��
	public int deleteIndicatorsOfNa(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
