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
<title>江苏省卫生监督机构与队伍系统</title>
<style>
html,body { overflow-x:hidden;}
</style>
<link href="content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="content/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="content/js/jquery.onlyforindex.js" type="text/javascript"></script>
</head>

<body>
<div id="header-wrap">
	<iframe allowtransparency="true" frameborder="0" id="header-box" scrolling="no" src="content/inc-header.jsp"></iframe>
</div>
<div id="main-wrap">
	<div id="main-nav">
    	<iframe frameborder="0" id="siderbar-box" scrolling="no" src="content/inc-nav.jsp"></iframe>
    </div>
    <div id="main-content">
        <table border="0" cellpadding="0" cellspacing="0" id="main-content-box">
            <tr>
                <td class="content-wrap"><iframe frameborder="0" id="content-box" src="content/welcome.html" scrolling="auto"></iframe></td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>