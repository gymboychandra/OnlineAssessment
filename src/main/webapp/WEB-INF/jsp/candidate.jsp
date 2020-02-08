<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Tests</title>
</head>
<body>
<form:form>
<div id="msg">Select the Test</div>
<a href="${pageContext.request.contextPath}/springAssessment.html">Spring Assessment</a><br/>
<a href="${pageContext.request.contextPath}/hibernateAssessment.html">Hibernate Assessment</a><br/>
<a href="${pageContext.request.contextPath}/">Logout</a>
</form:form>
</body>
</html>