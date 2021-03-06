package okkpp.biz.service.price;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.biz.dao.price.ConsumerMapper;
import okkpp.biz.model.price.Consumer;
import okkpp.biz.utils.CountryCode;
import okkpp.biz.utils.FormatUtil;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ConsumerService {

	@Autowired
	ConsumerMapper mapper;

	public List<Consumer> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Consumer.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Consumer> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Consumer.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Consumer> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Consumer����
	public int updateConsumer(Consumer consumer) {
		if (FormatUtil.haveNull(consumer)) {
			return 0;
		}
		return mapper.updateByPrimaryKeySelective(consumer);
	}

	// Consumer����
	public int insertConsumer(Consumer consumer) {
		if (FormatUtil.haveNull(consumer)) {
			return 0;
		}
		return mapper.insertSelective(consumer);
	}

	// Consumerɾ��
	public int deleteConsumer(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
