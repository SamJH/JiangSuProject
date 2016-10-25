package com.oracle.services;

import java.util.List;

import com.oracle.po.Power;

public interface PowerServices {

	public List<Power> selectPowerByRoleId(int roleId);
}
