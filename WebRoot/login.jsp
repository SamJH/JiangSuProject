<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
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

<body class="loginPage">
<div id="loginPage-wrap">
	<div class="loginPage-logo-title"></div>
    <div class="loginPage-main">
    <form id="login" name="login" action="login" method="post">
    	<table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td align="right">用户名：</td>
                <td><input class="validate[required] text-input" type="text" name="username" id="username" /></td>
            </tr>
            <tr>
                <td align="right">密&nbsp;&nbsp;码：</td>
                <td><input class="validate[required] text-input" type="password" name="password" id="password" /></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>
                	<img src="images/login-submit.gif" onclick="javascript:formSubmit('login');" class="cursorPointer" />
                	<img src="images/login-reset.gif" onclick="javascript:formReset('login');" class="cursorPointer" />                 
                </td>
            </tr>
        </table>
    </form>
    <font color="red">${error }</font>
    </div>
    <div class="loginPage-copyright">
    	<p>&copy; 2010 江苏省卫生厅</p>
    </div>
</div><!--//loginPage wrap-->
</body>
</html>