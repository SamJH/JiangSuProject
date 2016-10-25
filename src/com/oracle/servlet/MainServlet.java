package com.oracle.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.Power;
import com.oracle.po.TD0Organization;
import com.oracle.services.FindorganizationServices;
import com.oracle.services.PowerServices;
import com.oracle.services.impl.FindorganizationServicesImpl;
import com.oracle.services.impl.PowerServicesImpl;

public class MainServlet extends HttpServlet {

	private  PowerServices powerServices = new PowerServicesImpl();
	private FindorganizationServices findorg = new FindorganizationServicesImpl();
	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		arg0.setCharacterEncoding("utf-8");
		int roleId = Integer.parseInt(arg0.getParameter("sel"));
		List<Power> plist = powerServices.selectPowerByRoleId(roleId);
		List<TD0Organization> Organizationlist = findorg.selectOrganization();
		
//		for(TD0Organization org:Organizationlist){
//			System.out.println(org.getId()+","+org.getOrgname());
//		}
		
		
		arg0.getSession().setAttribute("Organizationlist", Organizationlist);
		arg0.getSession().setAttribute("plist", plist);
		arg0.getRequestDispatcher("content/main.jsp").forward(arg0, arg1);
	}
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		this.doPost(arg0, arg1);
	}
}
