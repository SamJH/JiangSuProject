package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Fund;
import com.oracle.po.TD0Organization;
import com.oracle.services.selectfinancialByorgidServices;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectfinancialByorgidServicesImpl;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;

public class institutionviewServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}
	private selectfinancialByorgidServices selectfina = new selectfinancialByorgidServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		
		selectorgByexetypeServices selectorg = new selectorgByexetypeServicesImpl();
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		List<TD0Fund> flist = new ArrayList<TD0Fund>();
		flist = selectfina.selectfinal();
		
		orglist = selectorg.selectorgbyid(id);
		req.setAttribute("flist", flist);
		req.setAttribute("orglist", orglist.get(0));
		req.getRequestDispatcher("content/mainpage/institution-view.jsp").forward(req,resp);
	}
}
