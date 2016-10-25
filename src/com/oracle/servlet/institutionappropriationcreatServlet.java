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
import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

public class institutionappropriationcreatServlet extends HttpServlet {

	private selectfinancialByorgidServices creatfinal = new selectfinancialByorgidServicesImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int i;
		String id = Long.toString(System.currentTimeMillis());
		String orgid = req.getParameter("orgid");
		System.out.println(orgid);
		String yearly = req.getParameter("yearly");
		String prefund = req.getParameter("prefund");
		String dutyfund = req.getParameter("dutyfund");
		String businessfund = req.getParameter("businessfund");
		String buildfund = req.getParameter("buildfund");
		List<TD0Fund> flist = new ArrayList<TD0Fund>();
		i = creatfinal.creatfinal(id,yearly,prefund,dutyfund,businessfund,buildfund,orgid);
		if(i!=0){
			flist =creatfinal.findfinal(id);
			req.setAttribute("flist", flist);
		}
		req.getRequestDispatcher("content/mainpage/institution-view.jsp").forward(req,resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
