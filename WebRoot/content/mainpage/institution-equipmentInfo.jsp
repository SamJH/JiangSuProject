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
<link href="<%= basePath %>/content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%= basePath %>/content/js/jquery-3.0.0.js" type="text/javascript"></script>
<script src="<%= basePath %>/content/js/pager.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('#select').on('change',function(){
        $.ajax({  
            type:"post",      
            url:"selectequipmentInfoByorgId?select="+$("#select").val(),
            data:$("#select").val(),  
            dataType:"json",  
            success:function(data){ 
            $('.commonTable').find($(".seainfo")).remove(); 
            	var arr = eval(data);
            	var str = "";
            	var trNum = 0;
            	for(var i in arr){
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].equ1count+"</td><td align='center'>"+arr[i].equ2count+"</td><td align='center'>"+arr[i].equ3count+"</td><td align='center'>"+arr[i].buscount+"</td><td align='center'>"+arr[i].rapidtestvehiclecount+"</td><td align='center'>"+arr[i].motorcount+"</td><td align='center'>"+arr[i].cameracount+"</td><td align='center'>"+arr[i].videocount+"</td><td align='center'>"+arr[i].vrcount+"</td><td align='center'>"+arr[i].computernum+"</td><td align='center'>"+arr[i].notepadnum+"</td><td align='center'>"+arr[i].servercount+"</td><td align='center'>"+arr[i].pbxcount+"</td><td align='center'>"+arr[i].faxcount+"</td><td align='center'>"+arr[i].ohpcount+"</td><td align='center'>"+arr[i].copycatnum+"</td></tr>";
            		trNum++;
            }	
            	$('.commonTable').append(str);
            	var currentPage = 1;
            	fenye(1);
            	createButton(trNum,currentPage);
            },
            error:function(e){
              console.log(e);
            }
        });
    });
});
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
    <h2>&gt;&gt; 机构管理 - 


 


 仪器设备配置情况表

</h2>
</div> 
  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">监督机构：</th>
            <td><select name="select" id="select">
			 <option value="">全部</option>
			 <c:forEach items="${Organizationlist }" var="org">
			 <option value="${org.id }">${org.orgname }</option>
			 </c:forEach>
			</select></td>
            <td align="right"><button>检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td>
        </tr>
       	</form>
</table>
     <table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable">
		<tr>
            <td width="14%" rowspan="2" align="center">单位</td>
            <td align="center" colspan="3">千元以上检测仪器设备台数</td>
            <td align="center" colspan="3">车辆（辆）</td>
            <td align="center" colspan="3">执法取证工具（台数）</td>
            <td align="center" colspan="7">办公及信息化设备（台数）</td>
            </tr>
            <tr>
            <td width="8%" align="center">小于等于一万</td>
            <td width="7%" align="center">一万到十万</td>
            <td width="7%" align="center">大于等于十万</td>
            <td align="center">汽车(不含快速检测车)</td>
			 <td width="4%" align="center">快速检测车</td>
			  <td width="4%" align="center">摩托车</td>
			   <td width="5%" align="center">照相机</td>
			    <td width="5%" align="center">摄像机</td>
			  <td width="4%" align="center">录音笔</td>
			   <td width="6%" align="center">台式电脑</td>
			    <td width="7%" align="center">笔记本电脑</td>
				 <td width="4%" align="center">服务器</td>
			  <td width="4%" align="center">交换机</td>
            <td width="4%" align="center">传真机</td>
			  <td width="4%" align="center">投影仪</td>
            <td width="6%" align="center">复印机</td>
       </tr>
  </table>
<!--//content pages wrap-->
<div id="pagelist">

</div>
</body>
</html>