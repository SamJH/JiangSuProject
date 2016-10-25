package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectofficeservletDao;
import com.oracle.dao.impl.selectofficeservletDaoIm;
import com.oracle.po.TD0Section;
import com.oracle.services.selectofficeservletService;

public class selectofficeservletServiceImpl implements
		selectofficeservletService {

	selectofficeservletDao ss = new selectofficeservletDaoIm();
	public List<TD0Section> selectoffice(String id) {
		// TODO Auto-generated method stub
		return ss.selectoffice(id);
	}

}
