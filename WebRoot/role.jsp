<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督综合管理信息系统 | 登录</title>
<link href="css/main.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/validationEngine.jquery.css" rel="stylesheet" type="text/css" media="all" />
<style>
html, body { overflow:hidden;}
</style>
<script language="javascript" type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script language="javascript" type="text/javascript" src="js/jquery.validationEngine.js"></script><!--表单验证-->
<!--[if IE 6]>
<script type="text/javascript" src="js/pngfix/unitpngfix.js"></script>
<![endif]-->
<script language="javascript">
function formSubmit(obj){
  $("#"+obj+"").submit();
}
function formReset(obj){
  $("#"+obj+" input").attr("value","");
}
</script>
</head>

<body>
    <div id="header-wrap">
	<div class="loginPage-logo-title"></div>
    <div class="loginPage-main">
    <form id="login" name="login" action="role" method="post">
    	<table border="0" cellspacing="0" cellpadding="0">
            
            <tr>
                <td align="right">请选择角色：</td>
                <td>
                    <select name="sel">
			          <c:forEach items="${rlist }" var="role">
			              <option value="${role.roleId }">${role.roleName }</option>
			          </c:forEach>
			       </select>
                
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                	<img src="images/login-submit.gif" onclick="javascript:formSubmit('login');" class="cursorPointer" />
                
                </td>
            </tr>
        </table>
    </form>
    </div>
    <div class="loginPage-copyright">
    	<p>&copy; 2010 江苏省卫生厅</p>
    </div>
</div><!--//loginPage wrap-->
</body>
</html>
