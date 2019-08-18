<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>monkey1024</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="page-header"></div>
<div class="container">
    <form action="/crud/update.do" method="post" style="max-width: 330px;padding: 15px;margin: 0 auto;">
        <input name="id" type="hidden" value="${id}">
        <div class="form-group">
            <label for="name">姓名:</label>
            <input type="text" class="form-control" id="name" name="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label for="phone">手机:</label>
            <input type="text" class="form-control" id="phone" name="phone" value="${user.phone}">
        </div>
        <div class="form-group">
            <label for="birthday">生日:</label>
            <input type="date" class="form-control" id="birthday" name="birthday" value="${user.birthday}">
        </div>
        <div class="form-group">
            <label for="address">地址:</label>
            <input type="text" class="form-control" id="address" name="address" value="${user.address}">
        </div>
        <input type="submit" value="提交">
    </form>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</body>
</html>
