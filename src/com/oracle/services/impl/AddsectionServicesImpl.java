package com.oracle.services.impl;

import com.oracle.dao.AddsectionDao;
import com.oracle.dao.impl.AddsectionDaoImpl;
import com.oracle.services.AddsectionServices;

public class AddsectionServicesImpl implements AddsectionServices {

	private AddsectionDao addsection = new AddsectionDaoImpl();
	public int addsection(String id, String orgid,String divcode, String divname, String ifsub,
			String dutytel, String fax, String divroomno) {

		return addsection.addsection(id,orgid,divcode,divname,ifsub,dutytel,fax,divroomno);
	}

}
