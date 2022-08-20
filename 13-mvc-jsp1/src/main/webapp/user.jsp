<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/rest/user">获取所有的用户</a>
<a href="${pageContext.request.contextPath}/rest/user/1">获取一个用户</a>
${requestScope.user.toString()}

<form action="${pageContext.request.contextPath}/rest/user" method="post">
    <input type="hidden" name="_method" value="PUT">
    id:<input type="text" name="id"><br>
    username:<input type="text" name="username"><br>
    password:<input type="text" name="password"><br>
    <input type="submit" value="提交"><br>
</form>

</body>
</html>
