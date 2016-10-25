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
import com.oracle.po.TD0Orgattached;
import com.oracle.services.selectequipmentInfoByorgIdServices;
import com.oracle.services.selectequipmentInfoServices;
import com.oracle.services.impl.selectequipmentInfoByorgIdServicesImpl;
import com.oracle.services.impl.selectequipmentInfoServicesImpl;

public class selectequipmentInfoByorgIdServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		BufferedReader br = req.getReader();
		String orgid = br.readLine();
		List<TD0Orgattached> orgattachedlist =null;
		selectequipmentInfoByorgIdServices s = new selectequipmentInfoByorgIdServicesImpl();
		selectequipmentInfoServices a = new selectequipmentInfoServicesImpl();
		if(orgid==null){
			orgattachedlist = a.selectequipment();
		}else{
			orgattachedlist = s.selectequipment(orgid);
		}
		System.out.println(orgattachedlist);
		Gson gson = new Gson();
		String str = gson.toJson(orgattachedlist);
		PrintWriter pw = resp.getWriter();
		pw.write(str);
			
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
