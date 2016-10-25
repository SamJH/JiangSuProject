package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.selectequipmentInfoByorgIdDao;
import com.oracle.po.TD0Orgattached;
import com.oracle.util.JavaTemplet;

public class selectequipmentInfoByorgIdDaoImpl implements
		selectequipmentInfoByorgIdDao {

	public List<TD0Orgattached> selectequipment(String orgid) {
		List<Object> list =null;
		List<TD0Orgattached> orgattached = new ArrayList<TD0Orgattached>();
		String sqlid = "selectTD0TD0Orgattachedbyorgid";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Orgattached.class, orgid);
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
		System.out.println(orgattached);
		return orgattached;
	}

}
