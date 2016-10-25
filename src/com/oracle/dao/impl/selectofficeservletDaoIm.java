package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Section;

import com.oracle.dao.selectofficeservletDao;
import com.oracle.po.TD0Section;
import com.oracle.util.JavaTemplet;

public class selectofficeservletDaoIm implements selectofficeservletDao {

	public List<TD0Section> selectoffice(String id) {
		List<Object> list = null;
		List<TD0Section> seclist = new ArrayList<TD0Section>();
		String sqlid = "section";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Section.class, id);
		for(Object a:list){
			seclist.add((TD0Section)a);
		}
		return seclist;
	}

}
