package com.oracle.dao;

import java.util.List;

import com.oracle.po.Power;

public interface PowerDao {

	public List<Power> selectPowerByRoleId(int roleId);
}
