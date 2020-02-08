<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Reports</title>
</head>
<body>
<h1 id="msg">Select Reports</h1>
<a href="${pageContext.request.contextPath}/users/all">View list of all candidates</a>
<br/>
<a href="${pageContext.request.contextPath}/tests/all">View list of all tests taken</a>
<br/>
<a href="${pageContext.request.contextPath}/">Logout</a>
</body>
</html>