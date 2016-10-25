package com.oracle.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import com.oracle.dao.UsersDao;
import com.oracle.po.Users;
import com.oracle.util.JavaTemplet;
import com.oracle.util.mappingmanager.SelectManager;

public class UsersDaoImpl implements UsersDao {

	public Users selectUsersById(int usersId) {
		List<Object> List =null;
		Users user = null;
		String sqlid = "selectUsers";
		JavaTemplet j = new JavaTemplet();
		List = j.findObject(sqlid, Users.class,usersId);
		for(Object o:List){
			    user = new Users();
				user.setUsersId(((Users)o).getUsersId());
				user.setUsersName(((Users)o).getUsersName());
				user.setUsersPassword(((Users)o).getUsersPassword());
		}
		return user;
	}
}
