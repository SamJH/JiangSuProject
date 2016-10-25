package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectequipmentInfoByorgIdDao;
import com.oracle.dao.impl.selectequipmentInfoByorgIdDaoImpl;
import com.oracle.po.TD0Orgattached;
import com.oracle.services.selectequipmentInfoByorgIdServices;

public class selectequipmentInfoByorgIdServicesImpl implements
		selectequipmentInfoByorgIdServices {

	private selectequipmentInfoByorgIdDao selectequipment = new selectequipmentInfoByorgIdDaoImpl();
	public List<TD0Orgattached> selectequipment(String orgid) {
		
		return selectequipment.selectequipment(orgid);
	}

}
