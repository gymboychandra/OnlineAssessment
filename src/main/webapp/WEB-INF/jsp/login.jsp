<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Assessment - Home Page</title>
</head>
<body>
<h1>Welcome to Online Assessments</h1>
<h3>Login</h3>
<form:form method="POST" action="${pageContext.request.contextPath}/login/do"	modelAttribute="userForm">
<table>
<tr><td><label>Email ID:</label> </td>
<td><input type="email" name ="emailId" id="email" required="required"/></td></tr>
<tr><td><label>Password:</label></td>
<td><input type="password" name ="password" id="password" required="required" /></td></tr>
<tr>
<td><button type="submit" id="login">LOGIN</button></td>
</tr>
<tr>
<td><label>New User ?</label></td>
<td>
<a href="${pageContext.request.contextPath}/register.html">register here</a></td>
</tr>
</table>
</form:form>
</body>
</html>