<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h2>Registration</h2>
<h4>Login</h4>
<form:form method="POST" action="${pageContext.request.contextPath}/registration/do" modelAttribute="userForm">
<table>
<tr><td><label>First Name:</label> </td>
<td><input type="text" name ="firstName" id="firstname"  minlength="1" pattern="[a-zA-Z]+" required="required"/></td></tr>
<tr><td><label>Last Name:</label></td>
<td><input type="text" name ="lastName" id="lastname" minlength="1" pattern="[a-zA-Z]+" required="required" /></td></tr>
<tr><td><label>Email ID:</label> </td>
<td><input type="email" name ="emailId" id="email" required="required"/></td></tr>
<tr><td><label>Password:</label></td>
<td><input type="password" name ="password" minlength="8" id="password" required="required" /></td></tr>
<tr>
<td><button type="submit" id="register">Submit</button></td>
</tr>
</table>
</form:form>
</body>
</html>