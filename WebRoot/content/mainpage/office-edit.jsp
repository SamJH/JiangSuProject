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
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>/content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/content/js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt; <a href="content/mainpage/office-list.jsp">科室管理</a> - 科室更新</h2></div>
         <form id="institutionCreat" name="institutionCreat" action="<%=basePath %>updatesection" method="post">
         
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <td align="right">机构名称：</td>
            <td colspan="5" align="left"><input name="orgname" type="text" class="inputTextLong inputTextReadonly" id="textfield" readonly="readonly" value="${orgname }" /><span class="required">*</span></td>
          </tr>
        <tr>
            <td align="right">科室编码：</td>
            <td align="left"><input name="divcode" type="text" class="inputTextNormal" id="textfield3" value="${seclist.orgno }" /><span class="required">*</span></td>
            <td align="right">科室名称：</td>
            <td align="left"><input name="divname" type="text" class="inputTextMiddle" id="textfield4" value="${seclist.divname }" /><span class="required">*</span></td>
           <td align="right"><span class="required">*</span>是否为分所：</td>
            <td align="left"><input type="radio" name="ifsub" value="${seclist.ifsub }" checked/>是<input type="radio" name="ifsub" value="${seclist.ifsub }"/>否</td>
          </tr>
        <tr>
            <td align="right">电话号码：</td>
            <td align="left"><input name="dutytel" type="text" class="inputTextNormal" id="textfield6" value="${seclist.dutytel }" /></td>
            <td align="right">传真号码：</td>
            <td align="left"><input name="fax" type="text" class="inputTextNormal" id="textfield7" value="${seclist.fax }" /></td>
            <td align="right">门号：</td>
            <td align="left"><input name="divroomno" type="text" class="inputTextNormal" id="textfield2" value="${seclist.divroomno }" /></td>
            <td align="left"><input name="divid" type="hidden" class="inputTextNormal" id="textfield2" value="${seclist.id }" /></td>
        </tr>
    </table>
  
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
        	<li><input type="submit" value="保存" class="btnShort"></li>
        	<li><input type="submit" onclick="javascript:window.history.go(-2)" value="返回" class="btnShort"></li>
        </ul>
    </div>
    <p>${updatesection }</p>
    </form>
    <!--//commonToolBar-->
</div>
<!--//content pages wrap-->
</body>
</html>