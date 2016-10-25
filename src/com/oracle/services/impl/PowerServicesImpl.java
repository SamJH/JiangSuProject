package com.oracle.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.PowerDao;
import com.oracle.dao.impl.PowerDaoImpl;
import com.oracle.po.Power;
import com.oracle.services.PowerServices;

public class PowerServicesImpl implements PowerServices {

	private PowerDao powerDao = new PowerDaoImpl();
	public List<Power> selectPowerByRoleId(int roleId) {
		
		return powerDao.selectPowerByRoleId(roleId);
	}
}
