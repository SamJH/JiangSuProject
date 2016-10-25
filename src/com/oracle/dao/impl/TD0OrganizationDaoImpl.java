package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.TD0OrganizationDao;
import com.oracle.po.TD0Organization;
import com.oracle.util.JavaTemplet;

public class TD0OrganizationDaoImpl implements TD0OrganizationDao {

	public List<TD0Organization> selectTD0Organization() {
		List<Object> list = null;
		List<TD0Organization> Organizationlist = new ArrayList<TD0Organization>();
		String sqlid = "selectTD0Organization";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Organization.class);
		for(Object o:list){
			TD0Organization or = new TD0Organization();
			or.setId(((TD0Organization)o).getId());
			or.setOrgno(((TD0Organization)o).getOrgno());
			or.setOrgcode(((TD0Organization)o).getOrgcode());
			or.setOrgname(((TD0Organization)o).getOrgname());
			or.setExetype(((TD0Organization)o).getExetype());
			or.setLinkadd(((TD0Organization)o).getLinkadd());
			or.setListingdate(((TD0Organization)o).getListingdate());
			or.setStandalonedate(((TD0Organization)o).getStandalonedate());
			or.setAreatype(((TD0Organization)o).getAreatype());
			or.setZbbdocdate(((TD0Organization)o).getZbbdocdate());
			or.setOrglevel(((TD0Organization)o).getOrglevel());
			or.setOrgpro(((TD0Organization)o).getOrgpro());
			or.setZipcode(((TD0Organization)o).getZipcode());
			//or.setSeclist(((TD0Organization)o).getSeclist());
			Organizationlist.add(or);
		}
		return Organizationlist;
	}

}
