package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.selectequipmentInfoDao;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Orgattached;
import com.oracle.util.JDBCTemplet;
import com.oracle.util.JavaTemplet;

public class selectequipmentInfoDaoImpl implements selectequipmentInfoDao {

	public List<TD0Orgattached> selectequipment() {
		List<Object> list = null;
		List<TD0Orgattached> orgattached = new ArrayList<TD0Orgattached>();
		String sqlid = "selectTD0TD0Orgattached";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Orgattached.class);
		for(Object t:list){
			TD0Orgattached a = new TD0Orgattached();
			a.setId(((TD0Orgattached)t).getId());
			a.setOrgid(((TD0Orgattached)t).getOrgid());
			a.setOrgname(((TD0Orgattached)t).getOrgname());
			a.setOrgno(((TD0Orgattached)t).getOrgno());
			a.setOrgcode(((TD0Orgattached)t).getOrgcode());
			a.setOnworkernum(((TD0Orgattached)t).getOnworkernum());
			a.setSupervisornum(((TD0Orgattached)t).getSupervisornum());
			a.setZbbnum(((TD0Orgattached)t).getZbbnum());
			a.setIfpublicmanage(((TD0Orgattached)t).getIfpublicmanage());
			a.setRetirenum(((TD0Orgattached)t).getRetirenum());
			a.setOfficebuildarea(((TD0Orgattached)t).getOfficebuildarea());
			a.setBuildingownership(((TD0Orgattached)t).getBuildingownership());
			a.setOfficebuildingarea(((TD0Orgattached)t).getOfficebuildingarea());
			a.setBusinessdivcount(((TD0Orgattached)t).getBusinessdivcount());
			a.setFundivcount(((TD0Orgattached)t).getFundivcount());
			a.setOrgcount(((TD0Orgattached)t).getOrgcount());
			a.setEqu1count(((TD0Orgattached)t).getEqu1count());
			a.setEqu2count(((TD0Orgattached)t).getEqu2count());
			a.setEqu3count(((TD0Orgattached)t).getEqu3count());
			a.setBuscount(((TD0Orgattached)t).getBuscount());
			a.setRapidtestvehiclecount(((TD0Orgattached)t).getRapidtestvehiclecount());
			a.setMotorcount(((TD0Orgattached)t).getMotorcount());
			a.setCameracount(((TD0Orgattached)t).getCameracount());
			a.setVideocount(((TD0Orgattached)t).getVideocount());
			a.setCopycatnum(((TD0Orgattached)t).getCopycatnum());
			a.setComputernum(((TD0Orgattached)t).getComputernum());
			a.setNotepadnum(((TD0Orgattached)t).getNotepadnum());
			a.setServercount(((TD0Orgattached)t).getServercount());
			a.setPbxcount(((TD0Orgattached)t).getPbxcount());
			a.setFaxcount(((TD0Orgattached)t).getFaxcount());
			a.setOhpcount(((TD0Orgattached)t).getOhpcount());
			a.setYearly(((TD0Orgattached)t).getYearly());
			a.setVrcount(((TD0Orgattached)t).getVrcount());
			orgattached.add(a);
		}
		return orgattached;
	}

	public List<TD0Organization> selectequipments(String orgid) {
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorgByid";
		JDBCTemplet j = new JDBCTemplet();
		list = j.getList(sqlid, TD0Organization.class, orgid);
		for(Object o:list){
			TD0Organization a = new TD0Organization();
			a.setId(((TD0Organization)o).getId());
			a.setOrgno(((TD0Organization)o).getOrgno());
			a.setOrgcode(((TD0Organization)o).getOrgcode());
			a.setOrgname(((TD0Organization)o).getOrgname());
			a.setExetype(((TD0Organization)o).getExetype());
			a.setAreacode(((TD0Organization)o).getAreacode());
			a.setLinkadd(((TD0Organization)o).getLinkadd());
			a.setListingdate(((TD0Organization)o).getListingdate());
			a.setStandalonedate(((TD0Organization)o).getStandalonedate());
			a.setAreatype(((TD0Organization)o).getAreatype());
			a.setZbbdocdate(((TD0Organization)o).getZbbdocdate());
			a.setOrglevel(((TD0Organization)o).getOrglevel());
			a.setOrgpro(((TD0Organization)o).getOrgpro());
			a.setZipcode(((TD0Organization)o).getZipcode());
			a.setOrgattachedlist(((TD0Organization)o).getOrgattachedlist());
			orglist.add(a);
		}
		//System.out.println(orglist);
		return orglist;
	}

	public List<TD0Organization> selecteequ() {
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorg";
		JDBCTemplet j = new JDBCTemplet();
		list = j.getList(sqlid, TD0Organization.class);
		for(Object o:list){
			TD0Organization a = new TD0Organization();
			a.setId(((TD0Organization)o).getId());
			a.setOrgno(((TD0Organization)o).getOrgno());
			a.setOrgcode(((TD0Organization)o).getOrgcode());
			a.setOrgname(((TD0Organization)o).getOrgname());
			a.setExetype(((TD0Organization)o).getExetype());
			a.setAreacode(((TD0Organization)o).getAreacode());
			a.setLinkadd(((TD0Organization)o).getLinkadd());
			a.setListingdate(((TD0Organization)o).getListingdate());
			a.setStandalonedate(((TD0Organization)o).getStandalonedate());
			a.setAreatype(((TD0Organization)o).getAreatype());
			a.setZbbdocdate(((TD0Organization)o).getZbbdocdate());
			a.setOrglevel(((TD0Organization)o).getOrglevel());
			a.setOrgpro(((TD0Organization)o).getOrgpro());
			a.setZipcode(((TD0Organization)o).getZipcode());
			a.setOrgattachedlist(((TD0Organization)o).getOrgattachedlist());
			orglist.add(a);
		}
		return orglist;
	}
	public List<TD0Organization> selects(String yearly){
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorg1";
		JDBCTemplet j = new JDBCTemplet();
		list = j.getList(sqlid, TD0Organization.class, yearly);
		for(Object o:list){
			TD0Organization a = new TD0Organization();
			a.setId(((TD0Organization)o).getId());
			a.setOrgno(((TD0Organization)o).getOrgno());
			a.setOrgcode(((TD0Organization)o).getOrgcode());
			a.setOrgname(((TD0Organization)o).getOrgname());
			a.setExetype(((TD0Organization)o).getExetype());
			a.setAreacode(((TD0Organization)o).getAreacode());
			a.setLinkadd(((TD0Organization)o).getLinkadd());
			a.setListingdate(((TD0Organization)o).getListingdate());
			a.setStandalonedate(((TD0Organization)o).getStandalonedate());
			a.setAreatype(((TD0Organization)o).getAreatype());
			a.setZbbdocdate(((TD0Organization)o).getZbbdocdate());
			a.setOrglevel(((TD0Organization)o).getOrglevel());
			a.setOrgpro(((TD0Organization)o).getOrgpro());
			a.setZipcode(((TD0Organization)o).getZipcode());
			a.setOrgattachedlist(((TD0Organization)o).getOrgattachedlist());
			orglist.add(a);
		}
		return orglist;
	} 
	public List<TD0Organization> selecteuqip(String orgid,String yearly){
		List<Object> list = null;
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		String sqlid = "selectorg2";
		JDBCTemplet j = new JDBCTemplet();
		list = j.getList(sqlid,TD0Organization.class , orgid,yearly);
		for(Object o:list){
			TD0Organization a = new TD0Organization();
			a.setId(((TD0Organization)o).getId());
			a.setOrgno(((TD0Organization)o).getOrgno());
			a.setOrgcode(((TD0Organization)o).getOrgcode());
			a.setOrgname(((TD0Organization)o).getOrgname());
			a.setExetype(((TD0Organization)o).getExetype());
			a.setAreacode(((TD0Organization)o).getAreacode());
			a.setLinkadd(((TD0Organization)o).getLinkadd());
			a.setListingdate(((TD0Organization)o).getListingdate());
			a.setStandalonedate(((TD0Organization)o).getStandalonedate());
			a.setAreatype(((TD0Organization)o).getAreatype());
			a.setZbbdocdate(((TD0Organization)o).getZbbdocdate());
			a.setOrglevel(((TD0Organization)o).getOrglevel());
			a.setOrgpro(((TD0Organization)o).getOrgpro());
			a.setZipcode(((TD0Organization)o).getZipcode());
			a.setOrgattachedlist(((TD0Organization)o).getOrgattachedlist());
			orglist.add(a);
		}
		return orglist;
	}

	public int createquipment(Object... args) {
		int i;
		String sqlid = "creatOrgattached";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Orgattached.class, args);
		return i;
	}

}
