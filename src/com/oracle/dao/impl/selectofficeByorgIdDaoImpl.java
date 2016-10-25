package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.selectofficeByorgIdDao;
import com.oracle.po.TD0Section;
import com.oracle.util.JavaTemplet;

public class selectofficeByorgIdDaoImpl implements selectofficeByorgIdDao {

	public List<TD0Section> selectofficeByorgId(String orgid) {
		List<Object> list = null;
		List<TD0Section> sectionlist = new ArrayList<TD0Section>();
		String sqlid = "selectTD0Section1";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Section.class, orgid);
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
		return sectionlist;
	
	}

}
