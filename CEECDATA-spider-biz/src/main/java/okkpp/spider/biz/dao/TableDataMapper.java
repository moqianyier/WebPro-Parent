package okkpp.spider.biz.dao;

import okkpp.spider.biz.model.TableData;
import tk.mybatis.mapper.common.Mapper;

public interface TableDataMapper extends Mapper<TableData> {
	
	public int insertReturnId(TableData tableData);
}