package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectofficeByorgIdDao;
import com.oracle.dao.impl.selectofficeByorgIdDaoImpl;
import com.oracle.po.TD0Section;
import com.oracle.services.selectofficeByorgIdServices;

public class selectofficeByorgIdServicesImpl implements
		selectofficeByorgIdServices {

	private selectofficeByorgIdDao s = new selectofficeByorgIdDaoImpl();
	public List<TD0Section> selectofficebyorgid(String orgid) {
		
		return s.selectofficeByorgId(orgid);
	}

}
