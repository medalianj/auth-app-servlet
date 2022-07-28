<%@ page import="com.authentification.backend.entities.Login" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28/07/2022
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Valid Login! Welcome user ......</title>
</head>
<body>
<center>
    <h1>
        <% Login currentUser = (Login) (session.getAttribute("currentSessionUser"));%>

        Welcome <%= currentUser.getFirstName() + " " + currentUser.getFamilyName() %>
    </h1>

</center>
</body>
</html>
