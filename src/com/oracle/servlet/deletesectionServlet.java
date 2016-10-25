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
import com.oracle.po.TD0Section;
import com.oracle.services.FindOfficeServices;
import com.oracle.services.selectofficeByorgIdServices;
import com.oracle.services.selectofficeservletService;
import com.oracle.services.impl.FindOfficeServicesImpl;
import com.oracle.services.impl.selectofficeByorgIdServicesImpl;
import com.oracle.services.impl.selectofficeservletServiceImpl;

public class deletesectionServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	private FindOfficeServices deletesec = new FindOfficeServicesImpl();
    private selectofficeservletService findorg = new selectofficeservletServiceImpl();
	private selectofficeByorgIdServices findsection = new selectofficeByorgIdServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String orgid;
		String id = req.getParameter("id");
		
		int i;
		List<TD0Section> seclist = new ArrayList<TD0Section>();
		orgid = findorg.selectoffice(id).get(0).getOrgid();
		i = deletesec.deletesection(id);
		
		if(i!=0){
			seclist = findsection.selectofficebyorgid(orgid);
			req.setAttribute("sectionlists", seclist);
		}
		req.getRequestDispatcher("office-list.jsp").forward(req,resp);
	}
}
