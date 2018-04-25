package okkpp.biz.service.poverty;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.biz.dao.poverty.InternationalPovertyRatioMapper;
import okkpp.biz.model.poverty.InternationalPovertyRatio;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class InternationalPovertyRatioService {

	@Autowired
	InternationalPovertyRatioMapper mapper;
	
	public List<InternationalPovertyRatio> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(InternationalPovertyRatio.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<InternationalPovertyRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(InternationalPovertyRatio.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<InternationalPovertyRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// InternationalPovertyRatio����
	public int updateInternationalPovertyRatio(InternationalPovertyRatio internationalPovertyRatio) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(internationalPovertyRatio);
	}

	// InternationalPovertyRatio����
	public int insertInternationalPovertyRatio(InternationalPovertyRatio internationalPovertyRatio) {
		return mapper.insertSelective(internationalPovertyRatio);
	}

	// InternationalPovertyRatioɾ��
	public int deleteInternationalPovertyRatio(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
