package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.oracle.dao.PowerDao;
import com.oracle.po.Power;
import com.oracle.po.Role;
import com.oracle.util.JavaTemplet;
import com.oracle.util.mappingmanager.SelectManager;

public class PowerDaoImpl implements PowerDao {

	public List<Power> selectPowerByRoleId(int roleId) {
		List<Object> list = null;
		List<Power> plist = new ArrayList<Power>();
		String sqlid = "selectPower";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, Power.class,roleId);
		for(Object p:list){
			Power ps = new Power();
			ps.setPowerId(((Power)p).getPowerId());
			ps.setPowerName(((Power)p).getPowerName());
			ps.setPowerCode(((Power)p).getPowerCode());
			ps.setPowerUrl(((Power)p).getPowerUrl());
			plist.add(ps);
		}
		return plist;
	}
}
