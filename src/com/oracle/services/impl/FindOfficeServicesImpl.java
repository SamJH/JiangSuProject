package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.FindOfficeServicesDao;
import com.oracle.dao.impl.FindOfficeServicesDaoImpl;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;
import com.oracle.services.FindOfficeServices;

public class FindOfficeServicesImpl implements FindOfficeServices {

	private FindOfficeServicesDao findoffice = new FindOfficeServicesDaoImpl();
	public List<TD0Section> findoTD0Section(String orgid,String divname) {
		
		return findoffice.findTD0Section(orgid, divname);
	}
	public int deletesection(String id) {
		// TODO Auto-generated method stub
		return findoffice.deletesection(id);
	}

}
