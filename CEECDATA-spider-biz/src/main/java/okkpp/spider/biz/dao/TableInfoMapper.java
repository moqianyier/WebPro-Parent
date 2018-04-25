package okkpp.spider.biz.dao;

import okkpp.spider.biz.model.TableInfo;
import tk.mybatis.mapper.common.Mapper;

public interface TableInfoMapper extends Mapper<TableInfo> {
	
	public int insertReturnId(TableInfo tableInfo);
}