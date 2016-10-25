package com.oracle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.Role;
import com.oracle.services.RoleServices;
import com.oracle.services.UsersServices;
import com.oracle.services.impl.RoleServicesImpl;
import com.oracle.services.impl.UsersServicesImpl;

public class LoginServlet extends HttpServlet {

	private UsersServices usersServices = new UsersServicesImpl();
	private RoleServices roleServices = new RoleServicesImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int usersId = Integer.parseInt(req.getParameter("username"));
		String usersPassword = req.getParameter("password");
		String result = usersServices.login(usersId, usersPassword, req.getSession());
		if("error".equals(result)){
			req.setAttribute("error", "用户名或密码错误");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			
		}else if("success".equals(result)){
			
			//查询角色
			List<Role> rlist =  roleServices.selectRoleByUsersId(usersId);
			req.setAttribute("rlist", rlist);
			//跳到角色选择页面
			req.getRequestDispatcher("role.jsp").forward(req, resp);
		}else{
			
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
}
