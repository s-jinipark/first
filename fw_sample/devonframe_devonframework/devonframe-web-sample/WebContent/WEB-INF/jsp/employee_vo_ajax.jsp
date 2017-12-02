<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>LG CNS devonframe</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resource/addon/datatables/jquery.dataTables.min.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/resource/css/BX_style.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resource/css/common.css'/>">


<script type="text/javascript" src="<c:url value='/resource/addon/jquery/js/jquery-1.11.2.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/jquery/js/jquery-ui.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/jquery/js/jquery.accordion.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/bootstrap/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/datepicker/js/bootstrap-datepicker.min_customized.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/datatables/jquery.dataTables.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/datatables/dataTables.colReorder.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/datatables/scrolling.js'/>"></script>

<script type="text/javascript" src="<c:url value='/resource/js/BX_js_common.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/js/BX_js_datatable.js'/>"></script>


<!--[if lt IE 9]>
<script type="text/javascript" src="<c:url value='/resource/addon/html5shiv-master/dist/html5shiv.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/html5shiv-master/dist/html5shiv-printshiv.min.js'/>"></script>
<![endif]-->
<script type="text/javascript">
	$(window).ready(function () {
		$('.page-navigation a').click(function () {
			$('.page-navigation a').removeClass('active');
			$(this).addClass('active');
		});
		$('.topMenu a').click(function () {
			$('.topMenu a').removeClass();
			$(this).addClass('active');
			var topMenu = $(this).text();
				$('.titleD1').text(topMenu);
		});
		
		$('#datatable').DataTable( {
	        processing : true,
	        bFilter : false,
	        bLengthChange : false,
	        order : [[1, 'asc']],
	        data : [],
	        createdRow: function ( row, data, index ) {
	        },
	        
	        columns: [
	            { title: "사원번호" },
	            { title: "이름"},
	            { title: "직위"},
	            { title: "스킬"},
	            { title: "연락처"},
	            { title: "생년월일"}
	        ]
	    } );
		
		$("#searchBtn").on("click", function(e) {
			retrieveEmployeeList();
		});
	});
	
	function retrieveEmployeeList() {
		$.ajax({
			type: "post",
			url : "/devonframe-web-sample/employee/retrieveEmployeeList.ajax",
			data: null,
			dataType: "text",
			async: true,
			success: function(data, status) {
				var table = $("#datatable").dataTable();
			    table.fnClearTable();
			    parsedData = $.parseJSON(data);
			    var iMax = parsedData.resultList.length;
			    for (var idx = 0; idx < iMax; idx++) {
			    	var row = parsedData.resultList[idx];
			    	var num = row.num;
			    	var name = row.name;
			    	var joblevelCodeName = row.joblevelCodeName;
			    	var skillCodeName = row.skillCodeName;
			    	var telephone = row.telephone;
			    	var birthdate = row.birthdate;
			    	
			    	table.fnAddData([num, name, joblevelCodeName, skillCodeName, telephone, birthdate]);
			    }
			},
			error: function(xhr, status, err) {
				alert(err);
			}
		});
	}
</script>
</head>
<body class="frameBody">
	<!-- page-container start -->
    <div class="page-container secondP">
    	<!-- page-head start -->
		<header class="page-head">
        	<a class="leftCon" href="#"><img src="<c:url value='/resource/images/ico_leftCon.png" alt="Left Navigation Control'/>" /></a>
            <div class="topMenu">
            	<ul>
					<li><a href="<c:url value='/main.do' />">메인</a></li>
                </ul>
            </div>
            <ul>
            	<li class="topUser">
                	<img src="<c:url value='/resource/images/noPhoto.png" alt="No Photo now'/>" />
                    <h2>Gildong Hong</h2>
                    <span>LG CNS</span>
				</li>
            </ul>
        </header>
        <!-- //page-head end -->
        <!-- page-left start -->
		<nav class="page-left leftOpen">
        	<div class="sysLogo">
            	<a href="<c:url value='/main.do' />" >
                	<img src="<c:url value='/resource/images/sysLogo2.png" alt="LG CNS Smart Solution'/>" />
                </a>
            </div>
        	<div class="page-navigation">
            	<section class="titleD1">devonframe</section>
            	<section id="leftNav" data-accordion-group>
                    <a class="depth1 hasNoChild" href="<c:url value='/employee/retrieveEmployeeList.do' />" ><div>사원정보조회(VO, Form)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/employee/retrieveEmployeeAjaxPage.do' />"><div class="active">사원정보조회(VO, Ajax)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/user/retrieveUserList.do' />" ><div>사용자정보조회(VO, Form)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/user/retrieveUserAjaxPage.do' />" ><div>사용자정보조회(VO, Ajax)</div></a>
				</section>
        	</div>
		</nav>
		<!-- //page-left end -->
        
        <!-- page-content start -->
		<section class="page-content container-fluid" >
			<div style="overflow-y: auto; max-height:600px; padding:20px;">
				<article class="widget">
			    	<div class="widget-title">
			            <h2>사원정보조회(VO, ajax)</h2>
			        </div>
			    </article>
			    <article class="widget">
				    <div class="widget-content">
				        <div class="search search-single">
				            <div class="search-content">
				                <fieldset>
				                    <div class="row">
<!-- 				                        <div class="col-xs-4" style="text-align:right;"> -->
<!-- 				                                <label for="accNum" style="margin: 5px 10px 0px 0px;">&nbsp;</label> -->
<!-- 				                        </div> -->
<!-- 				                        <div class="col-xs-4"> -->
<!-- 				                            <div class="col-xs-12"> -->
<!-- 				                            </div> -->
<!-- 				                        </div> -->
				                        <span class="searchBtn pull-right"><button type="button" id="searchBtn">조회</button></span>
				                    </div>
				                </fieldset>
				            </div>
				        </div>
				    </div>
				</article>
				<article class="widget">
					<div class="widget-content listTable">
	                <table id="datatable">
	                </table>
				    </div>
				</article>
			</div>
		</section>
        <!-- //page-content end -->
    </div>
    <!-- //page-container end -->
</body>
</html>
