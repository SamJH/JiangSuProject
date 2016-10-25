package com.oracle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Section;
import com.oracle.services.AddsectionServices;
import com.oracle.services.selectofficeservletService;
import com.oracle.services.impl.AddsectionServicesImpl;
import com.oracle.services.impl.selectofficeservletServiceImpl;

public class AddsectionServlet extends HttpServlet{

	private AddsectionServices addsection = new AddsectionServicesImpl();
	private selectofficeservletService selectsection = new selectofficeservletServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String orgid = req.getParameter("selectOrganization");
		String divcode = req.getParameter("divcode");
		String divname = req.getParameter("divname");
		String ifsub = req.getParameter("ifsub");
		String dutytel = req.getParameter("tutytul");
		String fax = req.getParameter("fax");
		String divroomno = req.getParameter("divroomno");
		String id = Long.toString(System.currentTimeMillis());
		
		
		
		int i = addsection.addsection(id,orgid,divcode,divname,ifsub,dutytel,fax,divroomno);
		
		if(i!=0){
			List<TD0Section> sectionlists = selectsection.selectoffice(id);
			req.setAttribute("sectionlists", sectionlists);
			req.getRequestDispatcher("content/mainpage/office-list.jsp").forward(req, resp);
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
