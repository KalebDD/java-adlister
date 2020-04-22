<%--
  Created by IntelliJ IDEA.
  User: kdd
  Date: 4/21/20
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
    <%@include file="partials/head-css.jsp" %>
</head>
<body>

    <%@include file="partials/navbar.jsp" %>

    <form name="login" method="POST">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">
        <br>
        <label for="password">Password</label>
        <input type="password" id="password" name="password">
        <br>
        <input type="submit" value="Submit">
    </form>

    <c:choose>
        <c:when test="${param.username.equals('admin') && param.password.equals('password')}">
            <c:redirect url="profile.jsp">
            </c:redirect>
        </c:when>
    </c:choose>

    <%@include file="partials/body-js.jsp" %>
</body>
</html>
