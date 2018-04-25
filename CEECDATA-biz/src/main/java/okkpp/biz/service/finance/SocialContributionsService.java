package okkpp.biz.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.finance.SocialContributionsMapper;
import okkpp.biz.model.finance.SocialContributions;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class SocialContributionsService {

	@Autowired
	SocialContributionsMapper mapper;
	public List<SocialContributions> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(SocialContributions.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<SocialContributions> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(SocialContributions.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<SocialContributions> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// SocialContributions����
	public int updateSocialContributions(SocialContributions socialContributions) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(socialContributions);
	}

	// SocialContributions����
	public int insertSocialContributions(SocialContributions socialContributions) {
		return mapper.insertSelective(socialContributions);
	}

	// SocialContributionsɾ��
	public int deleteSocialContributions(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
