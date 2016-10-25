<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>江苏省卫生监督业务系统</title>
<link href="<%=basePath %>/content/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/content/js/jquery-3.0.0.js" type="text/javascript"></script>
<script src="<%=basePath %>/content/js/pager.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
    $('#select').on('change',function(){
        $.ajax({  
            type:"post",      
            url:"selectofficeByorgId?select="+$("#select").val(),
            data:$("#select").val(),  
            dataType:"json",  
            success:function(data){ 
            $('.commonTable').find("tr:not(:first)").remove(); 
            	var arr = eval(data);
            	var str = "";
            	var trNum = 0;
            	for(var i in arr){
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgno+"<input type='hidden' value='"+arr[i].id+"' id='sectionid'></td><td align='center'>"+arr[i].exetype+"</td><td align='center'>"+arr[i].divcode+"</td><td align='center'>"+arr[i].divname+"</td><td align='center'>"+arr[i].dutytel+"</td><td align='center'>"+arr[i].fax+"</td><td align='center'>"+arr[i].divroomno+"</td><td align='center'><a href='<%=basePath%>/selectofficeservlet?id="+arr[i].id+"' class='btnIconEdit' title='更新'></a><a href='deletesection?id="+arr[i].id+"' class='btnIconDel' title='注销'></a></td></tr>";
            		trNum++;
            	}
            	$('.commonTable').append(str);
            	fenye(1);
            	var currentPage = 1;
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

    $('button').on('click',function(e){
    e.preventDefault();
    });


    $('button').on('click',function(){
    
    var orgid = $('#select').val();
    var divname = $('#divname').val();
    
        $.ajax({  
            type:"post",      
            url:"<%=basePath %>findoffice",
            data:{orgid:orgid,divname:divname},  
            dataType:"json",  
            success:function(data){ 
            $('.commonTable').find("tr:not(:first)").remove(); 
            	var arr = eval(data);
            	var str = "";
            	var trNum = 0;
            	for(var i in arr){
            		str+="<tr class='seainfo'><td align='center'>"+arr[i].orgno+"</td><td align='center'>"+arr[i].exetype+"</td><td align='center'>"+arr[i].divcode+"</td><td align='center'>"+arr[i].divname+"</td><td align='center'>"+arr[i].dutytel+"</td><td align='center'>"+arr[i].fax+"</td><td align='center'>"+arr[i].divroomno+"</td><td align='center'><a href='<%=basePath%>/selectofficeservlet?id="+arr[i].id+"' class='btnIconEdit' title='更新'></a><a href='#' class='btnIconDel' title='注销'></a></td></tr>";
            		trNum++;
            	}
            	$('.commonTable').append(str);
            	fenye(1);
            	var currentPage = 1;
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
    <div class="commonTitle"><h2>&gt;&gt; 科室管理</h2></div>
     	<form id="form-search" name="form-search"  action="" method="post">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
      
        <tr>
            <td width="40" align="center"><img src="<%=basePath %>/content/images/icon-search.png" width="16" height="16" alt="检索" /></td>
            <th align="right">机构名称：</th>
            <td><select name="selectOrganization" id="select">
              <c:forEach items="${Organizationlist }" var="org">
                <option value="${org.id }">${org.orgname }</option>
              </c:forEach>
			</select></td>
            <th >科室名称：</th>
            <td><input name="divname" type="text" class="inputTextNormal" id="divname"/></td>
            <td align="right"><button>检索</button>
        </tr>
       </table>
       </form>
    <!--//commonTableSearch-->
    <div class="btnBar">
    	<ul class="clearfix">
        	<li><a href="<%=basePath %>content/mainpage/office-creat.jsp" title="创建科室" class="btnNormal">创建科室</a></li>
        </ul>
    </div>
     <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
        <tr>
            <th width="7%">机构编码</th>
            <th width="8%">行政类别</th>
            <th>科室编码</th>
            <th>科室名称</th>
            <th width="8%">电话号码</th>
            <th width="8%">传真号码</th>
            <th width="5%">门号</th>
            <th class="editColS">编辑</th>
        </tr>
          <c:forEach items="${sectionlists }" var="seclist">
          <tr>
           <td width="7%">${seclist.orgno }</td>
            <td width="8%">${seclist.exetype }</td>
            <td>${seclist.divcode}</td>
            <td>${seclist.divname}</td>
            <td width="8%">${seclist.dutytel }</td>
            <td width="8%">${seclist.fax}</td>
            <td width="5%">${seclist.divroomno }</td>
            <td align='center'><a href='<%=basePath%>/selectofficeservlet?id=${seclist.id }' class='btnIconEdit' title='更新'></a><a href='#' class='btnIconDel' title='注销'></a></td>
     <!--       <td align='center'>
              <form action="<%=basePath %>content/mainpage/office-edit.jsp">
                <input type="hidden" value="${seclist.id }" name="id">
                <input type="hidden" value="${seclist.divcode}" name="divcode">
                <input type="hidden" value="${seclist.divname}" name="divname">
                <input type="hidden" value="${seclist.ifsub}" name="ifsub">
                <input type="hidden" value="${seclist.dutytel }" name="dutytel">
                <input type="hidden" value="${seclist.fax}" name="fax">
                <input type="hidden" value="${seclist.divroomno }" name="divroomno">
            	<input type="submit" value="更新" class="btnShort">
        	    <input type="submit" value="注销" class="btnShort">
            </form>        -->
            
            </tr>
          </c:forEach>    
    </table>
 <!--    <form action="<%=basePath %>sectionpage" method="post">
    <input type="submit" name="currentPage" value="上一页">
    <input type="submit" name="currentPage" value="首页">
    
    <c:forEach items="${all }" var="a"> 
    <input type="submit" name="currentPage" value="${a}">
   
    </c:forEach>
    <input type="submit" name="currentPage" value="尾页">
    <input type="submit" name="currentPage" value="下一页">
    <p style="color:red">${info }</p>
    <p style="color:red">${infoo }</p>
    </form>   --> 
    </div>
    <div id="pagelist">
    
    </div>
    
<!--//content pages wrap-->
</body>
</html>
