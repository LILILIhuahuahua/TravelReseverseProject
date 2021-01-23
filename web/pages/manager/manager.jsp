<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>机票管理</title>
<link type="text/css" rel="stylesheet" href="../../static/css/style.css" >
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
</style>
</head>
<body>
	
	<div id="header">
			<!--<img class="logo_img" alt="" src="../../static/img/logo.gif" >-->
			<span class="wel_word">旅游预订系统</span>
		<!--静态包含管理界面-->
		<%@include file="/pages/common/manager_mune.jsp"%>
	</div>
	
	<div id="main">
		<h1>欢迎进入旅游预订系统</h1>
	</div>

	<!--静态包含页脚内容-->
	<%@include file="/pages/common/footer.jsp"%>
</body>
</html>