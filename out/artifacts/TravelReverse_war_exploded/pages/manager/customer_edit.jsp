<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑客户</title>
<link type="text/css" rel="stylesheet" href="../../static/css/style.css" >
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	input {

		text-align: center;
	}

</style>
</head>
<body>
		<div id="header">
			<!--<img class="logo_img" alt="" src="../../static/img/logo.gif" >-->
			<span class="wel_word">编辑客户信息</span>
			<!--静态包含管理界面-->
			<%@include file="/pages/common/manager_mune.jsp"%>
		</div>
		
		<div id="main">
			<form action="customerServlet" method="get">
				<input type="hidden" name="action" value="${param.method}" />

				<table>
					<tr>
						<td>客户ID</td>
						<td>客户姓名</td>
						<td colspan="2">操作</td>
					</tr>		
					<tr>
						<td><input name="id" type="text" value="${requestScope.customer.id}"/></td>
						<td><input name="custName" type="text" value="${requestScope.customer.custName}"/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>	
				</table>
			</form>
			
	
		</div>

		<!--静态包含页脚内容-->
		<%@include file="/pages/common/footer.jsp"%>
</body>
</html>