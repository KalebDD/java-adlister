<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register Now"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>Register Now!</h1>
    <form action="/register" method="POST">
        <div class="form-group">
            <label for="new-username">Create Username</label>
            <input id="new-username" name="new-username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="new-password">Create Password</label>
            <input id="new-password" name="new-password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Complete Registration">
    </form>
</div>
</body>
</html>
