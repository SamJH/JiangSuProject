package com.oracle.dao;

import java.util.List;

import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;

public interface FindOfficeServicesDao {
	public List<TD0Section> findTD0Section(String orgid,String divname);
	public int deletesection(String id);
}
