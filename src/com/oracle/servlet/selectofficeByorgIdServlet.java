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
import com.oracle.po.TD0Section;
import com.oracle.services.selectofficeByorgIdServices;

import com.oracle.services.impl.selectofficeByorgIdServicesImpl;

public class selectofficeByorgIdServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		BufferedReader br = req.getReader();
		String orgid = br.readLine();
		selectofficeByorgIdServices s = new selectofficeByorgIdServicesImpl();
		List<TD0Section> orglist = s.selectofficebyorgid(orgid);
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
