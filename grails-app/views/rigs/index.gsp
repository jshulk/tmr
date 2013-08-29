<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="rig_user_layout"/>
<title>My Rigs</title>
</head>
<body>
	 	
	 <div class = "container">
	 	<div id ="rig-layout">
	 		<div class="notice">
  				<div class="notice-inner"></div>
			</div>
		<div class = "row" id = "rigs-row">
			<div class = "rigs" id = "rigs-list">
				
				
				
			</div><!-- end of rigs-list div -->
		</div><!-- end of rigs row -->
		
	</div><!-- end of rig-layout div  -->
		
	 	<%--<div id = "rig-layout">
	 		<div id = "rigs">
	 			<ul id = "rigs-list">
	 	
	 			</ul>
	 		</div>	 		
	 	</div>
	 --%>
	 
	 </div><!-- end of container div -->
	<g:render template = "/templates/addRig" />
	<script type = "text/javascript" src = "js/libs/require.js" data-main = "js/main" ></script>
</body>
</html>