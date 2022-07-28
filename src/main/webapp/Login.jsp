<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Login</title>
</head>
<body>
<h1><%= "Authentification" %>
</h1>
<br/>
<form action="LoginServlet" method="get">

  Please enter your username
  <input type="text" name="un"/><br>

  Please enter your password
  <input type="text" name="pw"/>

  <input type="submit" value="submit">

</form>
</body>
</html>