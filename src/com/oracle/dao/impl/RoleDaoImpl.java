package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.oracle.dao.RoleDao;
import com.oracle.po.Role;

import com.oracle.po.Users;
import com.oracle.util.JavaTemplet;
import com.oracle.util.mappingmanager.SelectManager;

public class RoleDaoImpl implements RoleDao {

	public List<Role> selectRoleByUsersId(int usersId) {
		List<Object> list = null;
		List<Role> rlist = new ArrayList<Role>();
		String sqlid = "selectRole";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, Role.class,usersId);
		for(Object r:list){
			Role rs = new Role();
			rs.setRoleId(((Role)r).getRoleId());
			rs.setRoleName(((Role)r).getRoleName());
			rlist.add(rs);
		}
		return rlist;
	}
}




