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
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="js/jquery.treeview.js" type="text/javascript"></script>
<link href="css/jquery.treeview.css" rel="stylesheet" type="text/css" />

<script language="javascript">
$().ready(function(){
	
	//树状菜单生成 JQuery Treeview
	$("#browser").treeview({
		//animated菜单展开关闭时动画效果
		animated : "slow",
        //collapsed菜单载入时关闭还是展开
		collapsed: false
        //unique同一层次是否只允许展开一个
		//unique: true
	});
	//设置树状菜单外框DIV纵向滚动条属性为自动

    $("#nav-box").css("overflowY","auto");

	
		//自动添加a标签title为a标签中的内容
		for(var i=0; i<$("span.file a").length; i++ ){
			$("span.file a").eq(i).attr("title", $("span.file a").eq(i).text());
		}
	
});
	
	//链接转入index.html页面ID为content-box的iframe显示
	function urlTarget(urls) {
		$("#content-box",parent.document.body).attr("src",urls);
	}
</script>

</head>

<body class="inc-nav-body">
<div id="nav-box">

	<ul id="browser" class="filetree">
	    <c:forEach items="${plist }" var="power" varStatus="varindex">
                <c:if test="${fn:length(power.powerCode)==3 }">
                  <c:if test="${varindex.index!=0 }">
                  </ul>
                   </li>
                  </c:if>
                 
                  <li class="class1">
                      <span class="folder">${power.powerName }</span>
                      <ul>
                </c:if>
                 <c:if test="${fn:length(power.powerCode)==6 }">
                      <li><span class="file"><a onclick="urlTarget('content/mainpage/${power.powerUrl}')" target="content-box">${power.powerName }</a></span></li>
                </c:if>
            </c:forEach>   
	
	
	</ul>
  
</div>
</body>
</html>