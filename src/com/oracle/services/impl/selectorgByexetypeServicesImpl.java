package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectorgByexetypeDao;
import com.oracle.dao.impl.selectorgByexetypeDaoImpl;
import com.oracle.po.TD0Organization;
import com.oracle.services.selectorgByexetypeServices;

public class selectorgByexetypeServicesImpl implements
		selectorgByexetypeServices {

	private selectorgByexetypeDao org = new selectorgByexetypeDaoImpl();
	public List<TD0Organization> selectorg(String exetype) {

		return org.selectorgbyexetype(exetype);
	}
	public List<TD0Organization> selectorgs(Object... args) {
		// TODO Auto-generated method stub
		return org.selectorg(args);
	}
	public int creatorg(Object... args) {
		// TODO Auto-generated method stub
		return org.creatorg(args);
	}
	public List<TD0Organization> selectorgbyid(String orgid) {
		// TODO Auto-generated method stub
		return org.selectorgbyid(orgid);
	}
	public int updateorg(Object... args) {
		// TODO Auto-generated method stub
		return org.updateorg(args);
	}

}
