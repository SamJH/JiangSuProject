package com.oracle.util.Page;

public class PageProperty {
	
	private static int PAGESIZE;
	private static int CURRENTPAGE;
	private static int TOTALSIZE;
	public static int getPAGESIZE() {
		return PAGESIZE;
	}
	public static void setPAGESIZE(int pAGESIZE) {
		PAGESIZE = pAGESIZE;
	}
	public static int getCURRENTPAGE() {
		return CURRENTPAGE;
	}
	public static void setCURRENTPAGE(int cURRENTPAGE) {
		CURRENTPAGE = cURRENTPAGE;
	}
	public static int getTOTALSIZE() {
		return TOTALSIZE;
	}
	public static void setTOTALSIZE(int tOTALSIZE) {
		TOTALSIZE = tOTALSIZE;
	}
	

}
