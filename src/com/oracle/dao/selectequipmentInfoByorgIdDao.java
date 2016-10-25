package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Orgattached;

public interface selectequipmentInfoByorgIdDao {

	public List<TD0Orgattached> selectequipment(String orgid);
}
