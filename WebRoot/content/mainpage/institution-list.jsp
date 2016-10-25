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
    $('#select').on('change',function(){
        $.ajax({  
            type:"post",      
            url:"selectorgByexetype?select="+$("#select").val(),
            data:$("#select").val(),  
            dataType:"json",  
            success:function(data){ 
            $('.seainfo').remove(); 
            $('.newtr').remove();
            	var arr = eval(data);
            	var str = "";
            	var trNum = 0;
            	for(var i in arr){
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgno+"</td><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].exetype+"</td><td align='center'>"+arr[i].linkadd+"</td><td align='center'>"+arr[i].zipcode+"</td><td align='center'>"+arr[i].zbbdocdate+"</td><td align='center'><a href='<%=basePath%>/institutionview?id="+arr[i].id+"' class='btnIconView' title='查看详情'></a><a href='<%=basePath%>/content/mainpage/institution-update.jsp?id="+arr[i].id+"' class='btnIconEdit' title='更新'></a></td></tr>";
            	   trNum++;
            	}
            	$('.commonTable').append(str);
             	fenye(1);//给出第一页数据
             	var currentPage = 1;
		 		createButton(trNum,currentPage);//生成页码 
			
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
     
     $('button').on('click',function(e){
     e.preventDefault();
     });
   

    $('button').on('click',function(){
    var select = $('#select').val();
    var orgname = $('#orgname').val();
    var orgcode = $('#orgcode').val();
    var areacode = $('#areacode').val();
   // alert(select+":"+orgname+":"+orgcode+":"+areacode);
   //alert("fuck!!!");
   
        $.ajax({  
            type:"post",      
            url:"<%=basePath %>selectorg",
            data:{select:select,orgname:orgname,orgcode:orgcode,areacode:areacode},  
            dataType:"json",  
            success:function(data){ 
            $('.seainfo').remove(); 
            
            	var arr = eval(data);
            	
            	var str = "";
            	
            	for(var i in arr){
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgno+"</td><td align='center'>"+arr[i].orgname+"</td><td align='center'>"+arr[i].exetype+"</td><td align='center'>"+arr[i].linkadd+"</td><td align='center'>"+arr[i].zipcode+"</td><td align='center'>"+arr[i].zbbdocdate+"</td><td align='center'><a href='<%=basePath%>/institutionview?id="+arr[i].id+"' class='btnIconView' title='查看详情'></a><a href='<%=basePath%>/content/mainpage/institution-update.jsp?id="+arr[i].id+"' class='btnIconEdit' title='更新'></a></td></tr>";
            	 
            	}
            	$('.commonTable').append(str);
                $('.pbut').remove();
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
	  <h2>&gt;&gt;建设项目审查</h2>
	</div>
	
	<form id="form-search" name="form-search" action="" method="post">
	    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
	        <tr>
	          <th align="right">专业类别：</th>
	          <td><select name="selectorgs" id="select">
	            <option value="1">行政部门</option>
	            <option value="2">卫生监督机构</option>
	            <option value="3">协作单位</option>
	          </select></td>
	          <td><div align="right">机构名称：</div></td>
	          <td><input name="orgname" type="text" class="orgname" id="orgname" /></td>
	          <td align="right">组织机构代码：</td>
	          <td align="right"><input name="orgcode" type="text" class="orgcode" id="orgcode" /></td>
	        </tr>
	        <tr>
	            <th align="right">行政区划：</th>
	            <td><input name="areacode" type="text" class="areacode" id="areacode" value="" /></td>
	            <td align="right">&nbsp;</td>
	            <td align="right">&nbsp;</td>
	            <td align="right">&nbsp;</td>
	            <td align="right"><button>检索</button>
	        </tr>
	    </table>
    </form>
    <!--//commonTableSearch-->
    
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="institutionfinal" title="创建机构" class="btnNormal">新增</a></li>
        </ul>
    </div>
    
<!--//content pages wrap-->
     <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th width="7%">申请单位（个人）</th>
            <th>机构名称</th>
            <th width="8%">专业类别</th>
            <th>经营地址</th>
            <th width="7%">邮政编码</th>
            <th width="7%">审核状态</th>
            <th class="editColM">操作</th>
        </tr>
        
           
            <c:forEach items="${ orglist}" var="orgs">
         <tr>
            <td width="7%">${orgs.orgno }</td>
            <td>${orgs.orgname }</td>
            <td width="8%">${orgs.exetype }</td>
            <td>${orgs.linkadd }</td>
            <td width="7%">${orgs.zipcode }</td>
            <td width="7%">${orgs.zbbdocdate }</td>
            <td class="editColM">
            <a href="<%=basePath%>/institutionview?id=${orgs.id }" class="btnIconView" title="查看详情"></a>
            	<a href="<%=basePath %>/content/mainpage/institution-update.jsp?id=${orgs.id}" class="btnIconEdit" title="更新"></a>
            </td>
            </tr>
           </c:forEach>
       
     </table>
     <!--   <form action="<%=basePath %>page" method="post" id="for">
    <input type="submit" name="currentPage" value="上一页">
    <input type="submit" name="currentPage" value="首页">
    
    <c:forEach items="${alls }" var="a"> 
    <input type="submit" name="currentPage" value="${a }">
   
    </c:forEach>  
    <input type="submit" name="currentPage" value="尾页">
    <input  type="submit" name="currentPage" value="下一页">
    <input type="submit" value="提交">
    <p style="color:red">${info }</p>
    <p style="color:red">${infoo }</p> 
 </form>  -->
 
 
  <div id="pagelist">
  
  </div>
 
</body>
</html>
