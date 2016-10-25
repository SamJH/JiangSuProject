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
<link href="../css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="../js/jquery-1.4.2.min.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
    <h2>&gt;&gt; 人员管理 - 


 


 所级领导名录统计表

</h2>
</div> 
  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">监督机构：</th>
            <td><select name="select" id="select">
			 <option value="">请选择</option>
			 <option value="">全部</option>
			 <option value="">全省各个监督机构</option>
			</select></td>
			 <th align="right">年份：</th>
            <td><select name="select" id="select">
			 <option value="">2010</option>
			 <option value="">2009</option>
			 <option value="">2008</option>
			 <option value="">...</option>
			</select></td>
            <td align="right"><button>检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td>
        </tr>
       	</form>
</table>
     <table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable">
		<tr>
            <td align="center">单位</td>
            <td align="center">姓名</td>
            <td align="center">性别</td>
            <td align="center">民族</td>
            <td align="center">出生年月</td>
			 <td align="center">政治面貌</td>
            <td align="center">学位</td>
			 <td align="center">职务</td>
			 <td align="center">职称</td>
            <td align="center">备注</td>
       </tr>
		<tr>
            <td align="center">南京市卫生监督所</td>
            <td align="center">2</td>
            <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
            <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
       </tr>
		<tr>
            <td align="center">鼓楼区卫生监督所</td>
            <td align="center">3</td>
            <td align="center">34</td>
			 <td align="center">45</td>
            <td align="center">9</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">秦淮区卫生监督所</td>
            <td align="center">4</td>
            <td align="center">3</td>
			 <td align="center">34</td>
            <td align="center">45</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">六合区卫生监督所</td>
            <td align="center">5</td>
            <td align="center">64</td>
            <td align="center">5</td>
            <td align="center">34</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">六合区二所卫生监督所</td>
            <td align="center">6</td>
            <td align="center">34</td>
            <td align="center">64</td>
            <td align="center">5</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">......卫生监督所</td>
            <td align="center">7</td>
            <td align="center">34</td>
            <td align="center">54</td>
            <td align="center">64</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">......卫生监督所</td>
            <td align="center">8</td>
            <td align="center">54</td>
            <td align="center">54</td>
            <td align="center">34</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
		<tr>
            <td align="center">......卫生监督所</td>
            <td align="center">9</td>
            <td align="center">35</td>
            <td align="center">37</td>
            <td align="center">36</td>
			 <td align="center">45</td>
            <td align="center">9</td>
            <td align="center">11</td>
			<td align="center">64</td>
			 <td align="center">2</td>
       </tr>
  </table>
<!--//content pages wrap-->
</body>
</html>