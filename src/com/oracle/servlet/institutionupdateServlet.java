package com.oracle.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.po.TD0Organization;
import com.oracle.services.selectequipmentInfoServices;
import com.oracle.services.selectorgByexetypeServices;
import com.oracle.services.impl.selectequipmentInfoServicesImpl;
import com.oracle.services.impl.selectorgByexetypeServicesImpl;

public class institutionupdateServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");
		selectorgByexetypeServices creatorg = new selectorgByexetypeServicesImpl();
		selectequipmentInfoServices createquip = new selectequipmentInfoServicesImpl();
		selectorgByexetypeServices selectorg = new selectorgByexetypeServicesImpl();
		List<TD0Organization> orglist = new ArrayList<TD0Organization>();
		int i;
		int j;
		String orgid = req.getParameter("orgid");
		System.out.println(orgid);
		String orgno = req.getParameter("orgno");
		String orgcode = req.getParameter("orgcode");
		String orgname = req.getParameter("orgname");
		String exetype = req.getParameter("exetype");
		String linkadd = req.getParameter("linkadd");
		String zipcode = req.getParameter("zipcode");
		String areacode = req.getParameter("areacode");
		String listingdate = req.getParameter("listingdate");
		String standalonedate = req.getParameter("standalonedate");
		String areatype = req.getParameter("areatype");
		String orglevel = req.getParameter("orglevel");
		String orgpro = req.getParameter("orgpro");
		String zbbdocdate = req.getParameter("zbbdocdate");
		
		String id = Long.toString(System.currentTimeMillis());
		String onworkernum = req.getParameter("onworkernum");
		String supervisornum = req.getParameter("supervisornum");
		String ifpublicmanage = req.getParameter("ifpublicmanage");
		String retirenum = req.getParameter("retirenum");
		String zbbnum = req.getParameter("zbbnum");
		String buildingownership = req.getParameter("buildingownership");
		String officebuildingarea = req.getParameter("officebuildingarea");
		String officebuildarea = req.getParameter("officebuildarea");
		String fundivcount = req.getParameter("fundivcount");
		String orgcount = req.getParameter("orgcount");
		String businessdivcount = req.getParameter("businessdivcount");
		String equ1count = req.getParameter("equ1count");
		String equ2count = req.getParameter("equ2count");
		String equ3count = req.getParameter("equ3count");
		String buscount = req.getParameter("buscount");
		String rapidtestvehiclecount = req.getParameter("rapidtestvehiclecount");
		String motorcount = req.getParameter("motorcount");
		String cameracount = req.getParameter("cameracount");
		String videocount = req.getParameter("videocount");
		String copycatnum = req.getParameter("copycatnum");
		String computernum = req.getParameter("computernum");
		String notepadnum = req.getParameter("notepadnum");
		String servercount = req.getParameter("servercount");
		String pbxcount = req.getParameter("pbxcount");
		String faxcount = req.getParameter("faxcount");
		String ohpcount = req.getParameter("ohpcount");
		String vrcount = req.getParameter("vrcount");
		i = creatorg.updateorg(orgno,orgcode,orgname,exetype,areacode,linkadd,listingdate,standalonedate,areatype,zbbdocdate,orglevel,orgpro,zipcode,orgid);
		if(i!=0){
			orglist = selectorg.selectorgbyid(orgid);
			req.setAttribute("orglist", orglist);
			req.getRequestDispatcher("content/mainpage/institution-list.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
