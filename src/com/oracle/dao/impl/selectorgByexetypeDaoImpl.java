package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.registry.infomodel.Organization;

import com.oracle.dao.selectorgByexetypeDao;
import com.oracle.po.TD0Organization;
import com.oracle.util.JavaTemplet;

public class selectorgByexetypeDaoImpl implements selectorgByexetypeDao {
	
	public List<TD0Organization> selectorgbyid(String orgid){
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorg5";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Organization.class, orgid);
		for(Object l:list){
			TD0Organization org = new TD0Organization();
			org.setId(((TD0Organization)l).getId());
			org.setOrgno(((TD0Organization)l).getOrgno());
			org.setOrgcode(((TD0Organization)l).getOrgcode());
			org.setOrgname(((TD0Organization)l).getOrgname());
			org.setExetype(((TD0Organization)l).getExetype());
			org.setAreatype(((TD0Organization)l).getAreatype());
			org.setAreacode(((TD0Organization)l).getAreacode());
			org.setLinkadd(((TD0Organization)l).getLinkadd());
			org.setListingdate(((TD0Organization)l).getListingdate());
			org.setStandalonedate(((TD0Organization)l).getStandalonedate());
			org.setZbbdocdate(((TD0Organization)l).getZbbdocdate());
			org.setOrglevel(((TD0Organization)l).getOrglevel());
			org.setOrgpro(((TD0Organization)l).getOrgpro());
			org.setZipcode(((TD0Organization)l).getZipcode());
			orglist.add(org);
		}
		//System.out.println(orglist);
		return orglist;
	}

	public List<TD0Organization> selectorgbyexetype(String exetype) {
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorgByexetype";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Organization.class, exetype);
		for(Object l:list){
			TD0Organization org = new TD0Organization();
			org.setId(((TD0Organization)l).getId());
			org.setOrgno(((TD0Organization)l).getOrgno());
			org.setOrgcode(((TD0Organization)l).getOrgcode());
			org.setOrgname(((TD0Organization)l).getOrgname());
			org.setExetype(((TD0Organization)l).getExetype());
			org.setAreatype(((TD0Organization)l).getAreatype());
			org.setAreacode(((TD0Organization)l).getAreacode());
			org.setLinkadd(((TD0Organization)l).getLinkadd());
			org.setListingdate(((TD0Organization)l).getListingdate());
			org.setStandalonedate(((TD0Organization)l).getStandalonedate());
			org.setZbbdocdate(((TD0Organization)l).getZbbdocdate());
			org.setOrglevel(((TD0Organization)l).getOrglevel());
			org.setOrgpro(((TD0Organization)l).getOrgpro());
			org.setZipcode(((TD0Organization)l).getZipcode());
			orglist.add(org);
		}
		//System.out.println(orglist);
		return orglist;
	}
	public List<TD0Organization> selectorg(Object...args){
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorgs";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Organization.class, args);
		for(Object l:list){
			TD0Organization org = new TD0Organization();
			org.setId(((TD0Organization)l).getId());
			org.setOrgno(((TD0Organization)l).getOrgno());
			org.setOrgcode(((TD0Organization)l).getOrgcode());
			org.setOrgname(((TD0Organization)l).getOrgname());
			org.setExetype(((TD0Organization)l).getExetype());
			org.setAreatype(((TD0Organization)l).getAreatype());
			org.setAreacode(((TD0Organization)l).getAreacode());
			org.setLinkadd(((TD0Organization)l).getLinkadd());
			org.setListingdate(((TD0Organization)l).getListingdate());
			org.setStandalonedate(((TD0Organization)l).getStandalonedate());
			org.setZbbdocdate(((TD0Organization)l).getZbbdocdate());
			org.setOrglevel(((TD0Organization)l).getOrglevel());
			org.setOrgpro(((TD0Organization)l).getOrgpro());
			org.setZipcode(((TD0Organization)l).getZipcode());
			orglist.add(org);
		}
		
		return orglist;
		
	}
	public int creatorg(Object... args) {
		int i;
		String sqlid = "insertintorg";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Organization.class, args);
		return i;
	}
	public int updateorg(Object...args){
		int i; 
		String sqlid = "updateorg";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Organization.class, args);
		return i;
	}


}
