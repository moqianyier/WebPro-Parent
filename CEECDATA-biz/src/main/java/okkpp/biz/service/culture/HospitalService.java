package okkpp.biz.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.culture.HospitalMapper;
import okkpp.biz.model.culture.Hospital;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class HospitalService {

	@Autowired
	HospitalMapper mapper;
	public List<Hospital> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Hospital.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Hospital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Hospital.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Hospital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Hospital����
	public int updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(hospital);
	}

	// Hospital����
	public int insertHospital(Hospital hospital) {
		return mapper.insertSelective(hospital);
	}

	// Hospitalɾ��
	public int deleteHospital(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
