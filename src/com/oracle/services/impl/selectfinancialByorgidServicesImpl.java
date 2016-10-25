package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.selectfinancialByorgiDao;
import com.oracle.dao.impl.selectfinancialByorgiDaoImpl;
import com.oracle.po.TD0Fund;
import com.oracle.services.selectfinancialByorgidServices;

public class selectfinancialByorgidServicesImpl implements
		selectfinancialByorgidServices {

	private selectfinancialByorgiDao selectfinanacial = new selectfinancialByorgiDaoImpl();
	public List<TD0Fund> selsect(String s, String sqlid) {
		
		return selectfinanacial.select(s, sqlid);
	}
	public List<TD0Fund> selectfinal() {
		// TODO Auto-generated method stub
		return selectfinanacial.selectfinal();
	}
	public int creatfinal(Object... args) {
		// TODO Auto-generated method stub
		return selectfinanacial.creatfinal(args);
	}
	public List<TD0Fund> findfinal(String id) {
		// TODO Auto-generated method stub
		return selectfinanacial.findfinal(id);
	}
	public int addfund(Object... args) {
		// TODO Auto-generated method stub
		return selectfinanacial.addfund(args);
	}
	public int deletefund(String id) {
		// TODO Auto-generated method stub
		return selectfinanacial.deletefund(id);
	}

}
