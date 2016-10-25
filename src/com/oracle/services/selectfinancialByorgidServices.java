package com.oracle.services;

import java.util.List;

import com.oracle.po.TD0Fund;

public interface selectfinancialByorgidServices {

	public List<TD0Fund> selsect(String s,String sqlid);
	public List<TD0Fund> selectfinal();
	public int creatfinal(Object... args);
	public List<TD0Fund> findfinal(String id);
	public int addfund(Object... args);
	public int deletefund(String id);
}
