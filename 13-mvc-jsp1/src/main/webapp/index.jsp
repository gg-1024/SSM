<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<body>
    <h2>Hello World!</h2>

    <a href="${pageContext.request.contextPath}/user">获取所有用户信息</a>
    <a href="${pageContext.request.contextPath}/user/{1}">根据id查询用户信息</a>

    <form action="${pageContext.request.contextPath}/user/" method="post">
        <input type="hidden" name="_method" value="DELETE">
        id：<input type="text" name="id">
        <input type="submit" value="删除">
    </form><br>

    <form action="${pageContext.request.contextPath}/user/" method="post">
        用户名：<input type="text" name="username">
        id：<input type="text" name="id">
        <input type="submit" value="添加">
    </form><br>

    <form action="${pageContext.request.contextPath}/user/" method="post">
        <input type="hidden" name="_method" value="PUT">
        用户名：<input type="text" name="username">
        id：<input type="text" name="id">
        <input type="submit" value="修改">
    </form><br>

    <a href="${pageContext.request.contextPath}/forward1">forward1</a>


    <a href="${pageContext.request.contextPath}/responseBodyTest">responseBodyTest</a>
    <br><br><br><br>
    <a href="${pageContext.request.contextPath}/responseAPI">responseAPI</a>
</body>
</html>
