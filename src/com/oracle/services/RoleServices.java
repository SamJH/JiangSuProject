package com.oracle.services;

import java.util.List;

import com.oracle.po.Role;

public interface RoleServices {

	public List<Role> selectRoleByUsersId(int usersId);
}
