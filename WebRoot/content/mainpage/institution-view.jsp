<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>/content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/content/js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>
  
  <body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
    <h2>&gt;&gt; <a href="<%=basePath %>/content/mainpage/institution-list.jsp">机构管理</a> - 机构信息</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="" method="post">
	  <tr>
            <td width="16%" align="right" class="title"><span class="required">*</span>机构编码：</td>
            <td width="17%" align="left">${orglist.orgno }</td>
            <td width="16%" align="right" class="title"><span class="required">*</span>机构代码：</td>
            <td width="17%" align="left">${orglist.orgcode }</td>
            <td width="16%" class="title" align="right"><span class="required">*</span>机构名称：</td>
            <td width="17%" align="left">${orglist.orgname }</td>
        </tr>
        <tr>
           <td width="15%" align="right" class="title"><span class="required">*</span>行政类别：</td>
            <td width="19%" align="left">
            	${orglist.exetype }</td>
           <td align="right" class="title">行政区划：</td>
            <td align="left" colspan="3">${orglist.areacode }</td>
        </tr>
        <tr>
            <td align="right" class="title">地址：</td>
            <td align="left" colspan="3">${orglist.linkadd }</td>
            <td align="right" class="title">邮编：</td>
            <td align="left">${orglist.zipcode }</td>
        </tr>
        <tr>
            <td align="right" class="title">挂牌日期：</td>
            <td align="left">${orglist.listingdate }</td>
            <td align="right" class="title">独立运行日期：</td>
            <td align="left">${orglist.standalonedate }</td>
            <td align="right" class="title"><span class="required">*</span>行政区类别：</td>
            <td align="left">
            	${orglist.areatype }</td>
        </tr>
        <tr>
            <td align="right" class="title">在职人数：</td>
            <td align="left">500</td>
            <td align="right" class="title">卫生监督员数：</td>
            <td align="left">50</td>
            <td align="right" class="title">编办批文日期：</td>
            <td align="left">${orglist.zbbdocdate }</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>机构行政级别 ：</td>
            <td align="left" >${orglist.orglevel }</td>
            <td align="right" class="title"><span class="required">*</span>机构性质：</td>
            <td align="left">${orglist.orgpro }</td>
            <td align="right" class="title"><span class="required">*</span>编制人数 ：</td>
            <td align="left">120</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>是否参公管理 ：</td>
          <td align="left">是</td>
            <td align="right" class="title"><span class="required">*</span>离退休人数 ：</td>
            <td align="left">100</td>
            <td align="right" class="title"> <span class="required">*</span>办公用房建筑面积（平方米） ：</td>
            <td align="left">1000</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>房屋所有权 ：</td>
            <td align="left">租</td>
            <td align="right" class="title"> 办公用房在建面积（平方米） ：</td>
            <td align="left">800</td>
            <td align="right" class="title"><span class="required">*</span>业务科室数 ：</td>
            <td align="left">60</td>
		</tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span>职能科室数 ：</td>
            <td align="left">120</td>
            <td align="right" class="title"><span class="required">*</span>派出机构数 ：</td>
            <td align="left">350</td>
            <td align="right" class="title"><span class="required">*</span> 检测仪器设备数 ：</td>
            <td align="left">
			9台（一千&lt;价格&lt;一万）<br/>
			5台（一万&lt;价格&lt;十万）<br/>
		  2台（价格大于十万）</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 汽车数（不含快速检测车） ：</td>
            <td align="left">13</td>
            <td align="right" class="title"><span class="required">*</span> 快速检测车数 ：</td>
            <td align="left">10</td>
            <td align="right" class="title"><span class="required">*</span> 摩托车数 ：</td>
            <td align="left">12</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 照相机数

 ：</td>
            <td align="left">50</td>
            <td align="right" class="title"><span class="required">*</span> 摄像机数 ：</td>
            <td align="left">5</td>
            <td align="right" class="title"><span class="required">*</span> 复印机数：</td>
            <td align="left">24</td>
        </tr>
		<tr>
            <td align="right" class="title"><span class="required">*</span> 台式电脑数 ：</td>
            <td align="left">180</td>
            <td align="right" class="title"> <span class="required">*</span>笔记本电脑数 ：</td>
            <td align="left">300</td>
            <td align="right" class="title"><span class="required">*</span> 服务器数 ：</td>
            <td align="left">18</td>
        </tr>
		<tr>
            <td align="right" class="title"> <span class="required">*</span>交换机数 ：</td>
            <td align="left">6</td>
            <td align="right" class="title"> <span class="required">*</span>传真机数 ：</td>
            <td align="left">10</td>
            <td align="right" class="title"> <span class="required">*</span>投影仪数

 ：</td>
            <td align="left">20</td>
        </tr>
      
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><a href="content/mainpage/institution-update.jsp?id=${orglist.id }" title="修改" class="btnShort">修改</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
      </form>
    
    <div class="commonToolBar">
    	<a href="<%=basePath %>/content/mainpage/institution-appropriation-creat.jsp?orgid=${orglist.id}" title="机构创建" class="btnNormal rt1st">添加拨款</a>
    </div>
    <!--//commonToolBar-->
   	<div class="commonTitle">
    	    <h2>&gt;&gt; 机构财政拨款</h2></div>
   	<!--//commonTableSearch-->
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th>年度</th>
            <th width="20%">人员经费（万元）</th>
            <th width="20%">公务费（万元）</th>
            <th width="20%">业务经费（万元）</th>
            <th width="20%">基本建设资金（万元）</th>
            <th class="editColS">编辑</th>
             
        </tr>
        <c:forEach items="${flist }" var="list">
        <tr>
            <td>${list.yearly }</td>
            <td width="20%">${list.prefund }</td>
            <td width="20%">${list.dutyfund }</td>
            <td width="20%">${list.businessfund }</td>
            <td width="20%">${list.buildfund }</td>
            <td align="center">
            	<a href="<%=basePath %>institutionappropriationedit?id=${list.id}" class="btnIconEdit" title="更新"></a>
                <a href="<%=basePath %>deletefina?id=${list.id}" class="btnIconDel" title="删除"></a>
            </td>
          </tr>  
        </c:forEach>
    </table>
    <!--//commonTable-->
   
</div>
    <!--//commonToolBar-->
   	
<!--//content pages wrap-->
</body>
</html>
