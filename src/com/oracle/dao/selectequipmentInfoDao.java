package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Orgattached;

public interface selectequipmentInfoDao {

	public List<TD0Orgattached> selectequipment();
	public List<TD0Organization> selectequipments(String orgid);
	public List<TD0Organization> selecteequ();
	public List<TD0Organization> selects(String yearly);
	public List<TD0Organization> selecteuqip(String orgid,String yearly);
	public int createquipment(Object...args);
}
