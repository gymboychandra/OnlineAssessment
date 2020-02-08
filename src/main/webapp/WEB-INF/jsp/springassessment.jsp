<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Assessment</title>
</head>
<body>
<h2>Spring Assessment</h2>
<form:form method="POST" action="${pageContext.request.contextPath}/evaluate/spring/test"	modelAttribute="spring">
<table>
<tr><td><label>Question 1: What is spring?</label></td></tr>
<tr><td><input type="radio" id="Q1-Opt1" value="J2EE App Server" name="Question1"/>J2EE App Server</td></tr>
<tr><td><input type="radio" id="Q1-Opt2" value="J2EE App Development Framework" name="Question1"/>J2EE App Development Framework</td></tr>
<tr><td><input type="radio" id="Q1-Opt3" name="Question1" value="Configuration Management Tool"/>Configuration Management Tool</td></tr>
<tr><td><input type="radio" id="Q1-Opt4" value="Build Tool" name="Question1"/>Build Tool</td></tr>

<tr><td><label>Question 2: What is the full form of IOC?</label></td></tr>
<tr><td><input type="radio" id="Q2-Opt1" name="Question2" value="Inversion Of Control"/>Inversion Of Control</td></tr>
<tr><td><input type="radio" id="Q2-Opt2" name="Question2" value="Interjection of Control"/>Interjection of Control</td></tr>
<tr><td><input type="radio" id="Q2-Opt3" name="Question2" value="Internal Object Control"/>Internal Object Control</td></tr>
<tr><td><input type="radio" id="Q2-Opt4" name="Question2" value="In-built Object Control"/>In-built Object Control</td></tr>


<tr><td><label>Question 3: What is the full form of AOP?</label></td></tr>
<tr><td><input type="radio" id="Q3-Opt1" name="Question3" value="Anticipation of Properties"/>Anticipation of Properties</td></tr>
<tr><td><input type="radio" id="Q3-Opt2" name="Question3" value="Aspect Oriented Programming"/>Aspect Oriented Programming</td></tr>
<tr><td><input type="radio" id="Q3-Opt3" name="Question3" value="Associated Object Programming"/>Associated Object Programming</td></tr>
<tr><td><input type="radio" id="Q3-Opt4" name="Question3"  value="Anti Object Programming"/>Anti Object Programming</td></tr>


<tr><td><label>Question 4: Which of the below is a spring container?</label></td></tr>
<tr><td><input type="radio" id="Q4-Opt1" name="Question4" value="View Resolver"/>View Resolver</td></tr>
<tr><td><input type="radio" id="Q4-Opt2" name="Question4" value="Application Context"/>Application Context</td></tr>
<tr><td><input type="radio" id="Q4-Opt3" name="Question4" value="Handler Mapping"/>Handler Mapping</td></tr>
<tr><td><input type="radio" id="Q4-Opt4" name="Question4" value="Dispatcher Servlet"/>Dispatcher Servlet</td></tr>


<tr><td><label>Question 5: Which is Spring's front Controller Implementation?</label></td></tr>
<tr><td><input type="radio" id="Q5-Opt1" name="Question5" value="Bean Factory"/>Bean Factory</td></tr>
<tr><td><input type="radio" id="Q5-Opt2" name="Question5" value="Class Path Application Context"/>Class Path Application Context</td></tr>
<tr><td><input type="radio" id="Q5-Opt3" name="Question5" value="Application Context"/>Application Context</td></tr>
<tr><td><input type="radio" id="Q5-Opt4" name="Question5" value="Dispatcher Servlet"/>Dispatcher Servlet</td></tr>
</table>
<button type="submit" id="submitspring">Submit</button>
</form:form>
</body>
</html>