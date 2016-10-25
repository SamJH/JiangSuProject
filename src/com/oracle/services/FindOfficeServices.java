package com.oracle.services;

import java.util.List;

import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;

public interface FindOfficeServices {
	
	public List<TD0Section> findoTD0Section(String orgid,String divname);
	public int deletesection(String id) ;

}
