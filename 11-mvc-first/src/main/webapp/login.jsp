<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/para3" method="post">
    name:<input type="text" name="username"><br>
    password <input type="password" name="password"><br>
    hobbies <input type="checkbox" name="hobby" value="a">a
     <input type="checkbox" name="hobby" value="b">b
     <input type="checkbox" name="hobby" value="c">c<br>
    <input type="submit">
</form>
</body>
</html>
