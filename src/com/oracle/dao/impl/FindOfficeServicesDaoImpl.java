package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.FindOfficeServicesDao;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;
import com.oracle.util.JDBCTemplet;
import com.oracle.util.JavaTemplet;

public class FindOfficeServicesDaoImpl implements FindOfficeServicesDao {

	public List<TD0Section> findTD0Section(String orgid,String divname) {
		List<Object> list = null;
		List<TD0Section> sectionlist = new ArrayList<TD0Section>();
		String sqlid = "selectTD0Section";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Section.class, orgid,divname);
		for(Object s:list){
			TD0Section t = new TD0Section();
			t.setId(((TD0Section)s).getId());
			t.setOrgid(((TD0Section)s).getOrgid());
			t.setOrgno(((TD0Section)s).getOrgno());
			t.setDivcode(((TD0Section)s).getDivcode());
			t.setDivnamecode(((TD0Section)s).getDivnamecode());
			t.setDivname(((TD0Section)s).getDivname());
			t.setIfsub(((TD0Section)s).getIfsub());
			t.setDutytel(((TD0Section)s).getDutytel());
			t.setFax(((TD0Section)s).getFax());
			t.setDivroomno(((TD0Section)s).getDivroomno());
			t.setExetype(((TD0Section)s).getExetype());
			sectionlist.add(t);
		}
		System.out.println(sectionlist);
		return sectionlist;
	}

	public int deletesection(String id) {
		int i;
		String sqlid = "deletesection";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Section.class, id);
		
		return i;
	}

}
