package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.Power;
import com.oracle.po.TD0Organization;
import com.oracle.po.TD0Section;
import com.oracle.util.PageManager;

public class SectionPage extends HttpServlet {

	List<TD0Section> sectionlists= new ArrayList<TD0Section>();
	List<Integer> CurrentPage = new ArrayList<Integer>();
	private PageManager pagemanager = new PageManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int sb = 0;
		int totalsize;
		int pagesize = pagemanager.getPagesize();
		String currentpage = req.getParameter("currentPage");//获取前段传来的当前页面
	   // System.out.println(req.getSession().getAttribute("sectionlist"));
		//System.out.println(req.getSession().getAttribute("sectionlist").getClass().getName());
		List<TD0Section> plist =(List<TD0Section>)req.getSession().getAttribute("sectionlist");
		//System.out.println(plist.size());
		//System.out.println(plist);
		
		int total = plist.size();//数据总数
		//计算总页数，并获取总页数，将页数存入数组返回前段
	
		totalsize = pagemanager.getTotalsize(total);
//		int[] all = new int[totalsize];
//		all = pagemanager.getcurrentPage(totalsize);
		sectionlists = new ArrayList<TD0Section>();
		//判断当前页面是否为空，若为空，则当前页面数默认为1
		sb = pagemanager.getpage(currentpage, totalsize, CurrentPage);	
		//System.out.println(sb);
		//对前端传来的页数进行判断，根据页数对集合进行取值，再返回前端页面。
		if(sb==0){
			req.setAttribute("info", "您的行为错误");
		}else if(sb*pagemanager.getPagesize()<total){
		
		 for(int i=(sb-1)*pagesize;i<sb*pagesize;i++){
			 sectionlists.add(plist.get(i));
		}
	   }else{
		
		 for(int i=(sb-1)*pagesize;i<total;i++){
			 sectionlists.add(plist.get(i));
	}
	   }		 
		 
		CurrentPage = pagemanager.getCurrentPage(sb);
		req.setAttribute("CurrentPage", CurrentPage);
		//System.out.println(req.getSession().getAttribute("all").getClass().getName());
		
		req.setAttribute("all", req.getSession().getAttribute("all"));

		req.setAttribute("sectionlists", sectionlists);
		req.getRequestDispatcher("content/mainpage/office-list.jsp").forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
