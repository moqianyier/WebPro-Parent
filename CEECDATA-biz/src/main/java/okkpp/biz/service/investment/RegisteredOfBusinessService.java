package okkpp.biz.service.investment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.investment.RegisteredOfBusinessMapper;
import okkpp.biz.model.investment.RegisteredOfBusiness;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RegisteredOfBusinessService {

	@Autowired
	RegisteredOfBusinessMapper mapper;
	
	public List<RegisteredOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RegisteredOfBusiness.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RegisteredOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RegisteredOfBusiness.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RegisteredOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RegisteredOfBusiness����
	public int updateRegisteredOfBusiness(RegisteredOfBusiness registeredOfBusiness) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(registeredOfBusiness);
	}

	// RegisteredOfBusiness����
	public int insertRegisteredOfBusiness(RegisteredOfBusiness registeredOfBusiness) {
		return mapper.insertSelective(registeredOfBusiness);
	}

	// RegisteredOfBusinessɾ��
	public int deleteRegisteredOfBusiness(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
