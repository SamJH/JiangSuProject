package com.oracle.services.impl;

import javax.servlet.http.HttpSession;

import com.oracle.dao.UsersDao;
import com.oracle.dao.impl.UsersDaoImpl;
import com.oracle.po.Users;
import com.oracle.services.UsersServices;

public class UsersServicesImpl implements UsersServices {

	private UsersDao userDao = new UsersDaoImpl();
	
	public String login(int usersId, String usersPassword,
			HttpSession session) {
		
	    Users user = userDao.selectUsersById(usersId);
	    String result = "error";
	    if(user!=null){
	    	if(usersPassword.equals(user.getUsersPassword())){
	    		result = "success";
	    		session.setAttribute("currentUser", user);
	    	}
	    }
		return result;
	}

}
