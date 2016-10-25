package com.oracle.dao.impl;

import com.oracle.dao.AddsectionDao;
import com.oracle.po.TD0Section;
import com.oracle.util.JavaTemplet;

public class AddsectionDaoImpl implements AddsectionDao {

	public int addsection(String id,String orgid,String divcode,String divname,String ifsub,String dutytel,String fax,String divroomno) {
		int i;
		String sqlid = "addTD0Section4";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid,TD0Section.class,id,orgid,divcode,divname,ifsub,dutytel,fax,divroomno);
		
		return i;
		}
}
