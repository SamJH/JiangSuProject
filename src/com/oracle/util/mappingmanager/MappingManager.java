package com.oracle.util.mappingmanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class MappingManager {

	private Map<String,String> map = new HashMap<String, String>();
	private Map<String,String> collectionmap = new HashMap<String, String>();
	private Map<String,String> sqlmap = new HashMap<String, String>();
	private String collectionClass ;
	private String collectionName;
	private String collectioncolumn ;
	
	public MappingManager(File filepath){
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
						}else if(pe.getName().equals("collection")){
							collectionClass = pe.getAttributeValue("class");
							collectionName = pe.getAttributeValue("property");
							collectioncolumn = pe.getAttributeValue("column");
							List<Element> pclist = pe.getChildren();
							for(Element pc:pclist){
								if(pc.getName().equals("property")){
									collectionmap.put(pc.getAttributeValue("property"), pc.getAttributeValue("column"));
								}
							}
						}
					}		
				}
				else if(e.getName().equals("select")||e.getName().equals("insert")||e.getName().equals("update")||e.getName().equals("delete")){
					sqlmap.put(e.getAttributeValue("id"), e.getText());
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		

	}

	public Map<String, String> getMap() {
		return map;
	}

	public Map<String, String> getCollectionmap() {
		return collectionmap;
	}

	public Map<String, String> getSqlmap() {
		return sqlmap;
	}

	public String getCollectionClass() {
		return collectionClass;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public String getCollectioncolumn() {
		return collectioncolumn;
	}
	
	
}
