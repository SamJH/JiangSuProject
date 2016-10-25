package com.oracle.util;

import java.io.File;

public class XmlPath {
	public File getFile(String path){
		return new File(getClass().getClassLoader().getResource(path).getPath());
	}
}
