<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<h1 align="center"><strong>You Can Login Here into Demo Of Spring MVC</strong></h1>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Login Form</title>
</head>
<body>
<form action="checklogin" method="POST">
<table align=center>
<tr>
<td>User Name</td>
<td><input type="text" name="uname" required /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd" required/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form><br/>
<h2 align=center style="color:green"><c:out value="${message}"></c:out></h2>
</body>
</html>