package okkpp.biz.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.industry.ValueAddedInManufacturingMapper;
import okkpp.biz.model.industry.ValueAddedInManufacturing;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ValueAddedInManufacturingService {

	@Autowired
	ValueAddedInManufacturingMapper mapper;
	public List<ValueAddedInManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ValueAddedInManufacturing.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ValueAddedInManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ValueAddedInManufacturing.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ValueAddedInManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ValueAddedInManufacturing����
	public int updateValueAddedInManufacturing(ValueAddedInManufacturing valueAddedInManufacturing) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(valueAddedInManufacturing);
	}

	// ValueAddedInManufacturing����
	public int insertValueAddedInManufacturing(ValueAddedInManufacturing valueAddedInManufacturing) {
		return mapper.insertSelective(valueAddedInManufacturing);
	}

	// ValueAddedInManufacturingɾ��
	public int deleteValueAddedInManufacturing(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
