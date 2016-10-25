package com.oracle.services;

import java.util.List;

import com.oracle.dao.impl.Powerdao;
import com.oracle.po.Power;

public class Powerservice {
	public List<Power> findpower(){
		Powerdao powerdao = new Powerdao();
		List<Power> plist = powerdao.findPower();
		return plist;
	}

}
