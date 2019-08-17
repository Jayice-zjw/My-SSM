<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/map1/user/params01.do">
		姓名:<input type="text" name="username">
		 <br>
		年龄<inputtype="text" name="age">
		 <br>
		 学校:<input type="text"name="school.schoolname">
		 <br>
		 学校地址:<input type="text"name="school.schooladress">
		 <br>
		 <input type="submit"value="提交"><br>
	</form>

	<a href="/map1/jsp/result.jsp">dian</a>

</body>
</html>
