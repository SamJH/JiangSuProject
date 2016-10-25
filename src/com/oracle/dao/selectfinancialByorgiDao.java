package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Fund;

public interface selectfinancialByorgiDao {
	public List<TD0Fund> select(String s,String sqlid);
	public List<TD0Fund> selectfinal();
	public int creatfinal(Object...args);
	public List<TD0Fund> findfinal(String id);
	public int addfund(Object...args);
	public int deletefund(String id);

}
