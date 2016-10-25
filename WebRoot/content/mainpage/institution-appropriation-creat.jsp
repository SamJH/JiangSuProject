<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
        <h2>&gt;&gt; <a href="institution-list.jsp">机构管理</a> - 机构财政拨款</h2></div>
         <form id="institutionCreat" name="institutionCreat" action="<%=basePath %>institutionappropriationcreat" method="post">
         <input type="hidden" name="orgid" value="<%=request.getParameter("orgid") %>">
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
       
        <tr>
            <td rowspan="2" align="right"><span class="required">*</span>选择年度：</td>
            <td rowspan="2" align="left"><select name="yearly" id="select">
             <option value="2010">2014</option>
			 <option value="2009">2013</option>
			 <option value="2008">2012</option>
			 <option value="2011">2011</option>
			 <option value="2010">2010</option>
			 <option value="2009">2009</option>
			 <option value="2008">2008</option>
			 <option value="2011">2007</option>
			</select></td>
            <td align="right">人员经费（万元）：</td>
            <td align="left"><input name="prefund" type="text" class="inputTextNormal" id="textfield7" value="" /></td>
            <td align="right">公务费（万元）：</td>
            <td align="left"><input name="dutyfund" type="text" class="inputTextNormal" id="textfield" value="" /></td>
        </tr>
        <tr>
            <td align="right">业务经费（万元）：</td>
            <td align="left"><input name="businessfund" type="text" class="inputTextNormal" id="textfield9" value="" /></td>
            <td align="right">基本建设资金（万元）：</td>
            <td align="left"><input name="buildfund" type="text" class="inputTextNormal" id="textfield9" value="" /></td>
          </tr>
       
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
    	    <li><input type="submit" value="保存" class="btnShort"></li>
        	
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <!--//commonToolBar-->
    </form>
</div>
<!--//content pages wrap-->
</body>
</html>
