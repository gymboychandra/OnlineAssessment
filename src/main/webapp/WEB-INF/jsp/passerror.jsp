<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Error Page</title>
</head>
<body>
<h1 id="msg">Sorry your Password is Wrong !!! Login again !!!</h1>
<a href="${pageContext.request.contextPath}/">login again</a>
</body>
</html>