package okkpp.biz.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.trade.ExportsByCommodityGroupsMapper;
import okkpp.biz.model.trade.ExportsByCommodityGroups;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ExportsByCommodityGroupsService {

	@Autowired
	ExportsByCommodityGroupsMapper mapper;
	
	public List<ExportsByCommodityGroups> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(ExportsByCommodityGroups.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ExportsByCommodityGroups> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(ExportsByCommodityGroups.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<ExportsByCommodityGroups> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//ExportsByCommodityGroups����
	public int updateExportsByCommodityGroups(ExportsByCommodityGroups exportsByCommodityGroups) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(exportsByCommodityGroups);
	}
	
	//ExportsByCommodityGroups����
	public int insertExportsByCommodityGroups(ExportsByCommodityGroups exportsByCommodityGroups) {
		return mapper.insertSelective(exportsByCommodityGroups);
	}
	
	//ExportsByCommodityGroupsɾ��
	public int deleteExportsByCommodityGroups(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
