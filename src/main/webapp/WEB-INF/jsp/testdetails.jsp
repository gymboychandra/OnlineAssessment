<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tests Details</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Test Date</th>
			<th>Assessment</th>
			<th>Test Marks</th>
			<th>Email ID</th>
			<th>Total Marks</th>
			<th>Result</th>
		</tr>
		<c:forEach var="test" items="${tests}" varStatus="testIndex">
			<tr>
				<td><span id="testDate${testIndex.count}"> <c:out
							value="${test.testDate}" />
				</span></td>
				<td><span id="assessment${testIndex.count}"> <c:out
							value="${test.assessment}" />
				</span></td>
				<td><span id="result${testIndex.count}"> <c:out
							value="${test.testMarks}" />
				</span></td>
				<td><span id="email${testIndex.count}"> <c:out
							value="${test.emailId}" />
				</span></td>
				<td><span id="totalMarks${testIndex.count}"> <c:out
							value="${test.totalMarks}" />
				</span></td>
				<td><span id="result${testIndex.count}"> <c:out
							value="${test.result}" />
				</span></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>