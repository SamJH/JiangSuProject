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
import com.oracle.po.TD0Organization;
import com.oracle.services.selectequipmentInfoServices;
import com.oracle.services.impl.selectequipmentInfoServicesImpl;

public class selectequipmentInfoByorgId2Servlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String orgid = req.getParameter("sec");
		String yearly = req.getParameter("secs");
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		selectequipmentInfoServices a = new selectequipmentInfoServicesImpl();
		
		if(orgid==""){
		  orglist = a.selects(yearly);
		}else{
		  orglist = a.selecteuqip(orgid, yearly);
		}
		
		Gson gson = new Gson();
		String str = gson.toJson(orglist);
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
