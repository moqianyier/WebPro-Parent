package okkpp.biz.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.industry.IndicesOfManufacturingMapper;
import okkpp.biz.model.industry.IndicesOfManufacturing;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class IndicesOfManufacturingService {

	@Autowired
	IndicesOfManufacturingMapper mapper;
	public List<IndicesOfManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(IndicesOfManufacturing.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<IndicesOfManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(IndicesOfManufacturing.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<IndicesOfManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// IndicesOfManufacturing����
	public int updateIndicesOfManufacturing(IndicesOfManufacturing indicesOfManufacturing) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(indicesOfManufacturing);
	}

	// IndicesOfManufacturing����
	public int insertIndicesOfManufacturing(IndicesOfManufacturing indicesOfManufacturing) {
		return mapper.insertSelective(indicesOfManufacturing);
	}

	// IndicesOfManufacturingɾ��
	public int deleteIndicesOfManufacturing(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
