<%@ page import="java.util.List" %>
<%@ page import="com.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>页面展示</h1>
<%
    List<User> userList = (List<User>) request.getAttribute("userList");
    System.out.println(userList);
%>
    <c:forEach items="${userList}" var="user">
        <c:out value="${user.id}"></c:out>
        <c:out value="${user.username}"></c:out>
        <fmt:formatDate value="${user.bir}" pattern="yyyy-MM-dd"></fmt:formatDate>
    </c:forEach>
</body>
</html>