<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="rig_layout"/>
<title></title>
</head>
<body>
	  <div class="home-top-block">
	  <h2 class="home-question">What's your hardware of choice?</h2>
	  <p class="home-tagline">Share it with the world</p>
	  <div class="login-signup-block">
	    <a href="#" class="btn sign-up" data-toggle="modal" data-target="#signup-modal" role="button">Sign up</a>
	  </div>
	</div>
	<div class="tmr-on-desktop">
	  <img src = "${resource(dir:'images', file:'tmr-on-desktop.png') }" />
	</div>
	<g:render template = "/templates/signup" />
</body>
</html>