package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectequipmentInfoDao;
import com.oracle.dao.impl.selectequipmentInfoDaoImpl;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Orgattached;
import com.oracle.services.selectequipmentInfoServices;

public class selectequipmentInfoServicesImpl implements
		selectequipmentInfoServices {

	private selectequipmentInfoDao s = new selectequipmentInfoDaoImpl();
	public List<TD0Orgattached> selectequipment() {
		// TODO Auto-generated method stub
		return s.selectequipment();
	}
	public List<TD0Organization> selecteuqipments(String orgid) {
		// TODO Auto-generated method stub
		return s.selectequipments(orgid);
	}
	public List<TD0Organization> selecteuq() {
		// TODO Auto-generated method stub
		return s.selecteequ();
	}
	public List<TD0Organization> selects(String yearly) {
		// TODO Auto-generated method stub
		return s.selects(yearly);
	}
	public List<TD0Organization> selecteuqip(String orgid, String yearly) {
		// TODO Auto-generated method stub
		return s.selecteuqip(orgid, yearly);
	}
	public int createquipment(Object... args) {
		// TODO Auto-generated method stub
		return s.createquipment(args);
	}

}
