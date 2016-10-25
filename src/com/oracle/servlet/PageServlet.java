package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.Power;

import com.oracle.services.Powerservice;
import com.oracle.util.PageManager;

public class PageServlet extends HttpServlet{

	private Powerservice powerservice = new Powerservice();
	List<Power> pslist = new ArrayList<Power>();
	List<Integer> CurrentPage = new ArrayList<Integer>();//定义一个储存当前页面的数组
	private PageManager pagemanager = new PageManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int sb = 0;
		int totalsize;
		int pagesize = pagemanager.getPagesize();
		String currentpage = req.getParameter("currentPage");//获取前段传来的当前页面
		
		//更具条件查询数据
		List<Power> plist = powerservice.findpower();
		int total = plist.size();//数据总数
		//计算总页数，并获取总页数，将页数存入数组返回前段
	
		totalsize = pagemanager.getTotalsize(total);
		int[] all = new int[totalsize];
		all = pagemanager.getcurrentPage(totalsize);
		pslist=new ArrayList<Power>();
		//判断当前页面是否为空，若为空，则当前页面数默认为1
		sb = pagemanager.getpage(currentpage, totalsize, CurrentPage);	
		//对前端传来的页数进行判断，根据页数对集合进行取值，再返回前端页面。
		if(sb==0){
			req.setAttribute("info", "您的行为错误");
		}else if(sb*pagemanager.getPagesize()<total){
		
		 for(int i=(sb-1)*pagesize;i<sb*pagesize;i++){
		   pslist.add(plist.get(i));
		}
	   }else{
		
		 for(int i=(sb-1)*pagesize;i<total;i++){
			pslist.add(plist.get(i));
		}
	   }
		 
		 
		CurrentPage = pagemanager.getCurrentPage(sb);
		req.getSession().setAttribute("CurrentPage", CurrentPage);
		//System.out.println(CurrentPage.get(CurrentPage.size()-1));		
		req.setAttribute("all", all);

		req.setAttribute("pslist", pslist);
		req.getRequestDispatcher("content/mainpage/institution-list.jsp").forward(req, resp);
	   
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
