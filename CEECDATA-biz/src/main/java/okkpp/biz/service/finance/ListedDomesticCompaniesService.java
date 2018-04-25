package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.ListedDomesticCompaniesMapper;
import okkpp.biz.model.finance.ListedDomesticCompanies;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ListedDomesticCompaniesService {

	@Autowired
	ListedDomesticCompaniesMapper mapper;
	public List<ListedDomesticCompanies> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ListedDomesticCompanies.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ListedDomesticCompanies> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ListedDomesticCompanies.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ListedDomesticCompanies> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ListedDomesticCompanies����
	public int updateListedDomesticCompanies(ListedDomesticCompanies listedDomesticCompanies) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(listedDomesticCompanies);
	}

	// ListedDomesticCompanies����
	public int insertListedDomesticCompanies(ListedDomesticCompanies listedDomesticCompanies) {
		return mapper.insertSelective(listedDomesticCompanies);
	}

	// ListedDomesticCompaniesɾ��
	public int deleteListedDomesticCompanies(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
