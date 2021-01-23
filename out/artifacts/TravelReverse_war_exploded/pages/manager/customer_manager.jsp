<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户管理</title>
<link type="text/css" rel="stylesheet" href="../../static/css/style.css" >
	<script type="text/javascript">
		$(function(){
			// 给删除的 a 标签绑定单击事件，用于删除的确认提示操作
			$("a.deleteClass").click(function () {

				/**
				 * confirm 是确认提示框函数
				 * 参数是它的提示内容
				 * 它有两个按钮，一个确认，一个是取消。
				 * 返回 true 表示点击了，确认，返回 false 表示点击取消。
				 */
				// 在事件的 function 函数中，有一个 this 对象。这个 this 对象，是当前正在响应事件的 dom 对象。
				//(this).parent().parent().find("td:first").text()是通过a标签找到显示bookName的td标签
				return confirm("你确定要删除【" + $(this).parent().parent().find("td:last").text() + "】?");
				// return false// 阻止元素的默认行为===不提交请求
			});
		});
	</script>
</head>
<body>
	
	<div id="header">
			<!--<img class="logo_img" alt="" src="../../static/img/logo.gif" >-->
			<span class="wel_word">客户管理系统</span>
		<!--静态包含管理界面-->
		<%@include file="/pages/common/manager_mune.jsp"%>
	</div>
	
	<div id="main">
		<table align="center">
			<tr>
				<td>客户ID</td>
				<td>客户名字</td>
				<td colspan="3">操作</td>
			</tr>
			<!--使用JSTL进行全部图书的展示-->
			<c:forEach items="${requestScope.customerList}" var="customer">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.custName}</td>
					<td><a href="customerServlet?action=getCustomer&custName=${customer.custName}&method=updateCustomer">修改</a></td>
					<td><a class="deleteClass" href="customerServlet?action=deleteCustomer&custName=${customer.custName}">删除</a></td>
					<td><a class="deleteClass" href="customerServlet?action=detailCustomerReservation&custName=${customer.custName}">详情</a></td>
				</tr>
			</c:forEach>
			
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="customer_edit.jsp?method=addCustomer">添加客户</a></td>
			</tr>	
		</table>
	</div>

	<!--静态包含页脚内容-->
	<%@include file="/pages/common/footer.jsp"%>
</body>
</html>