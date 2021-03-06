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
  <h2>&gt;&gt;人员管理 - 人员构成情况表 </h2> 
</div> 
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch"> 
  <form id="form-search" name="form-search" action="" method="post"> 
    <tr> 
      <td align="right">监督机构：</td> 
      <td><select name="select" id="select"> 
          <option value="">请选择</option> 
          <option value="">江苏省</option> 
          <option value="">***市</option> 
          <option value="">监督机构1</option> 
          <option value="">监督机构2</option> 
        </select></td> 
      <td align="right"><button>检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td>
    </tr> 
  </form> 
</table> 
<table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable"> 
  <tr> 
    <td align="center" rowspan="2">项目</td> 
    <td align="center" colspan="8">年龄</td> 
    <td align="center" colspan="2">性别</td> 
    <td align="center" colspan="6">学历</td> 
    <td align="center" colspan="10">职级</td> 
    <td align="center" colspan="6">专业技术职称</td> 
  </tr> 
  <tr> 
    <td align="center">25岁及以下</td> 
    <td align="center">26岁到30岁</td> 
    <td align="center">31岁到35岁</td> 
    <td align="center">36岁到40岁</td> 
    <td align="center">41岁到45岁</td> 
    <td align="center">46岁到50岁</td> 
    <td align="center">51岁到54岁</td> 
    <td align="center">55岁及以上</td> 
    <td align="center">男</td> 
    <td align="center">女</td> 
    <td align="center">研究生</td> 
    <td align="center">博士</td> 
    <td align="center">大学本科</td> 
    <td align="center">大学专科</td> 
    <td align="center">中专</td> 
    <td align="center">高中及以下</td> 
    <td align="center">合计</td> 
    <td align="center">省都级正职</td> 
    <td align="center">省都级副职</td> 
    <td align="center">厅局级正职</td> 
    <td align="center">厅局级副职</td> 
    <td align="center">县处级正职</td> 
    <td align="center">县处级副职</td> 
    <td align="center">乡科级正职</td> 
    <td align="center">乡科级副职</td> 
    <td align="center">科办员</td> 
    <td align="center">合计</td> 
    <td align="center">正高级</td> 
    <td align="center">副高级</td> 
    <td align="center">中级</td> 
    <td align="center">初级</td> 
    <td align="center">未聘任专业技术职称</td> 
  </tr> 
  <tr> 
    <td align="center">鼓楼区卫生监督所</td> 
    <td align="center">3</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">秦淮区卫生监督所</td> 
    <td align="center">4</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">45</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">六合区卫生监督所</td> 
    <td align="center">5</td> 
    <td align="center">9</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">64</td> 
    <td align="center">5</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">六合区二所卫生监督所</td> 
    <td align="center">6</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">64</td> 
    <td align="center">5</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">......卫生监督所</td> 
    <td align="center">7</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">9</td> 
    <td align="center">54</td> 
    <td align="center">64</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">......卫生监督所</td> 
    <td align="center">8</td> 
    <td align="center">3</td> 
    <td align="center">54</td> 
    <td align="center">9</td> 
    <td align="center">54</td> 
    <td align="center">34</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
  <tr> 
    <td align="center">......卫生监督所</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">35</td> 
    <td align="center">37</td> 
    <td align="center">36</td> 
    <td align="center">3</td> 
    <td align="center">9</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
    <td align="center">45</td> 
    <td align="center">9</td> 
    <td align="center">3</td> 
    <td align="center">34</td> 
    <td align="center">45</td> 
  </tr> 
</table> 
<!--//content pages wrap--> 
</body>
</html>