package com.oracle.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Fund;
import com.oracle.services.selectfinancialByorgidServices;
import com.oracle.services.impl.selectfinancialByorgidServicesImpl;
import com.oracle.util.ExportExcel;

public class DaochuServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String orgid = req.getParameter("orgid");
		String yearly = req.getParameter("yearly");
	
	
		(new ExportExcel()).test(orgid,yearly);
		
		download("e://a.xls",resp);
		//req.getRequestDispatcher("content/mainpage/institution-list.jsp").forward(req, resp);
	}
		 private void download(String path, HttpServletResponse response) {  
		        try {  
		            // path��ָ�����ص��ļ���·����  
		            File file = new File(path);  
		            // ȡ���ļ�����  
		            String filename = file.getName();  
		            // ��������ʽ�����ļ���  
		            InputStream fis = new BufferedInputStream(new FileInputStream(path));  
		            byte[] buffer = new byte[fis.available()];  
		            fis.read(buffer);  
		            fis.close();  
		            // ���response  
		            response.reset();  
		            // ����response��Header  
		            response.addHeader("Content-Disposition", "attachment;filename="  
		                    + new String(filename.getBytes()));  
		            response.addHeader("Content-Length", "" + file.length());  
		            OutputStream toClient = new BufferedOutputStream(  
		                    response.getOutputStream());  
		           // response.setContentType("application/vnd.ms-excel;charset=gb2312"); 
		            response.setContentType("application/vnd.ms-excel;charset=utf-8");
		            toClient.write(buffer);  
		            toClient.flush();  
		            toClient.close();  
		        } catch (IOException ex) {  
		            ex.printStackTrace();  
		        }  
		    }  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
