<!doctype html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Thats My rig"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel = "stylesheet" type = 'text/css' href = "${resource(dir:'css', file:'rig.css') }" />
		<%--<script src = "${resource(dir:'js/libs', file:'jquery.js') }" ></script>
		<script src = "${resource(dir:'js', file:'bootstrap.min.js') }" ></script>
		--%>
		<%--<script src = "${resource(dir:'js', file:'perfect-scrollbar.with-mousewheel.min.js') }"></script>
 		--%><g:layoutHead/>
		<r:layoutResources />
	</head>
	<body>
		<g:render template = "/templates/userHeader" />
		<div class = 'container'>
		
		</div>
		<g:layoutBody/>
		<%--<g:render template = "/templates/footer" />
		
		--%><r:layoutResources />
	</body>
</html>