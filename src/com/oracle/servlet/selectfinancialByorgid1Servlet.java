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
import com.oracle.po.TD0Fund;

public class selectfinancialByorgid1Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String yearly = req.getParameter("secs");
		//System.out.println(yearly+"sssss");
		List<TD0Fund> list = new ArrayList<TD0Fund>();
		List<TD0Fund> flist = (List<TD0Fund>)req.getSession().getAttribute("finalist");
		System.out.println(flist);
	
			for(TD0Fund f:flist){
				if(f.getYearly().equals(yearly)){
					list.add(f);
				}
			}
	
 
		Gson gson = new Gson();
		String str = gson.toJson(list);
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
