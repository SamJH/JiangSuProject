package com.oracle.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.oracle.po.Role;
import com.oracle.util.GetPath.GetString;
import com.oracle.util.mappingmanager.SelectManager;
import com.oracle.util.pools.DBPools;
import com.oracle.util.pools.PoolConnection;

public class JavaTemplet {
	//向表中插入数据-完美
	
	public int updateObject(String sqlid,Class clazz,Object...args){ //这是一个object类型的动态数组，无论几个值，什么类型都能存储
		PoolConnection pc = DBPools.getPoolConnection();//获取DBpools的一个对象
		Connection conn = pc.getConnection();//获取连接
		GetString getstring = new GetString();
		String filename = getstring.getstring(clazz);
		SelectManager selectmanager = new SelectManager(filename);
		Map<String,String> sqlmap = selectmanager.getSqlMap();
		String sql = sqlmap.get(sqlid);//获取实例类xml文件里的字段和sql语句
		//System.out.println(sql);
		int i = 0;
		try {			
			/**
			 * 这里使用预编译PreparedStatement来处理是为了让程序更加直观，同时预编译也能防止sql注入的入侵
			 * 对于程序的安全更加有好处
			 */
			PreparedStatement ps = conn.prepareStatement(sql);
			if(args!=null){
			for(int k=1;k<=args.length;k++){//这里的args.length是object动态对象数组的长度
				ps.setObject(k, args[k-1]);
			   }	
			}
		    i = ps.executeUpdate();//对于增删改使用.execteUpdate()返回执行的条数
		   // System.out.println(i);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			pc.setState(false);//将连接还到连接池中
		}
		//System.out.println(i);
		return i;
	}
	//查询
	 public List<Object> findObject(String sqlid,Class clazz,Object...args){
		 PoolConnection pc = DBPools.getPoolConnection();
		 Connection conn = pc.getConnection();
		 List<Object> list = new ArrayList<Object>();
		 //String filename = "F://cpp/myeclipse cpp/JiangSuProject/src/"+clazz.getName().replace(".", "/")+".xml";
		 GetString getstring = new GetString();
		 String filename = getstring.getstring(clazz);
		 SelectManager selectmanager = new SelectManager(filename);
		 Map<String,String> sqlmap = selectmanager.getSqlMap();
		 String sql = sqlmap.get(sqlid);
		 try {				
			 /**
			  * 为了实现预处理，防止sql注入攻击和让程序更有可读性。
			  */
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int k=1;k<=args.length;k++){
				ps.setObject(k, args[k-1]);//将指定参数设置为给定 Java int值。
			}
			ResultSet rs = ps.executeQuery();//查询语句需要返回一个集合，所以需要使用executeQuery().
			while(rs.next()){
			    Object obj = clazz.newInstance();//多态,实例化反射对象。
			    //获取set方法——先获取属性
			    Field[] fs = clazz.getDeclaredFields();
			    for(Field f:fs){
			   /**.getDeclaredFields()返回 Field 对象的一个数组，这些对象反映此 Class对象所表示的类或接口所声明的所有字段。
			 	 * .getType:返回一个 Class 对象，它标识了此 Field 对象所表示字段的声明类型。
	         	 */
			    	//System.out.println(f.getType().getSimpleName());
			    	String methodname = "set"+Character.toUpperCase(f.getName().charAt(0))+f.getName().substring(1);
			    	Method m = clazz.getMethod(methodname, f.getType());
			        if(f.getType().getSimpleName().equals("int")){
			        	m.invoke(obj, rs.getInt(f.getName()));//invoke()-对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
			        }else if(f.getType().getSimpleName().equals("String")){
			        	m.invoke(obj, rs.getString(f.getName()));
			        }else if(f.getType().getSimpleName().equals("double")){
			        	m.invoke(obj, rs.getDouble(f.getName()));
			        }else if(f.getType().getSimpleName().equals("Date")){
			        	m.invoke(obj, rs.getDate(f.getName()));
			        }
//			        String methodgetname = "get"+Character.toUpperCase(f.getType().getSimpleName().charAt(0))+f.getType().getSimpleName().substring(1);
//			        Method gm = rs.getClass().getMethod(methodgetname, java.lang.String.class);			        
//			        m.invoke(obj, gm.invoke(rs.getClass().newInstance(), f.getName()));
			    }	  
			    list.add(obj);
			}
		} catch (Exception e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			pc.setState(false);
		}
		return list;
	 }

}