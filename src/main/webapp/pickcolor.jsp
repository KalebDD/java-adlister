<%--
  Created by IntelliJ IDEA.
  User: kdd
  Date: 4/21/20
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Pick Color</title>
</head>

<body>
<form name="colorpicker" method="POST">
    <label for="colorpicker">
        <h1>Type Your favorite Color!</h1>
    </label>
    <input type="text" id="colorpicker" name="colorpicker">
    <input type="submit" value="Submit" id="button">
</form>

<%@include file="partials/body-js.jsp" %>

<script type="text/javascript">
    $("#button").on("click", function () {
        let color = $(this.val());
        console.log(color);
        $('body').css('background-color', color);
    });
</script>
</body>
</html>
