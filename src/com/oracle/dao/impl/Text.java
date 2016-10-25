package com.oracle.dao.impl;

import java.util.List;
import java.util.Map;

import com.oracle.dao.UsersDao;
import com.oracle.po.Power;
import com.oracle.po.Role;
import com.oracle.po.Users;
import com.oracle.services.PowerServices;
import com.oracle.services.RoleServices;
import com.oracle.services.UsersServices;
import com.oracle.services.impl.PowerServicesImpl;
import com.oracle.services.impl.RoleServicesImpl;
import com.oracle.services.impl.UsersServicesImpl;
import com.oracle.util.ConfigManager;
import com.oracle.util.JavaTemplet;
import com.oracle.util.mappingmanager.SelectManager;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Text {
	public static void main(String[] args) {
		/*int usersId = 1001;
		Users users = new Users();
		String sqlid = "selectUsers";
		String filename = "src/"+Users.class.getName().replace(".", "/")+".xml";
		SelectManager selectmanager = new SelectManager(filename);
		Map<String,String> sqlmap = selectmanager.getSqlMap();
		String sql = sqlmap.get(sqlid)+Integer.toString(usersId);
		JavaTemplet j = new JavaTemplet();
		List<Object> user = j.findObject(sql, Users.class);
		for(Object o:user){
			users.setUsersId(((Users)o).getUsersId());
			users.setUsersName(((Users)o).getUsersName());
			users.setUsersPassword(((Users)o).getUsersPassword());
			System.out.println(users.getUsersPassword());
		}
		
		String sqlid1 = "selectRole";
		String filename1 = "src/"+Role.class.getName().replace(".", "/")+".xml";
		SelectManager selectmanager1 = new SelectManager(filename1);
		Map<String,String> sqlmap1 = selectmanager1.getSqlMap();
		String sql1 = sqlmap1.get(sqlid1)+Integer.toString(usersId)+")";
		List<Object> role = j.findObject(sql1, Role.class);
		for(Object r:role){
			System.out.println(((Role)r).getRoleId()+","+((Role)r).getRoleName());
		}
		/*int usersId = 1001;
		List<Object> List =null;
		Users user = new Users();
		String sqlid = "selectUsers";
		JavaTemplet j = new JavaTemplet();
		List = j.findObject(sqlid, Users.class);
		for(Object o:List){
			if(((Users)o).getUsersId()==usersId){
				user.setUsersId(((Users)o).getUsersId());
				user.setUsersName(((Users)o).getUsersName());
				user.setUsersPassword(((Users)o).getUsersPassword());
			}
		}
		
		System.out.println(user.getUsersName()+","+user.getUsersPassword());*/
		/*List<Object> list = null;
		User_Role ur = new User_Role();
		String sqlid = "selectUser_role";
		JavaTemplet j = new JavaTemplet();
		list = j.findObject(sqlid, User_Role.class);
		for(Object o:list){
			System.out.println((User_Role)o);
		}*/
		/* int usersId = 1001;
		List<Object> list1 = null;
		List<Object> list2 = null;
		Role role = new Role();
		User_Role ur = new User_Role();
		String sqlid = "selectRole";
		String sqlid1 = "selectUser_role";
		JavaTemplet  j = new JavaTemplet();
		list1 = j.findObject(sqlid, Role.class);
		list2 = j.findObject(sqlid1,User_Role.class);
		for(Object o:list2){
			if(((User_Role)o).getUsersId()==usersId){
				ur.setRoleId(((User_Role)o).getRoleId());
			}
		}
		for(Object r:list1){
			if(((Role)r).getRoleId()==ur.getRoleId()){
				role.setRoleId(((Role)r).getRoleId());
				role.setRoleName(((Role)r).getRoleName());
				System.out.println(role.getRoleName());
			}
		}*/
		
	    /*UsersServices usersServices = new UsersServicesImpl();
		RoleServices roleServices = new RoleServicesImpl();
		PowerServices powerservices = new PowerServicesImpl();
		UsersDao userdao = new UsersDaoImpl();
		
		List<Role> rlist = roleServices.selectRoleByUsersId(1001);
		List<Power> plist = powerservices.selectPowerByRoleId(1);

		for(Role r:rlist){
			System.out.println(((Role)r).getRoleId()+","+((Role)r).getRoleName());
		}
		for(Power p:plist){
			System.out.println(((Power)p).getPowerId()+","+((Power)p).getPowerName()+","+((Power)p).getPowerCode()+","+((Power)p).getPowerUrl());
		}
		UsersDao usersdao = new UsersDaoImpl();
		Users u  = usersdao.selectUsersById(1001);
		System.out.println(u.getUsersName()+","+u.getUsersPassword());*/
		
		/*String sqlid = "addUsers";
		JavaTemplet j = new JavaTemplet();
		int i = j.updateObject(sqlid, Users.class, 1004,"陈奕迅","444");
		if(i>0){
			System.out.println("成功");
		}
		/*String sqlid = "updateUsers";
		JavaTemplet j = new JavaTemplet();
		int i = j.updateObject(sqlid, Users.class, "123",1004);
		if(i>0){
			System.out.println("成功");
		}*/
		String sqlid = "deleteUsers";
		JavaTemplet j = new JavaTemplet();
		int i = j.updateObject(sqlid, Users.class, 1004);
		if(i>0){
			System.out.println("success");
		}

	}
}
