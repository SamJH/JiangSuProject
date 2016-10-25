package com.oracle.util;

import java.io.File;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.oracle.util.mappingmanager.MappingManager;
import com.oracle.util.pools.DBPools;
import com.oracle.util.pools.PoolConnection;

public class JDBCTemplet {
	
 //单项一对多
	public List<Object> getList(String sqlid,Class clazz, Object...args){
		PoolConnection pc = DBPools.getPoolConnection();
		Connection conn = pc.getConnection();
		List<Object> olist = new ArrayList<Object>();
		XmlPath xmlPath = new XmlPath();
		File filename = xmlPath.getFile(clazz.getName().replace(".", "/")+".xml");
		MappingManager mm = new MappingManager(filename);
		String collectionclass = mm.getCollectionClass();
		String collectionname = mm.getCollectionName();
		String collectioncolumn = mm.getCollectioncolumn();
		Map<String,String> sqlmap = mm.getSqlmap();
		try {
			PreparedStatement ps = conn.prepareStatement(sqlmap.get(sqlid));
			//System.out.println(sqlmap.get(sqlid));
			if(args.length>0){
				for(int i=0;i<args.length;i++){
					ps.setObject(i+1, args[i]);
				}
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Object obj = clazz.newInstance();
				Map<String,String> map = mm.getMap();

				for(String s:map.keySet()){
					String methodstr = "set"+Character.toUpperCase(s.charAt(0))+s.substring(1);
				    Method method = clazz.getDeclaredMethod(methodstr, clazz.getDeclaredField(s).getType());
				    if(clazz.getDeclaredField(s).getType().getSimpleName().equals("String")){
				    	method.invoke(obj, rs.getString(map.get(s)));	
				    }else if(clazz.getDeclaredField(s).getType().getSimpleName().equals("int")){
				    	method.invoke(obj, rs.getInt(map.get(s)));	
				    } 			    
				}
				Map<String,String> collectionmap = mm.getCollectionmap();
				List<Object> collectionlist = new ArrayList<Object>();
				Object objlist = Class.forName(collectionclass).newInstance();
				
				
				for(String s:collectionmap.keySet()){
					String methodstr = "set"+Character.toUpperCase(s.charAt(0))+s.substring(1);
				    Method method = Class.forName(collectionclass).getDeclaredMethod(methodstr, Class.forName(collectionclass).getDeclaredField(s).getType());
				    if(Class.forName(collectionclass).getDeclaredField(s).getType().getSimpleName().equals("String")){
				    	method.invoke(objlist, rs.getString(collectionmap.get(s)));	
				    }else if(Class.forName(collectionclass).getDeclaredField(s).getType().getSimpleName().equals("int")){
				    	method.invoke(objlist, rs.getInt(collectionmap.get(s)));	
				    } 		
				}
				collectionlist.add(objlist);
				String methodstr = "set"+Character.toUpperCase(collectionname.charAt(0))+collectionname.substring(1);
	
				Method method = clazz.getDeclaredMethod(methodstr, List.class);
				method.invoke(obj, collectionlist);
				olist.add(obj);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//处理olist中重复数据
		for(int i=0;i<olist.size()-1;i++){
			
			for(int j=i+1;j<olist.size();j++){
				String methodstr = "get"+Character.toUpperCase(collectioncolumn.charAt(0))+collectioncolumn.substring(1);
				try {
					Method method = clazz.getDeclaredMethod(methodstr);
					String deptid0 = (String)method.invoke(olist.get(i));
					String deptid1 = (String)method.invoke(olist.get(j));
					String method000 = "get"+Character.toUpperCase(collectionname.charAt(0))+collectionname.substring(1);
					if(deptid0.equals(deptid1)){
						Method m = List.class.getDeclaredMethod("addAll", Collection.class);
					    m.invoke(olist.get(i).getClass().getDeclaredMethod(method000).invoke(olist.get(i)),olist.get(j).getClass().getDeclaredMethod(method000).invoke(olist.get(j)));
					    olist.remove(olist.get(j));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 		
			}
			
			
		}
		
		
		return olist;
	}
}
