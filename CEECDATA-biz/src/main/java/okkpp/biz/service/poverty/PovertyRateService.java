package okkpp.biz.service.poverty;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.poverty.PovertyRateMapper;
import okkpp.biz.model.poverty.PovertyRate;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PovertyRateService {

	@Autowired
	PovertyRateMapper mapper;
	
	public List<PovertyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PovertyRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PovertyRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PovertyRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PovertyRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PovertyRate����
	public int updatePovertyRate(PovertyRate povertyRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(povertyRate);
	}

	// PovertyRate����
	public int insertPovertyRate(PovertyRate povertyRate) {
		return mapper.insertSelective(povertyRate);
	}

	// PovertyRateɾ��
	public int deletePovertyRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
