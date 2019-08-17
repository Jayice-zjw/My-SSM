<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 记得要补上这一条，否则不支持EL表达式 -->
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<form action="/sl/test.do" method="get">
		姓名:<input type="text" name="name">${nameError}<br> 年龄:<input
			type="text" name="age">${ageError}<br> 手机:<input
			type="text" name="phone">${phoneError}<br> <input
			type="submit" value="提交">
	</form>
</body>
</html>
