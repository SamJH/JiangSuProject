package com.oracle.services.impl;

import java.util.List;

import com.oracle.dao.RoleDao;
import com.oracle.dao.impl.RoleDaoImpl;
import com.oracle.po.Role;
import com.oracle.services.RoleServices;

public class RoleServicesImpl implements RoleServices {

	private RoleDao roleDao = new RoleDaoImpl();
	public List<Role> selectRoleByUsersId(int usersId) {
		
		return roleDao.selectRoleByUsersId(usersId);
	}

}
