package com.oracle.services;

import java.util.List;

import com.oracle.po.TD0Organization;

public interface selectorgByexetypeServices {

	public List<TD0Organization> selectorg(String exetype);
	public List<TD0Organization> selectorgs(Object...args);
	public int creatorg(Object...args);
	public int updateorg(Object...args);
	public List<TD0Organization> selectorgbyid(String orgid);
}
