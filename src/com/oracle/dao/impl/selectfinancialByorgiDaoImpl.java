package com.oracle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.selectfinancialByorgiDao;
import com.oracle.po.TD0Fund;
import com.oracle.util.JavaTemplet;

public class selectfinancialByorgiDaoImpl implements selectfinancialByorgiDao {

	public List<TD0Fund> select(String s,String sqlid) {
		List<Object> list = null;
		List<TD0Fund> t = new ArrayList<TD0Fund>();
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Fund.class, s);
		for(Object ts:list){
			TD0Fund a = new TD0Fund();
			a.setId(((TD0Fund)ts).getId());
			a.setOrgname(((TD0Fund)ts).getOrgname());
			a.setOrgid(((TD0Fund)ts).getOrgid());
			a.setOrgno(((TD0Fund)ts).getOrgno());
			a.setOrgcode(((TD0Fund)ts).getOrgcode());
			a.setYearly(((TD0Fund)ts).getYearly());
			a.setPrefund(((TD0Fund)ts).getPrefund());
			a.setBuildfund(((TD0Fund)ts).getBuildfund());
			a.setDutyfund(((TD0Fund)ts).getDutyfund());
			a.setBusinessfund(((TD0Fund)ts).getBusinessfund());
			
			t.add(a);
		}
 		return t;
	}
	public List<TD0Fund> selectfinal(){
		List<Object> list = null;
		List<TD0Fund> flist = new ArrayList<TD0Fund>();
		String sqlid = "selectallfund";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Fund.class);
		for(Object f:list){
			flist.add((TD0Fund)f);
		}
		return flist;
	}
	public int creatfinal(Object... args) {
		int i;
		String sqlid = "insertfund";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Fund.class, args);
		return i;
	}
	public List<TD0Fund> findfinal(String id) {
		List<Object> list = null;
		List<TD0Fund> flist = new ArrayList<TD0Fund>();
		String sqlid = "findfinal";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, TD0Fund.class, id);
		for(Object f:list){
			flist.add((TD0Fund)f);
		}
		return flist;
	}
	public int addfund(Object... args) {
		int i;
		String sqlid = "updatefund";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Fund.class, args);
		return i;
	}
	public int deletefund(String id){
		int i;
		String sqlid = "deletefund";
		JavaTemplet j = new JavaTemplet();
		i = j.updateObject(sqlid, TD0Fund.class, id);
		return i;
	}

}
