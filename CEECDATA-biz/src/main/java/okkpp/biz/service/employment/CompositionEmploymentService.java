package okkpp.biz.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.employment.CompositionEmploymentMapper;
import okkpp.biz.model.employment.CompositionEmployment;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CompositionEmploymentService {

	@Autowired
	CompositionEmploymentMapper mapper;
	public List<CompositionEmployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CompositionEmployment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CompositionEmployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CompositionEmployment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CompositionEmployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CompositionEmployment����
	public int updateCompositionEmployment(CompositionEmployment compositionEmployment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(compositionEmployment);
	}

	// CompositionEmployment����
	public int insertCompositionEmployment(CompositionEmployment compositionEmployment) {
		return mapper.insertSelective(compositionEmployment);
	}

	// CompositionEmploymentɾ��
	public int deleteCompositionEmployment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
