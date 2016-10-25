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
	List<Integer> CurrentPage = new ArrayList<Integer>();//����һ�����浱ǰҳ�������
	private PageManager pagemanager = new PageManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int sb = 0;
		int totalsize;
		int pagesize = pagemanager.getPagesize();
		String currentpage = req.getParameter("currentPage");//��ȡǰ�δ����ĵ�ǰҳ��
		
		//����������ѯ����
		List<Power> plist = powerservice.findpower();
		int total = plist.size();//��������
		//������ҳ��������ȡ��ҳ������ҳ���������鷵��ǰ��
	
		totalsize = pagemanager.getTotalsize(total);
		int[] all = new int[totalsize];
		all = pagemanager.getcurrentPage(totalsize);
		pslist=new ArrayList<Power>();
		//�жϵ�ǰҳ���Ƿ�Ϊ�գ���Ϊ�գ���ǰҳ����Ĭ��Ϊ1
		sb = pagemanager.getpage(currentpage, totalsize, CurrentPage);	
		//��ǰ�˴�����ҳ�������жϣ�����ҳ���Լ��Ͻ���ȡֵ���ٷ���ǰ��ҳ�档
		if(sb==0){
			req.setAttribute("info", "������Ϊ����");
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
