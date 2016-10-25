package com.oracle.services.impl;

import com.oracle.dao.UpdatesectionDao;
import com.oracle.dao.impl.UpdatesectionDaoImpl;
import com.oracle.services.UpdatesctionService;

public class UpdatesctionServiceImpl implements UpdatesctionService {

	private UpdatesectionDao updatesection = new UpdatesectionDaoImpl();
	public int updatesection(String divcode, String divname, String ifsub,
			String dutytel, String fax, String divroomno, String id) {
		return updatesection.updatesection(divcode, divname, ifsub, dutytel, fax, divroomno, id);
	}

}
