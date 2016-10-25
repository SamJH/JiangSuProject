package com.oracle.services;

import javax.servlet.http.HttpSession;

public interface UsersServices {

	public String login(int usersId,String usersPassword,HttpSession session);
}
