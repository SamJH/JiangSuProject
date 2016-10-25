package com.oracle.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;


public class ConfigManager {

	public static String DRIVERNAME;
	public static String URL;
	public static String USERNAME;
	public static String PASSWORD;
	public static int SIZE;
	public static boolean SHOW_SQL;
	
	static{
		
		SAXBuilder sb = new SAXBuilder();
		InputStream file = null;
		try {
			file = new FileInputStream("F://cpp/myeclipse cpp/JiangSuProject/src/com/oracle/config/config.xml");
			 Document document = sb.build(file);
		     Element root = document.getRootElement();
		     List<Element> rootchildren = root.getChildren();
		     for(Element e:rootchildren){
		    	 if(e.getName().equals("dataSource")){
		    		 List<Element> dataSourceList = e.getChildren();
		    		 for(Element e1:dataSourceList){
		    			 if(e1.getAttributeValue("name").equals("driverName")){
		    				 DRIVERNAME = e1.getText();
		    			 }
		    			 if(e1.getAttributeValue("name").equals("url")){
		    				 URL = e1.getText();
		    			 }
		    			 if(e1.getAttributeValue("name").equals("username")){
		    				 USERNAME = e1.getText();
		    			 }
		    			 if(e1.getAttributeValue("name").equals("password")){
		    				 PASSWORD = e1.getText();
		    			 }
		    			 if(e1.getAttributeValue("name").equals("size")){
		    				 SIZE = Integer.parseInt(e1.getText());
		    			 }
		    			 if(e1.getAttributeValue("name").equals("show_sql")){
		    				 SHOW_SQL = Boolean.parseBoolean(e1.getText());
		    			 }
		    		 }
		    		 
		    	 }
		    	 
		     }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}
	
}
