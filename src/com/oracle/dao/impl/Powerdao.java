package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.po.Power;
import com.oracle.util.JavaTemplet;

public class Powerdao {

	public List<Power> findPower(){
		List<Object> list = null;
		List<Power> plist = new ArrayList<Power>();
		String sqlid = "findPower";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, Power.class);
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
