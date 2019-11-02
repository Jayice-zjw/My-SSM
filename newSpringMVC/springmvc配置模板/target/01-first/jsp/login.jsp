<%--
  Created by IntelliJ IDEA.
  User: 2019.10
  Date: 2019/11/2
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--当访问该页面的时候，就表示用户已登录-->
<%
    request.getSession().setAttribute("user", "jayice");
%>
</body>
</html>
