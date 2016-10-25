package com.oracle.dao.impl;

import com.oracle.dao.UpdatesectionDao;
import com.oracle.po.TD0Section;
import com.oracle.util.JavaTemplet;

public class UpdatesectionDaoImpl implements UpdatesectionDao {

	public int updatesection(String divcode, String divname, String ifsub,
			String dutytel, String fax, String divroomno, String id) {
		int i;
		String sqlid = "upateTD0Section";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Section.class, divcode,divname,ifsub,dutytel,fax,divroomno,id);
		return i;

	}

}
