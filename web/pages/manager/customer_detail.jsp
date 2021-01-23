<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户预定详情</title>
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
	<style type="text/css">
			h1 {
		text-align: center;
		margin-top: 200px;
	}
	h3 {
		color: red;
		margin-left: 50px;
	}
	h2{
		margin-left: 50px;
		margin-bottom: 10px;
	}
	h1 a {
		color:red;
	}
	input {

		width: 60px;
		text-align: center;
	}
	table{
		margin-bottom: 10px;
	}
	</style>
</head>
<body>
	
	<div id="header">
			<!--<img class="logo_img" alt="" src="../../static/img/logo.gif" >-->
			<span class="wel_word">客户预定详情</span>
		<!--静态包含管理界面-->
		<%@include file="/pages/common/manager_mune.jsp"%>

	</div>

	<div id="main">

		<h2>"${requestScope.reserDetail.customer.custName}"的预约详情</h2>
		<h2>总价：</h2>
		<h3>${requestScope.reserDetail.sumPrice}</h3>
		<table align="center" >
			<tr>
				<td>预定ID</td>
				<td>预约类型</td>
				<td>预约详情</td>
				<td>价格</td>
				<td colspan="1">操作</td>
			</tr>
			<!--使用JSTL进行全部图书的展示-->
			<c:forEach items="${requestScope.reserDetail.reserItems}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.resvType}</td>
					<td>${item.resvDetail}</td>
					<td>${item.price}</td>
					<td><a class="deleteClass" >删除</a></td>
				</tr>
			</c:forEach>

			
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>	
		</table>
	</div>

	<!--静态包含页脚内容-->
	<%@include file="/pages/common/footer.jsp"%>
</body>
</html>