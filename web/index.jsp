<%--
  Created by IntelliJ IDEA.
  User: lightwingng
  Date: 2018/7/9
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="static/css/bootstrap.css">
    <link rel="stylesheet" href="static/css/general.css">
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/bootstrap.js"></script>
</head>
<body>
<div>
    <h1>Welcome, This is the Home Page.</h1>
    <h1>
        <c:if test="${ not empty userBean }">
            Mx. ${ userBean.username }<span class="Platinum">PLATINUM</span>!
        </c:if>
        <c:if test="${ empty userBean }">
            <input type="button" onclick="location.href='login.jsp'" value="Sign In Here!"
                   class="btn btn-primary"/>
        </c:if>
    </h1>
</div>
</body>
</html>
