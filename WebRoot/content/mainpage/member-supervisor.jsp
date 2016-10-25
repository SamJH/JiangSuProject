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
    <h2>&gt;&gt; 人员管理 - 卫生监督员管理信息汇总</h2> 
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
  <table border="0" cellspacing="1" cellpadding="0" class="commonTable"> 
    <tr> 
      <td colspan="2" align="left">&nbsp;</td> 
      <td align="center">人数</td> 
      <td align="center">百分比（%）</td> 
    </tr> 
    <tr> 
      <td colspan="2" align="center">监督员总人数</td> 
      <td align="center">3330</td> 
      <td align="center">&nbsp;</td> 
    </tr> 
    <tr> 
      <td rowspan="2" align="center">性别构成</td> 
      <td align="center">男</td> 
      <td align="center">2238</td> 
      <td align="center">76.2</td> 
    </tr> 
    <tr> 
      <td align="center">女</td> 
      <td align="center">1092</td> 
      <td align="center">32.8</td> 
    </tr> 
    <tr> 
      <td rowspan="6" align="center">年龄构成</td> 
      <td align="center">35岁及以下</td> 
      <td align="center">521</td> 
      <td align="center">15.6</td> 
    </tr> 
    <tr> 
      <td align="center">36岁及40岁</td> 
      <td align="center">1445</td> 
      <td align="center">43.4</td> 
    </tr> 
    <tr> 
      <td align="center">41岁及45岁</td> 
      <td align="center">1010</td> 
      <td align="center">30.3</td> 
    </tr> 
    <tr> 
      <td align="center">46岁及50岁</td> 
      <td align="center">&nbsp;</td> 
      <td align="center">&nbsp;</td> 
    </tr> 
    <tr> 
      <td align="center">51岁及54岁</td> 
      <td align="center">&nbsp;</td> 
      <td align="center">&nbsp;</td> 
    </tr> 
    <tr> 
      <td align="center">55岁以上</td> 
      <td align="center">354</td> 
      <td align="center">&nbsp;</td> 
    </tr> 
    <tr> 
      <td rowspan="6" align="center">学历构成</td> 
      <td align="center">博士</td> 
      <td align="center">9</td> 
      <td align="center">0.3</td> 
    </tr> 
    <tr> 
      <td align="center">研究生</td> 
      <td align="center">813</td> 
      <td align="center">24.4</td> 
    </tr> 
    <tr> 
      <td align="center">大学本科</td> 
      <td align="center">1384</td> 
      <td align="center">41.6</td> 
    </tr> 
    <tr> 
      <td align="center">大学专科</td> 
      <td align="center">931</td> 
      <td align="center">28.0</td> 
    </tr> 
    <tr> 
      <td align="center">中专</td> 
      <td align="center">170</td> 
      <td align="center">5.1</td> 
    </tr> 
    <tr> 
      <td align="center">其他（高中、初中、无学历）</td> 
      <td align="center">23</td> 
      <td align="center">0.7</td> 
    </tr> 
    <tr> 
      <td rowspan="5" align="center">职称构成</td> 
      <td align="center">正高级</td> 
      <td align="center">277</td> 
      <td align="center">8.3</td> 
    </tr> 
    <tr> 
      <td align="center">副高级</td> 
      <td align="center">1418</td> 
      <td align="center">42.6</td> 
    </tr> 
    <tr> 
      <td align="center">中级</td> 
      <td align="center">1336</td> 
      <td align="center">40.1</td> 
    </tr> 
    <tr> 
      <td align="center">初级</td> 
      <td align="center">152</td> 
      <td align="center">4.6</td> 
    </tr> 
    <tr> 
      <td align="center">无职称</td> 
      <td align="center">147</td> 
      <td align="center">4.4</td> 
    </tr> 
    <tr> 
      <td rowspan="7" align="center">所学专业构成</td> 
      <td align="center">公共卫生</td> 
      <td align="center">2040</td> 
      <td align="center">61.3</td> 
    </tr> 
    <tr> 
      <td align="center">医药</td> 
      <td align="center">436</td> 
      <td align="center">13.9</td> 
    </tr> 
    <tr> 
      <td align="center">法律</td> 
      <td align="center">115</td> 
      <td align="center">3.5</td> 
    </tr> 
    <tr> 
      <td align="center">工程</td> 
      <td align="center">84</td> 
      <td align="center">2.5</td> 
    </tr> 
    <tr> 
      <td align="center">其他专业</td> 
      <td align="center">459</td> 
      <td align="center">13.8</td> 
    </tr> 
    <tr> 
      <td align="center">无专业</td> 
      <td align="center">85</td> 
      <td align="center">2.6</td> 
    </tr> 
    <tr> 
      <td align="center">不详</td> 
      <td align="center">84</td> 
      <td align="center">2.5</td> 
    </tr> 
  </table> 
  <!--//commonTable--> 
</div> 
<!--//content pages wrap--> 
</body>
</html>