<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出租车预定系统</title>
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
		h2 {
			text-align: center;
			color: red;
		}

		h1 a {
			color:red;
		}
		input {

			width: 60px;
			text-align: center;
		}
	</style>
</head>
<body>
	
	<div id="header">
			<!--<img class="logo_img" alt="" src="../../static/img/logo.gif" >-->
			<span class="wel_word">出租车预定系统</span>
		<!--静态包含管理界面-->
		<%@include file="/pages/common/manager_mune.jsp"%>

	</div>
	<h2>${requestScope.result}</h2>
	<div id="main">
		<table align="center">
			<tr>
				<td>出租车ID</td>
				<td>城市</td>
				<td>出租车价格</td>
				<td>出租车总数</td>
				<td>出租车剩余数</td>
				<td>预定客户名字</td>
				<td colspan="2">操作</td>
			</tr>

				<!--使用JSTL进行全部图书的展示-->
				<c:forEach items="${requestScope.carList}" var="car">
					<tr>
						<form action="carServlet" method="get">
							<input type="hidden" name="action" value="resevaseCar" />
							<td><input align="id" name="id" type="text" value="${car.id}"/></td>
							<td><input name="location" type="text" value="${car.location}"/></td>
							<td><input name="price" type="text" value="${car.price}"/></td>
							<td><input name="numCars" type="text" value="${car.numCars}"/></td>
							<td><input name="numAvail" type="text" value="${car.numAvail}"/></td>
							<td><input name="custName" type="text" /></td>
							<td><input type="submit" value="预定"/></td>
						</form>
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