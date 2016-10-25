package com.oracle.util;

import java.util.ArrayList;
import java.util.List;

public class PageManager {
	int sb = 0;
	int pagesize = 5;//ÿҳ����ʾ����������	
	List<Integer> CurrentPage = new ArrayList<Integer>();//����һ�����浱ǰҳ�������
	
	//���ص����ĵ�ǰҳ��
	public int getpage(String currentpage,int totalsize,List<Integer> CurrentPage){
		
		if(currentpage==null){
			sb=1;
	    }else if(currentpage.equals("��ҳ")){
	    	sb=1;
	    }else if(currentpage.equals("βҳ")){
	    	sb=totalsize;			
	    }else if(currentpage.equals("��һҳ")){
	    	if(CurrentPage.size()==0){
	    		sb = 1;
	    	}else if(CurrentPage.get(CurrentPage.size()-1)==1){
	    		//req.setAttribute("info", "���ǵ�һҳ");
	    		sb=1;
	    	}else{
	    		sb = CurrentPage.get(CurrentPage.size()-1)-1;
	    	}
	       }else if(currentpage.equals("��һҳ")){
	    	   if(CurrentPage.size()==0){
	    		   sb = 2;
	    	   }else if(CurrentPage.get(CurrentPage.size()-1)==totalsize){
	    		//req.setAttribute("infoo", "�������һҳ");
	    		sb=totalsize;
				}else{
	    		sb = CurrentPage.get(CurrentPage.size()-1)+1;
	    		}
	   }else{
		   sb = Integer.parseInt(currentpage);
	   }
	
        return sb;
	}
	//�Żش��ҳ���ļ���
	public int[] getcurrentPage(int totalsize){
		int[] all = new int[totalsize];
		for(int i=0;i<totalsize;i++){
			all[i] = i+1;
		}
		return all;
	}
	//������ҳ��
	public int getTotalsize(int total){
		int totalsize = 0;
		if(total%pagesize==0){
			totalsize = total/pagesize;
		}else{
			totalsize = (total/pagesize)+1;
		}
		return totalsize;
	}
	//���ض����ÿҳ��ʾ����������
	public int getPagesize() {
		return pagesize;
	}
	
	//���ش�ŵ�ǰҳ���ļ���
	public List<Integer> getCurrentPage(int sb) {
		CurrentPage.add(sb);
		return CurrentPage;
	}
}
