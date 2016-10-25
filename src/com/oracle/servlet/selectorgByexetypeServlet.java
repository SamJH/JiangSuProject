package com.oracle.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.oracle.po.TD0Organization;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;

public class selectorgByexetypeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		BufferedReader br = req.getReader();
		String exetype = br.readLine();
		selectorgByexetypeServices s = new selectorgByexetypeServicesImpl();
		List<TD0Organization> orglist = s.selectorg(exetype);
		//System.out.println(orglist);
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
