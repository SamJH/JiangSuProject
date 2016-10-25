package com.oracle.util;

import java.util.ArrayList;
import java.util.List;

public class PageManager {
	int sb = 0;
	int pagesize = 5;//每页所显示的数据条数	
	List<Integer> CurrentPage = new ArrayList<Integer>();//定义一个储存当前页面的数组
	
	//返回点击后的当前页数
	public int getpage(String currentpage,int totalsize,List<Integer> CurrentPage){
		
		if(currentpage==null){
			sb=1;
	    }else if(currentpage.equals("首页")){
	    	sb=1;
	    }else if(currentpage.equals("尾页")){
	    	sb=totalsize;			
	    }else if(currentpage.equals("上一页")){
	    	if(CurrentPage.size()==0){
	    		sb = 1;
	    	}else if(CurrentPage.get(CurrentPage.size()-1)==1){
	    		//req.setAttribute("info", "已是第一页");
	    		sb=1;
	    	}else{
	    		sb = CurrentPage.get(CurrentPage.size()-1)-1;
	    	}
	       }else if(currentpage.equals("下一页")){
	    	   if(CurrentPage.size()==0){
	    		   sb = 2;
	    	   }else if(CurrentPage.get(CurrentPage.size()-1)==totalsize){
	    		//req.setAttribute("infoo", "已是最后一页");
	    		sb=totalsize;
				}else{
	    		sb = CurrentPage.get(CurrentPage.size()-1)+1;
	    		}
	   }else{
		   sb = Integer.parseInt(currentpage);
	   }
	
        return sb;
	}
	//放回存放页数的集合
	public int[] getcurrentPage(int totalsize){
		int[] all = new int[totalsize];
		for(int i=0;i<totalsize;i++){
			all[i] = i+1;
		}
		return all;
	}
	//返回总页数
	public int getTotalsize(int total){
		int totalsize = 0;
		if(total%pagesize==0){
			totalsize = total/pagesize;
		}else{
			totalsize = (total/pagesize)+1;
		}
		return totalsize;
	}
	//返回定义的每页显示的数据条数
	public int getPagesize() {
		return pagesize;
	}
	
	//返回存放当前页数的集合
	public List<Integer> getCurrentPage(int sb) {
		CurrentPage.add(sb);
		return CurrentPage;
	}
}
