<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>content/js/jquery-3.0.0.js" type="text/javascript"></script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle"><h2>&gt;&gt; <a href="institution-list.jsp">机构管理</a> - 机构创建</h2></div>
    <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <form id="institutionCreat" name="institutionCreat" action="<%=basePath %>institutionCreat" method="post">
        <tr>
         <td align="right"><span class="required">*</span>机构编码：</td>
            <td align="left"><input name="orgno" type="text" class="inputTextMiddle" id="textfield" /></td>
             <td align="right"><span class="required">*</span>机构代码：</td>
            <td align="left" colspan="3"><input name="orgcode" type="text" class="inputTextMiddle" id="textfield" />(<span class="required">代码格式:XXXXXXXX-X</span>)</td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span>机构名称：</td>
            <td align="left"><input name="orgname" type="text" class="inputTextMiddle" id="textfield2" /></td>
            <td align="right"><span class="required">*</span>行政类别：</td>
            <td align="left" colspan="4">
            	<input type="radio" name="exetype" id="radio5" value="2" />行政部门
                <input type="radio" name="exetype" id="radio6" value="1" />卫生监督机构
                <input type="radio" name="exetype" id="radio7" value="3" />协作单位
            </td>
        </tr>
        <tr>
            <td align="right">地址：</td>
            <td colspan="3" align="left"><input name="linkadd" type="text" class="inputTextLong" id="textfield5" /></td>
            <td align="right">邮编：</td>
            <td align="left"><input name="zipcode" type="text" class="inputTextNormal" id="textfield4" /></td>
        </tr>
        <tr>
       	     <td align="right"><span class="required">*</span>行政区划：</td>
            <td align="left"><input name="areacode" type="text" class="inputTextNormal" id="textfield6" /></td>
            <td align="right">挂牌日期：</td>
            <td align="left"><input name="listingdate" type="text" class="inputTextNormal" id="textfield6" /></td>
            <td align="right">独立运行日期：</td>
            <td align="left"><input name="standalonedate" type="text" class="inputTextNormal" id="textfield7" /></td>
        </tr>
        <tr>
         <td align="right"><span class="required">*</span>行政区类别：</td>
            <td align="left">
            	<input type="radio" name="areatype" id="radio1" value="1" />省
                <input type="radio" name="areatype" id="radio2" value="2" />市
                <input type="radio" name="areatype" id="radio3" value="3" />县
                <input type="radio" name="areatype" id="radio4" value="4" />区

            </td>
            <td align="right">在职人数：</td>
            <td align="left"><input name="onworkernum" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right">卫生监督员数：</td>
            <td align="left"><input name="supervisornum" type="text" class="inputTextNormal" id="textfield9" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>机构行政级别 ：</td>
            <td align="left"><select name="orglevel" id="select">
			 <option value="">请选择</option>
			 <option value="1">处级</option>
			 <option value="2">副处级</option>
			 <option value="3">科级</option>
			 <option value="4">副科级</option>
			 <option value="5">乡级及以下</option>
			</select></td>
            <td align="right"><span class="required">*</span>机构性质：</td>
            <td align="left"><select name="orgpro" id="select5">
              <option value="">请选择</option>
              <option value="1">行政机构</option>
              <option value="2">全额拔款事业单位</option>
              <option value="3">差额拔款事业单位</option>
              <option value="4">自收自支事业单位</option>
              <option value="5">其他</option>
            </select></td>
             <td align="right">编办批文日期：</td>
            <td align="left"><input name="zbbdocdate" type="text" class="inputTextNormal" id="textfield936" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>是否参公管理 ：</td>
            <td align="left"><input type="radio" name="ifpublicmanage" value="是"/>是<input type="radio" name="ifpublicmanage" value="否">否</td>
            <td align="right"><span class="required">*</span>离退休人数 ：</td>
            <td align="left"><input name="retirenum" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="bzrsrequired">*</span>编制人数 ：</td>
            <td align="left"><input name="zbbnum" type="text" class="inputTextNormal" id="textfield935" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span>房屋所有权 ：</td>
            <td align="left"><select name="buildingownership" id="select">
			 <option value="">请选择</option>
			 <option value="1">自</option>
			 <option value="2">借</option>
			 <option value="3">租</option>
			</select></td>
            <td align="right"> 办公用房在建面积（平方米） ：</td>
            <td align="left"><input name="officebuildingarea" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"> <span class="required">*</span>办公用房建筑面积（平方米） ：</td>
            <td align="left"><input name="officebuildarea" type="text" class="inputTextNormal" id="textfield934" /></td>
        </tr>
	<tr>
            <td align="right"><span class="required">*</span>职能科室数 ：</td>
            <td align="left"><input name="fundivcount" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span>派出机构数 ：</td>
            <td align="left"><input name="orgcount" type="text" class="inputTextNormal" id="textfield9" /></td>
           <td align="right"><span class="required">*</span>业务科室数 ：</td>
            <td align="left"><input name="businessdivcount" type="text" class="inputTextNormal" id="textfield92" /></td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span>检测仪器设备数 ：</td>
            <td align="left" colspan="5"><input name="equ1count" colspan="2" type="text" id="textfield9" size="4"/>（价格大于一千,小于一万）<br/>
              <input name="equ2count" colspan="2" type="text" id="zjtextfield" size="4"/>（价格大于一万、小于十万）<br/>
             <input name="equ3count" type="text" id="dyswtextfield" size="4"/>（价格大于十万）</td>
        </tr>
        <tr>
            <td align="right"><span class="required">*</span> 汽车数（不含快速检测车） ：</td>
            <td align="left"><input name="buscount" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span> 快速检测车数 ：</td>
            <td align="left"><input name="rapidtestvehiclecount" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 摩托车数 ：</td>
            <td align="left"><input name="motorcount" type="text" class="inputTextNormal" id="textfield93" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span> 照相机数：</td>
            <td align="left"><input name="cameracount" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"><span class="required">*</span> 摄像机数 ：</td>
            <td align="left"><input name="videocount" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 复印机数：</td>
            <td align="left"><input name="copycatnum" type="text" class="inputTextNormal" id="textfield932" /></td>
        </tr>
		<tr>
            <td align="right"><span class="required">*</span> 台式电脑数 ：</td>
            <td align="left"><input name="computernum" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"> <span class="required">*</span>笔记本电脑数 ：</td>
            <td align="left"><input name="notepadnum" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"><span class="required">*</span> 服务器数 ：</td>
            <td align="left"><input name="servercount" type="text" class="inputTextNormal" id="textfield933" /></td>
        </tr>
	 <tr>
            <td align="right"> <span class="jhjsrequired">*</span>交换机数 ：</td>
            <td align="left"><input name="pbxcount" type="text" class="inputTextNormal" id="textfield8" /></td>
            <td align="right"> <span class="required">*</span>传真机数 ：</td>
            <td align="left"><input name="faxcount" type="text" class="inputTextNormal" id="textfield9" /></td>
            <td align="right"> <span class="required">*</span>投影仪数 ：</td>
            <td align="left"><input name="ohpcount" type="text" class="inputTextNormal" id="textfield937" /></td>
        </tr>
        <tr>
           <td align="right"> <span class="required">*</span>录音笔数：</td>
            <td align="left"><input name="vrcount" type="text" class="inputTextNormal" id="textfield937" /></td>
             <td align="right"> </td>
            <td align="left"></td>
            <td align="right"> </td>
            <td align="left"></td>
        </tr>
        
    </table>
    <!--//commonTable-->
    <div id="formPageButton">
    	<ul>
         <!--  <li><a href="#" title="保存" class="btnShort">保存</a></li>  --> 
          	<!-- <button title="保存" class="btnShort">保存</button>  -->
          	
          	<li><input class="btnShort" type="submit" value="保存"></li>
          	<li><input class="btnShort" onclick="javascript:window.history.go(-1)"type="submit" value="返回"></li>
   <!-- <a href="javascript:window.history.go(-1)" title="返回" class="btnShort">返回</a> -->
        </ul>
    </div>
    </form>
<!--//content pages wrap-->
</body>
</html>
