<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>monkey1024</title>
    <link href="css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container theme-showcase" role="main">
    <div class="page-header">
        <form id="queryById" action="/findById.do" method="post">
            <input type="text" name="id" placeholder="请输入id" value="${id}">
            <button id="query" type="button" class="btn btn-sm btn-primary">查询</button>
            <a id="add" type="button" class="btn btn-sm btn-success" href="/jsp/user_add.jsp">添加</a>
        </form>

    </div>
    <div class="row">
        <div class="">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>手机</th>
                    <th>生日</th>
                    <th>地址</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${allUser}" var="user">
                        <tr>
                            <td>${user.key}</td>
                            <td>${user.value.name}</td>
                            <td>${user.value.phone}</td>
                            <td>${user.value.birthday}</td>
                            <td>${user.value.address}</td>
                            <td>
                                <a type="button" class="btn btn-sm btn-info" href="/delete.do?id=${user.key}">删除</a>
                                <a type="button" class="btn btn-sm btn-warning" href="/goUpdate.do?id=${user.key}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script>
    $(function () {

        $("#query").click(function () {
            $("#queryById").submit();
        })

    });

</script>
</body>
</html>
