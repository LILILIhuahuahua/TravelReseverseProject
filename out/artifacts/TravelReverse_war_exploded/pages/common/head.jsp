<%--
  Created by IntelliJ IDEA.
  User: LI
  Date: 2021/1/22
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--共同获取服务器的访问路径-->
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>

<!--每个jsp文件相同的head信息抽出出来，使用jsp的静态包含-->
<!--写 base 标签，永远固定相对路径跳转的结果-->
<base href="<%=basePath%>>">
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>

