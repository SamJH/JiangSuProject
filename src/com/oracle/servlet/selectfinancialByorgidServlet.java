package com.oracle.servlet;

import java.io.BufferedReader;
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
import com.oracle.po.TD0Organization;
import com.oracle.services.selectfinancialByorgidServices;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectfinancialByorgidServicesImpl;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;

public class selectfinancialByorgidServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String orgid = req.getParameter("sec");
//		String yearly = req.getParameter("secs");
//		System.out.println(yearly+"ssssssss");
		String sqlid = "selectTD0fundbyorg";
		selectfinancialByorgidServices s = new selectfinancialByorgidServicesImpl();
		List<TD0Fund> finalist = s.selsect(orgid, sqlid);
		//System.out.println(orglist);
//		if(yearly==""){
//			for(TD0Fund f:finalist){
//				flist.add(f);
//			}
//		}else{
//			for(TD0Fund f:finalist){
//				if(f.getYearly().equals(yearly)){
//					flist.add(f);
//				}
//			}
//		}
			
		req.getSession().setAttribute("finalist", finalist);
		
		Gson gson = new Gson();
		//String str = gson.toJson(finalist).toString();
		String str = gson.toJson(finalist).toString();
		PrintWriter pw = resp.getWriter();
		//pw.write("{str:"+str+",strs:"+strs+"}");
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
