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
    $('.select').on('change',function(){
    var sec = $("#select").val();
  
        $.ajax({  
            type:"post",      
            url:"selectequipmentInfoByorgId1",
            data:{sec:sec},  
            dataType:"json",  
            success:function(data){ 
            $('.commonTable').find($(".seainfo")).remove(); 
            $('.yearly').remove();
            	var arr = eval(data);
            	var trNum = 0;
            	var str = "";
            	var strs = "";
            	for(var i in arr){
           
                    for(var j in arr[i].orgattachedlist){
            	     
            	    strs="<option class='yearly' value='"+(arr[i].orgattachedlist)[j].yearly+"'>"+(arr[i].orgattachedlist)[j].yearly+"</option>";
            	    $('.selects').append(strs);
            	    str+="<tr class='seainfo'><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].zbbdocdate+"</td><td align='center'>"+arr[i].listingdate+"</td><td align='center'>"+arr[i].standalonedate+"</td><td align='center'>"+arr[i].areacode+"</td><td align='center'>"+arr[i].orgpro+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].zbbnum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].ifpublicmanage+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].onworkernum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].retirenum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].officebuildarea+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].buildingownership+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].officebuildingarea+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].businessdivcount+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].fundivcount+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].orgcount+"</td></tr>";
            	    trNum++;
            	  }
            	}
            	$('.commonTable').append(str);
            	var  currentPage = 1;
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
    var sec = $("#select").val();
    var secs = $("#selects").val();
    
        $.ajax({  
            type:"post",      
            url:"selectequipmentInfoByorgId2",
            data:{sec:sec,secs:secs},  
            dataType:"json",  
            success:function(data){ 
            $('.commonTable').find($(".seainfo")).remove(); 
            	var arr = eval(data);
            	
            	var str = "";
            	for(var i in arr){
           
                    for(var j in arr[i].orgattachedlist){
            	 
            	    str+="<tr class='seainfo'><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].zbbdocdate+"</td><td align='center'>"+arr[i].listingdate+"</td><td align='center'>"+arr[i].standalonedate+"</td><td align='center'>"+arr[i].areacode+"</td><td align='center'>"+arr[i].orgpro+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].zbbnum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].ifpublicmanage+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].onworkernum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].retirenum+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].officebuildarea+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].buildingownership+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].officebuildingarea+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].businessdivcount+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].fundivcount+"</td><td align='center'>"+(arr[i].orgattachedlist)[j].orgcount+"</td></tr>";
            	  
            	  }
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
    <h2>&gt;&gt; 机构管理 - 监督机构基本情况表</h2>
</div> 
  <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
       	<form id="form-search" name="form-search" action="" method="post">
        <tr>
            <th align="right">监督机构：</th>
            <td><select name="select" id="select" class="select">
			 <c:forEach items="${Organizationlist }" var="org">
			 <option value="${org.id }">${org.orgname }</option>
			 </c:forEach>
			</select></td>
			 <th align="right">年份：</th>
            <td><select name="select" id="selects" class="selects">
			</select></td>
            <td align="right"><button>检索</button>&nbsp;&nbsp;&nbsp;<button>导出</button></td>
        </tr>
       	</form>
</table>
     <table border="0" align="center" cellpadding="0" cellspacing="1" class="commonTable">
		<tr>
            <td align="center" rowspan="2">单位</td>
            <td align="center" rowspan="2">编办批文日期（年月日）</td>
            <td align="center" rowspan="2">挂牌日期（年月日）</td>
            <td align="center" rowspan="2">独立运行日期（年月日）</td>
            <td align="center" rowspan="2">行政级别</td>
			 <td align="center" rowspan="2">行政性质</td>
            <td align="center" rowspan="2">编制人数</td>
            <td align="center" rowspan="2">是否参公管理</td>
			 <td align="center" rowspan="2">在职人数</td>
            <td align="center" rowspan="2">离退休人数</td>
            <td align="center" colspan="3">办公用房</td>
			<td align="center" colspan="3">内设科室数</td>
       </tr>
		<tr>
            <td align="center">建筑面积（平方米）</td>
            <td align="center">房屋所有权</td>
            <td align="center">在建面积（平方米）</td>
            <td align="center">业务科室</td>
            <td align="center">职能科室</td>
		    <td align="center">派出机构数</td>
       </tr>
  </table>
<!--//content pages wrap-->
<div id="pagelist">

</div>
</body>
</html>
