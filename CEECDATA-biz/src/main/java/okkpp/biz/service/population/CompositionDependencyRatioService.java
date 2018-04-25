package okkpp.biz.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.population.CompositionDependencyRatioMapper;
import okkpp.biz.model.population.CompositionDependencyRatio;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CompositionDependencyRatioService {

	@Autowired
	CompositionDependencyRatioMapper mapper;
	
	public List<CompositionDependencyRatio> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CompositionDependencyRatio.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CompositionDependencyRatio.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CompositionDependencyRatio����
	public int updateCompositionDependencyRatio(CompositionDependencyRatio compositionDependencyRatio) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(compositionDependencyRatio);
	}

	// CompositionDependencyRatio����
	public int insertCompositionDependencyRatio(CompositionDependencyRatio compositionDependencyRatio) {
		return mapper.insertSelective(compositionDependencyRatio);
	}

	// CompositionDependencyRatioɾ��
	public int deleteCompositionDependencyRatio(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
