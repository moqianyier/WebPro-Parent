package okkpp.spider.biz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.spider.biz.base.service.BaseService;
import okkpp.spider.biz.dao.TableDataMapper;
import okkpp.spider.biz.model.TableData;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class TableDataService extends BaseService<TableData>{

	@Autowired
	TableDataMapper mapper;
	
	public int saveData(int tableId,Map<String, Object> data) {
		TableData td = new TableData(tableId,data);
		mapper.insertReturnId(td);
		return td.getId();
	}
	public List<TableData> list(int catalogId) {
		Example example = new Example(TableData.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("infoId", catalogId);
		return selectByExample(example);
	}
}
