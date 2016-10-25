package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Fund;
import com.oracle.services.selectfinancialByorgidServices;
import com.oracle.services.impl.selectfinancialByorgidServicesImpl;

public class deletefinaServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	private selectfinancialByorgidServices deletefina = new selectfinancialByorgidServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		int i;
		List<TD0Fund> flist = new ArrayList<TD0Fund>();
		i = deletefina.deletefund(id);
		if(i!=0){
			flist = deletefina.selectfinal();
			req.setAttribute("flist", flist);
		}
		req.getRequestDispatcher("content/mainpage/institution-view.jsp").forward(req, resp);
	}

}
