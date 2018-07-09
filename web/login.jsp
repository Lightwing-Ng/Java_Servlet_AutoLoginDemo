<%--
  Created by IntelliJ IDEA.
  User: lightwingng
  Date: 2018/7/9
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign In</title>
    <link rel="stylesheet" href="static/css/bootstrap.css">
    <link rel="stylesheet" href="static/css/general.css">
    <script src="static/js/jquery-3.3.1.min.js"></script>
    <script src="static/js/bootstrap.js"></script>
</head>
<body>
<div>
    <form action="LoginServlet" method="post">
        <table class="table table-hover" width="50%">
            <tr>
                <td>Username</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <tr>
                <td>Password</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="checkbox" name="auto_login">Auto Login
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Sign In" class="btn btn-primary btn-lg">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
