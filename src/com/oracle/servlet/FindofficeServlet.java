package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.oracle.dao.impl.dao;
import com.oracle.po.Power;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;
import com.oracle.services.FindOfficeServices;
import com.oracle.services.impl.FindOfficeServicesImpl;
import com.oracle.util.PageManager;

public class FindofficeServlet extends HttpServlet{
	
	private FindOfficeServices findoffice = new FindOfficeServicesImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String orgid = req.getParameter("orgid");
		String divname = req.getParameter("divname");
		
		List<TD0Section> sectionlist = findoffice.findoTD0Section(orgid, divname);
		
		
		Gson gson = new Gson();
		String str = gson.toJson(sectionlist);
		PrintWriter pw = resp.getWriter();
		pw.write(str);
		pw.flush();
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
