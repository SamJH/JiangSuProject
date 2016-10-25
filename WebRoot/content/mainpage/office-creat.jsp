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
<script language="javascript">
<!--
$().ready(function(){
	$(".btnShort").click(function(){$(".content-wrap-box").show()})
});
-->
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="office-list.jsp">科室管理</a> - 科室创建</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="<%=basePath %>addsection" method="post">
        <tr>
            <td align="right"><span class="required">*</span>请选择机构：</td>
            <td colspan="5" align="left">
			  <td><select name="selectOrganization" id="select">
              <c:forEach items="${Organizationlist }" var="org">
                <option value="${org.id }">${org.orgname }</option>
              </c:forEach>
			</select></td>
        </tr>
    </table>
    <div id="formPageButton">
    	<ul>
        	<li><a href="#" title="下一步" class="btnShort">下一步</a></li>
        	<li><a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a></li>
        </ul>
    </div>
    <div class="content-wrap-box" style="display:none;">
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <td align="right"><span class="required">*</span>科室编码：</td>
            <td align="left"><input name="divcode" type="text" class="inputTextNormal" id="textfield3" /></td>
            <td align="right"><span class="required">*</span>科室名称：</td>
            <td align="left"><input name="divname" type="text" class="inputTextMiddle" id="textfield4" /></td>
            <td align="right"><span class="required">*</span>是否为分所：</td>
            <td align="left"><input type="radio" name="ifsub" value="0"/>是<input type="radio" name="ifsub" value="1"/>否</td>
        </tr>
        <tr>
            <td align="right">电话号码：</td>
            <td align="left"><input name="dutytul" type="text" class="inputTextNormal" id="textfield6" /></td>
            <td align="right">传真号码：</td>
            <td align="left"><input name="fax" type="text" class="inputTextNormal" id="textfield7" /></td>
            <td align="right">门号：</td>
            <td align="left"><input name="divroomno" type="text" class="inputTextNormal" id="textfield2" /></td>
        </tr>
        </table>
    <div id="formPageButton">
    	<ul>
        	<li><input type="submit" value="保存" class="btnShort"></li>
        	<li><input type="submit" onclick="javascript:window.history.go(-1)" value="返回" class="btnShort"></li>
        	
        </ul>
    </div>
    </form>
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>