package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.po.TD0Section;
import com.oracle.util.JavaTemplet;

public class dao {
	
	public List<TD0Section> finds(String orgid){
		List<Object> list = null;
		List<TD0Section> sectionlist = new ArrayList<TD0Section>();
		String sqlid = "selectTD0Section1";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Section.class, orgid);
		for(Object s:list){
			TD0Section sc = new TD0Section();
			sc.setId(((TD0Section)s).getId());
			sc.setOrgid(((TD0Section)s).getOrgid());
			sc.setOrgno(((TD0Section)s).getOrgno());
			sc.setDivcode(((TD0Section)s).getDivcode());
			sc.setDivname(((TD0Section)s).getDivname());
			sc.setDivnamecode(((TD0Section)s).getDivnamecode());
			sc.setIfsub(((TD0Section)s).getIfsub());
			sc.setDutytel(((TD0Section)s).getDutytel());
			sc.setFax(((TD0Section)s).getFax());
			sc.setDivroomno(((TD0Section)s).getDivroomno());
			sc.setExetype(((TD0Section)s).getExetype());
			sectionlist.add(sc);
		}
		return sectionlist;
	}
	

}
