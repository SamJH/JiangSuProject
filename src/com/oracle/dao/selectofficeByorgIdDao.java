package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Section;

public interface selectofficeByorgIdDao {

	public List<TD0Section> selectofficeByorgId(String orgid);
}
