package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Organization;

public interface selectorgByexetypeDao {
	public List<TD0Organization> selectorgbyexetype(String exetype);
	public List<TD0Organization> selectorg(Object...args);
	public int creatorg(Object...args);
	public int updateorg(Object...args);
	public List<TD0Organization> selectorgbyid(String orgid);

}
