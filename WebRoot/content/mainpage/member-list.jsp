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
    <h2>&gt;&gt; 人员管理</h2></div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">机构名称：</th>
            <td><select name="select" id="select">
			 <option value="">某某监督机构1</option>
			 <option value="">某某监督机构2</option>
			 <option value="">某某监督机构3</option>
			 <option value="">...</option>
			</select></td>
            <th align="right">姓名：</th>
            <td><input name="textfield" type="text" class="inputTextNormal" id="textfield" /></td>
            <th >性别：</th>
            <td><select name="select" id="select">
                <option>请选择</option>
                <option>男</option>
                <option>女</option>
            </select></td>
            <th >学历：</th>
            <td><select name="select2" id="select2">
                <option>请选择</option>
                <option>博士</option>
                <option>硕士</option>
                <option>本科</option>
                <option>大专</option>
                <option>中专</option>
                <option>高中</option>
                <option>初中</option>
                <option>无学历</option>
                <option>不详</option>
            </select></td>            
        </tr>
        <tr>
		     <th align="right">科室：</th>
            <td><select name="select2" id="select2">
              <option>请选择</option>
              <option>科室1</option>
              <option>科室2</option>
              <option>科室3</option>
              <option>科室4</option>
            </select></td>
            <th align="right">职务：</th>
            <td><select name="select2" id="select2">
              <option>请选择</option>
              <option>所长</option>
              <option>书记</option>
              <option>副所长</option>
              <option>副书记</option>
              <option>主任(科长)</option>
              <option>副主任(副科长)</option>
              <option>无</option>
            </select></td>
            <th align="right">职级：</th>
            <td><select name="select3" id="select3">
              <option>请选择</option>
              <option>省部级正职</option>
              <option>省部级副职</option>
              <option>厅局级正职</option>
              <option>厅局级副职</option>
              <option>乡科级正职</option>
              <option>乡科级副职</option>
              <option>县处级正职</option>
              <option>县处级副职</option>
              <option>科办员</option>
            </select></td>
            <th >所学专业：</th>
            <td><select name="select" id="select">
                <option>请选择</option>
                <option>工程</option>
                <option>法律</option>
				 <option>医药</option>
                <option>公共卫生</option>
                <option>无专业</option>
				<option>其他专业</option>
				  <option>不详</option>
            </select>&nbsp;&nbsp;<button>检索</button></td>

        </tr>		
       	</form>
    </table>
    <!--//commonTableSearch-->
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="member-creat.html" title="创建人员" class="btnNormal">创建人员</a></li>
        </ul>
    </div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th>人员编码</th>
            <th>机构</th>
            <th>科室</th>
            <th>姓名</th>
            <th>性别</th>
            <th>学历</th>
            <th>职务</th>            
            <th>职级</th>
            <th>所学专业</th>            
            <th class="editColL">编辑</th>
        </tr>
        <tr>
            <td align="center">0123456-01</td>
            <td align="center">江苏省卫生监督所</td>
            <td align="center">办公室</td>
            <td align="left">张三</td>
            <td align="center">男</td>
            <td align="left">本科</td>
            <td align="center">主任(科长)</td>
            <td align="center">乡科级正职</td>
            <td align="center">公共卫生</td>
            <td align="center">
            	<a href="member-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="member-edit.html" class="btnIconEdit" title="更新"></a>
            	<a href="member-relation.html" class="btnIconRel" title="关联科室"></a>
            	<a href="userid-relation.html" class="btnIconKey" title="创建登录号"></a>
                <a href="#" class="btnIconDel" title="注销"></a>
            </td>
        </tr>
        <tr>
            <td align="center">0123456-01</td>
            <td align="center">南京市卫生监督所</td>
            <td align="center">办公室</td>
            <td align="left">张三</td>
            <td align="center">男</td>
            <td align="left">本科</td>
            <td align="center">主任(科长)</td>
            <td align="center">乡科级正职</td>
            <td align="center">公共卫生</td>
            <td align="center">
            	<a href="member-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="member-edit.html" class="btnIconEdit" title="更新"></a>
            	<a href="member-relation.html" class="btnIconRel" title="关联科室"></a>
            	<a href="userid-relation.html" class="btnIconKey" title="创建登录号"></a>
                <a href="#" class="btnIconDel" title="注销"></a>
            </td>
        </tr>
                <tr>
            <td align="center">0123456-01</td>
            <td align="center">江苏省卫生监督所</td>
            <td align="center">办公室</td>
            <td align="left">张三</td>
            <td align="center">男</td>
            <td align="left">本科</td>
            <td align="center">主任(科长)</td>
            <td align="center">乡科级正职</td>
            <td align="center">公共卫生</td>
            <td align="center">
            	<a href="member-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="member-edit.html" class="btnIconEdit" title="更新"></a>
            	<a href="member-relation.html" class="btnIconRel" title="关联科室"></a>
            	<a href="userid-relation.html" class="btnIconKey" title="创建登录号"></a>
                <a href="#" class="btnIconDel" title="注销"></a>
            </td>
        </tr>
                <tr>
            <td align="center">0123456-01</td>
            <td align="center">江苏省卫生监督所</td>
            <td align="center">办公室</td>
            <td align="left">张三</td>
            <td align="center">男</td>
            <td align="left">本科</td>
            <td align="center">主任(科长)</td>
            <td align="center">乡科级正职</td>
            <td align="center">公共卫生</td>
            <td align="center">
            	<a href="member-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="member-edit.html" class="btnIconEdit" title="更新"></a>
            	<a href="member-relation.html" class="btnIconRel" title="关联科室"></a>
            	<a href="userid-relation.html" class="btnIconKey" title="创建登录号"></a>
                <a href="#" class="btnIconDel" title="注销"></a>
            </td>
        </tr>
                <tr>
            <td align="center">0123456-01</td>
            <td align="center">江苏省卫生监督所</td>
            <td align="center">办公室</td>
            <td align="left">张三</td>
            <td align="center">男</td>
            <td align="left">本科</td>
            <td align="center">主任(科长)</td>
            <td align="center">乡科级正职</td>
            <td align="center">公共卫生</td>
            <td align="center">
            	<a href="member-view.html" class="btnIconView" title="查看详情"></a>
            	<a href="member-edit.html" class="btnIconEdit" title="更新"></a>
            	<a href="member-relation.html" class="btnIconRel" title="关联科室"></a>
            	<a href="userid-relation.html" class="btnIconKey" title="创建登录号"></a>
                <a href="#" class="btnIconDel" title="注销"></a>
            </td>
        </tr>
    </table>
    <!--//commonTable-->
    <div id="pagelist">
    	<ul class="clearfix">
        	<li><a href="#">首页</a></li>
            <li><a href="#">上页</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li class="current">3</li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">下页</a></li>
            <li><a href="#">尾页</a></li>
            <li class="pageinfo">第3页</li>
            <li class="pageinfo">共8页</li>
        </ul>
    </div>
</div>
<!--//content pages wrap-->
</body>
</html>
