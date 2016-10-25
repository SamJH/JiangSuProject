package com.oracle.util.GetPath;

public class GetString {
	public String getstring(Class clazz){
		 String filename1 = clazz.getResource("").toString();
		 String filename2 = filename1.substring(6);
		 String filename3 = clazz.getName().replace(".", "/")+".xml";
		 String filename4 = filename3.substring(14);
		 String filename = filename2+filename4;
		// System.out.println(filename);
		return filename;
		
	}

}
