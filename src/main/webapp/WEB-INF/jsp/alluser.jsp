<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All User Details</title>
</head>
<body>
	<table border="1">
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email Id</th>
	<th>User Type</th>
	</tr>
		<c:forEach var="user" items="${users}" varStatus="userIndex">
			<tr>
				<td id="firstName${userIndex.count}">
				<c:out value="${user.firstName}"/>
				</td>
				<td id="lastName${userIndex.count}">
					<c:out value="${user.lastName}"/>
				</td>
				<td id="email${userIndex.count}">
					<c:out value="${user.emailId}"/>
				</td>
				<td id="userType${userIndex.count}">
					<c:out value="${user.userType}"/>
				</td>				
			</tr>
		</c:forEach>	
	</table>
</body>
</html>