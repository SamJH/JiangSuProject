package com.oracle.dao;

import java.util.List;

import com.oracle.po.Role;

public interface RoleDao {

	public List<Role> selectRoleByUsersId(int usersId);
}
