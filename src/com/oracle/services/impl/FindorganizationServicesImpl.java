package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.TD0OrganizationDao;
import com.oracle.dao.impl.TD0OrganizationDaoImpl;
import com.oracle.po.TD0Organization;
import com.oracle.services.FindorganizationServices;

public class FindorganizationServicesImpl implements FindorganizationServices {

	private TD0OrganizationDao org = new TD0OrganizationDaoImpl();
	public List<TD0Organization> selectOrganization() {
		
		return org.selectTD0Organization();
	}

}
