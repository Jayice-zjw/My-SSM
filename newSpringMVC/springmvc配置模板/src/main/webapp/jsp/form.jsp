<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user" method="get">
    姓名：<input type="text" name="name">${nameError}<br>
    年龄：<input type="text" name="age">${ageError}<br>
    <input type="submit" value="提交">
</form>
</body>
</html>