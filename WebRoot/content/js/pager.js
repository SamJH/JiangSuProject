
  	var ePageNum = 5; 
  	var pageNum=0;   
    
   	function createButton(trNum,currentPage){
   	 pageNum = parseInt(trNum/ePageNum) ;
  	  if(trNum%ePageNum!=0){
  	  	pageNum++;
  	  }

  	  $(".pbut").remove();
  	  $('.page').remove();
  	  
  	  str1="<span class='page'>当前第   <span id='cur1'>"+currentPage+"</span>页    </span>";
  	  $('#pagelist').append(str1);
  	  str5="<a class='pbut' name='4'>首页   </a>";
  	  $('#pagelist').append(str5);
  	  str2="<a class='pbut' name='1'>上一页    </a>";
  	  $('#pagelist').append(str2);
  	  for(var i=1;i<=pageNum;i++){
  	  	str = "<a class='pbut' name='2'>"+i+"  "+"</a>";
  	  	
  	  	$("#pagelist").append(str);
  	  }
  	  str3="<a class='pbut' name='3'>下一页     </a>";
  	  $('#pagelist').append(str3);
  	  str6="<a class='pbut' name='5'>尾页    </a>";
  	  $('#pagelist').append(str6);
  	  str4="<span class='page'>   页数<span id='cur2'>"+pageNum+"</span>页</span>";
  	  $('#pagelist').append(str4);
  	  
  	  $(".pbut").click(function(){
  	  	if($(this).attr("name")=="1"&&currentPage>1){
  	  	  currentPage--;
  	  	}else if($(this).attr("name")=="3"&&currentPage<pageNum){
  	  	  currentPage++;
  	  	}else if($(this).attr("name")=="2"){
  	  	  currentPage = $(this).html();
  	  	}else if($(this).attr("name")=="4"){
  	  	  currentPage = 1;
  	  	}else if($(this).attr("name")=="5"){
  	  	  currentPage = pageNum;
  	  	}
  	  	$('#cur1').html(currentPage);
  	  	
  	  	fenye(currentPage);
  	  });
  	}
   	  function fenye(curPageNum){
			  var befor = (curPageNum-1)*ePageNum;
			  var after = curPageNum*ePageNum-1;
			 
			  $(".seainfo").css("display","");
			//  alert(befor+" : "+after);
				$(".seainfo:lt("+befor+")").css("display","none");
				$(".seainfo:gt("+after+")").css("display","none");
	
  		}
  
