package com.oracle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Section;
import com.oracle.services.UpdatesctionService;
import com.oracle.services.selectofficeservletService;
import com.oracle.services.impl.UpdatesctionServiceImpl;
import com.oracle.services.impl.selectofficeservletServiceImpl;

public class UpdatesectionServlet extends HttpServlet{
	private UpdatesctionService updatesection = new UpdatesctionServiceImpl();
    private selectofficeservletService selectsection = new selectofficeservletServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("divid");
		String divname = req.getParameter("divname");
		String divcode = req.getParameter("divcode");
		String ifsub = req.getParameter("ifsub");
		String dutytel = req.getParameter("dutytel");
		String fax = req.getParameter("fax");
		String divroomno = req.getParameter("divroomno");
		
		int i = updatesection.updatesection(divcode, divname, ifsub, dutytel, fax, divroomno, id);
		if(i!=0){
			List<TD0Section> sectionlists = selectsection.selectoffice(id);
			req.setAttribute("sectionlists", sectionlists);
		}else{
			req.setAttribute("updatesection", "¸üÐÂÊ§°Ü");
		}
		req.getRequestDispatcher("content/mainpage/office-list.jsp").forward(req,resp);
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
