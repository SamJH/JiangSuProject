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
import com.oracle.po.TD0Section;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;
import com.oracle.util.PageManager;

public class selectorgServlet extends HttpServlet {

	private selectorgByexetypeServices selectorg = new selectorgByexetypeServicesImpl();
	
	private List<TD0Organization> orglist = new ArrayList<TD0Organization>();
	
	List<Integer> CurrentPage = new ArrayList<Integer>();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		List<TD0Organization> newlist = new ArrayList<TD0Organization>();
		List<TD0Organization> newlist1 = new ArrayList<TD0Organization>();
		List<TD0Organization> newlist2 = new ArrayList<TD0Organization>();
		
		String exetype = req.getParameter("select");
		String orgname = req.getParameter("orgname");
		String orgcode = req.getParameter("orgcode");
		String areacode = req.getParameter("areacode");
	
		
		orglist = selectorg.selectorg(exetype);
	
		if(orgname==""){
			for(TD0Organization l:orglist){
				newlist.add(l);
				
			}
		}else{
			for(TD0Organization l:orglist){
				if(l.getOrgname().equals(orgname)){
					newlist.add(l);
					
				}
			}
		}
		
		if(orgcode==""){
		for(TD0Organization l:newlist){
				newlist1.add(l);			
				}
		}else{
			for(TD0Organization l:newlist){
				if(l.getOrgcode().equals(orgcode)){
					newlist1.add(l);
				}
			}
		}
		
		if(areacode==""){
			for(TD0Organization l:newlist1){
				newlist2.add(l);
			}		
			}else{
			for(TD0Organization l:newlist1){
				if(l.getAreacode().equals(areacode)){
					newlist2.add(l);
					}
			}
		}
		System.out.println(newlist2);
	
		Gson gson = new Gson();
		String str = gson.toJson(newlist2);
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
