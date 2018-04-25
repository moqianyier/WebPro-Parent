package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.CentralGovernmentRevenueMapper;
import okkpp.biz.model.finance.CentralGovernmentRevenue;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CentralGovernmentRevenueService {

	@Autowired
	CentralGovernmentRevenueMapper mapper;
	public List<CentralGovernmentRevenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CentralGovernmentRevenue.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CentralGovernmentRevenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CentralGovernmentRevenue.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CentralGovernmentRevenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CentralGovernmentRevenue����
	public int updateCentralGovernmentRevenue(CentralGovernmentRevenue centralGovernmentRevenue) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(centralGovernmentRevenue);
	}

	// CentralGovernmentRevenue����
	public int insertCentralGovernmentRevenue(CentralGovernmentRevenue centralGovernmentRevenue) {
		return mapper.insertSelective(centralGovernmentRevenue);
	}

	// CentralGovernmentRevenueɾ��
	public int deleteCentralGovernmentRevenue(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
