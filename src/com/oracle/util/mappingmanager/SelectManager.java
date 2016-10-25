package com.oracle.util.mappingmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class SelectManager {
	private Map<String,String> map = new HashMap<String,String>();
	private Map<String,String> sqlMap = new HashMap<String,String>();
	public Map<String, String> getMap() {
		return map;
	}
	public Map<String, String> getSqlMap() {
		return sqlMap;
	}
	
	public SelectManager(String filepath){
		SAXBuilder sb = new SAXBuilder();
		InputStream file = null;
		
		try {
			file = new FileInputStream(filepath);
			Document document = sb.build(file);
			Element root = document.getRootElement();
			List<Element> rootchildren = root.getChildren();
			for(Element e:rootchildren){
				if(e.getName().equals("map")){
					List<Element> propertylist = e.getChildren();
					for(Element pe:propertylist){
						if(pe.getName().equals("property")){
							map.put(pe.getAttributeValue("property"), pe.getAttributeValue("column"));
						}
					}
				}
				else if(e.getName().equals("select")||e.getName().equals("insert")||e.getName().equals("update")||e.getName().equals("delete")){
					sqlMap.put(e.getAttributeValue("id"), e.getText());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
