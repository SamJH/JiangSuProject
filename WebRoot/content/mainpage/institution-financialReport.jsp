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
<script src="<%=basePath %>/content/js/pager.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('.select').on('change',function(){
    var sec = $("#select").val();
        $.ajax({  
            type:"post",      
            url:"selectfinancialByorgid",
            data:{sec:sec},  
            dataType:"json",  
            success:function(data){ 
            $(".seainfo").remove();
            $('.yearly').remove();
            	var arr = eval(data);
            	var str = "";
            	var strs = "";
            	var trNum = 0;
            	for(var i in arr){
            		strs+="<option class='yearly' value='"+arr[i].yearly+"'>"+arr[i].yearly+"</option>";
            	    
            	    
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].prefund+"</td><td align='center'>"+arr[i].dutyfund+"</td><td align='center'>"+arr[i].businessfund+"</td><td align='center'>"+arr[i].buildfund+"</td></tr>";
            		trNum++;
            	}
            	$('#selects').append(strs);
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
<script type="text/javascript">
$(document).ready(function(){
    $('.selects').on('change',function(){
    var secs = $("#selects").val();
        $.ajax({  
            type:"post",      
            url:"selectfinancialByorgid1",
            data:{secs:secs},  
            dataType:"json",  
            success:function(data){ 
            $(".seainfo").remove();
            	var arr = eval(data);
            	var str = "";
            	for(var i in arr){ 	    
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].prefund+"</td><td align='center'>"+arr[i].dutyfund+"</td><td align='center'>"+arr[i].businessfund+"</td><td align='center'>"+arr[i].buildfund+"</td></tr>";
            	}
            	$('.commonTable').append(str);
            	$(".pbut").remove();
  	            $('.page').remove();
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


 年度财政拨款情况表</h2>
</div> 
  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="<%=basePath %>Daochu" method="post">
        <tr>
            <th align="right">监督机构：</th>
            <td><select name="orgid" id="select" class="select">
            <c:forEach items="${Organizationlist }" var="org">
			 <option value="${org.id}">${org.orgname }</option>
			 </c:forEach>
			</select></td>
			 <th align="right">年份：</th>
            <td><select name="yearly" id="selects" class="selects">
			</select></td>
            <td align="right"><input type="submit" value="导出"></td>
        </tr>
       	</form>
</table>
     <table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable">
		<tr>
            <td align="center">单位</td>
            <td align="center">人员经费（万元）</td>
            <td align="center">公务费（万元）</td>
            <td align="center">业务经费（万元）</td>
            <td align="center">基本建设基金（万元）</td>
       </tr>
  </table>
<!--//content pages wrap-->
<div id="pagelist">

</div>
</body>
</html>