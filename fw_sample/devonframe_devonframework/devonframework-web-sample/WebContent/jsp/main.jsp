<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>LG CNS DevOn Framework</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resource/css/BX_style.css'/>" />
<script type="text/javascript" src="<c:url value='/resource/addon/jquery/js/jquery-1.11.2.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/js/BX_js_common.js'/>"></script>
<script type="text/javascript" src="<c:url value='/resource/addon/jquery/js/jquery.accordion.js'/>"></script>

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
	});
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
            	<section class="titleD1">DevOn Framework</section>
            	<section id="leftNav" data-accordion-group>
                    <a class="depth1 hasNoChild" href="<c:url value='/employee/retrieveEmployeeList.do' />" ><div>사원정보조회(VO, Form)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/employee/retrieveEmployeeAjaxPage.do' />"><div>사원정보조회(VO, Ajax)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/user/retrieveUserList.do' />" ><div>사용자정보조회(VO, Form)</div></a>
                    <a class="depth1 hasNoChild" href="<c:url value='/user/retrieveUserAjaxPage.do' />" ><div>사용자정보조회(VO, Form)</div></a>
				</section>
        	</div>
		</nav>
		<!-- //page-left end -->
        
        <!-- page-content start -->
		<section class="page-content container-fluid" style="overflow-y: auto; padding-top: 20px; margin-left: 5px;">
			<article class="widget">
		    	<div class="widget-title">
		            <h2>DevOn Framework sample</h2>
		        </div>
		    </article>
			<article class="widget">
			    <span class="depth1 hasNoChild" href="#" >
			        <div><span style="font-weight: 600;">사원정보조회(VO, Form)</span>
			        &nbsp; Employee VO를 이용하여 사원정보 조회를 하는 샘플 페이지로 거래에 대한 응답으로 JSP페이지가 넘어온다. 
			        </div>
			    </span>
			    <span class="depth1 hasNoChild" href="#" >
			        <div><span style="font-weight: 600;">사원정보조회(VO, Ajax)</span>
			        &nbsp; Employee VO를 이용하여 사원정보 조회를 하는 샘플 페이지로 거래에 대한 응답으로 JSON이 넘어온다.
			        </div>
			    </span>
			    <span class="depth1 hasNoChild" href="#" >
			        <div><span style="font-weight: 600;">사용자 정보조회(Map, Form)</span>
			        &nbsp; User Vo를 이용하여 사용자 정보 조회를 하는 샘플 페이지로 거래에 대한 응답으로 JSP페이지가 넘어온다. 
			        </div>
			    </span>
			    <span class="depth1 hasNoChild" href="#" >
			        <div><span style="font-weight: 600;">사용자 정보조회(Map, Ajax)</span>
			        &nbsp; User Vo를 이용하여 사용자 정보 조회를 하는 샘플 페이지로 거래에 대한 응답으로 JSON페이지가 넘어온다.
			        </div>
			    </span>
			</article>
		</section>
        <!-- //page-content end -->
    </div>
    <!-- //page-container end -->
</body>
</html>
