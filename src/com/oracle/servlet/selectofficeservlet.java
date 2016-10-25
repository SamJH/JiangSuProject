package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;
import com.oracle.services.selectofficeservletService;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectofficeservletServiceImpl;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;

public class selectofficeservlet extends HttpServlet {
	
	private selectofficeservletService selectsection = new selectofficeservletServiceImpl();
	private selectorgByexetypeServices selectorg = new selectorgByexetypeServicesImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String orgid ;
    
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		
		List<TD0Section> seclist = new ArrayList<TD0Section>();
		
		seclist = selectsection.selectoffice(id);
		
		orgid = seclist.get(0).getOrgid();
		orglist = selectorg.selectorgbyid(orgid);
		req.setAttribute("orgname", orglist.get(0).getOrgname());
		req.setAttribute("seclist", seclist.get(0));
		req.getRequestDispatcher("content/mainpage/office-edit.jsp").forward(req,resp);
		
	}

}
