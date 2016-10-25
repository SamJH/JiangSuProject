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
	//����в�������-����
	
	public int updateObject(String sqlid,Class clazz,Object...args){ //����һ��object���͵Ķ�̬���飬���ۼ���ֵ��ʲô���Ͷ��ܴ洢
		PoolConnection pc = DBPools.getPoolConnection();//��ȡDBpools��һ������
		Connection conn = pc.getConnection();//��ȡ����
		GetString getstring = new GetString();
		String filename = getstring.getstring(clazz);
		SelectManager selectmanager = new SelectManager(filename);
		Map<String,String> sqlmap = selectmanager.getSqlMap();
		String sql = sqlmap.get(sqlid);//��ȡʵ����xml�ļ�����ֶκ�sql���
		//System.out.println(sql);
		int i = 0;
		try {			
			/**
			 * ����ʹ��Ԥ����PreparedStatement��������Ϊ���ó������ֱ�ۣ�ͬʱԤ����Ҳ�ܷ�ֹsqlע�������
			 * ���ڳ���İ�ȫ�����кô�
			 */
			PreparedStatement ps = conn.prepareStatement(sql);
			if(args!=null){
			for(int k=1;k<=args.length;k++){//�����args.length��object��̬��������ĳ���
				ps.setObject(k, args[k-1]);
			   }	
			}
		    i = ps.executeUpdate();//������ɾ��ʹ��.execteUpdate()����ִ�е�����
		   // System.out.println(i);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			pc.setState(false);//�����ӻ������ӳ���
		}
		//System.out.println(i);
		return i;
	}
	//��ѯ
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
			  * Ϊ��ʵ��Ԥ������ֹsqlע�빥�����ó�����пɶ��ԡ�
			  */
			PreparedStatement ps = conn.prepareStatement(sql);
			for(int k=1;k<=args.length;k++){
				ps.setObject(k, args[k-1]);//��ָ����������Ϊ���� Java intֵ��
			}
			ResultSet rs = ps.executeQuery();//��ѯ�����Ҫ����һ�����ϣ�������Ҫʹ��executeQuery().
			while(rs.next()){
			    Object obj = clazz.newInstance();//��̬,ʵ�����������
			    //��ȡset���������Ȼ�ȡ����
			    Field[] fs = clazz.getDeclaredFields();
			    for(Field f:fs){
			   /**.getDeclaredFields()���� Field �����һ�����飬��Щ����ӳ�� Class��������ʾ�����ӿ��������������ֶΡ�
			 	 * .getType:����һ�� Class ��������ʶ�˴� Field ��������ʾ�ֶε��������͡�
	         	 */
			    	//System.out.println(f.getType().getSimpleName());
			    	String methodname = "set"+Character.toUpperCase(f.getName().charAt(0))+f.getName().substring(1);
			    	Method m = clazz.getMethod(methodname, f.getType());
			        if(f.getType().getSimpleName().equals("int")){
			        	m.invoke(obj, rs.getInt(f.getName()));//invoke()-�Դ���ָ��������ָ����������ɴ� Method �����ʾ�ĵײ㷽����
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