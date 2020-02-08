<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hibernate Assessment</title>
</head>
<body>
<h2>Hibernate Assessment</h2>
<form:form method="POST" action="${pageContext.request.contextPath}/evaluate/hibernate/test" modelAttribute="hibernate">
<table>
<tr><td><label>Question 1: What is the full form of ORM?</label></td></tr>
<tr><td><input type="radio" id="Q1-Opt1" name="Question1" value="Object Random Memory"/>Object Random Memory</td></tr>
<tr><td><input type="radio" id="Q1-Opt2" name="Question1" value="Object Relational Mismatch"/>Object Random Memory</td></tr>
<tr><td><input type="radio" id="Q1-Opt3" name="Question1" value="Object Relational Mapping"/>Object Relational Mapping</td></tr>
<tr><td><input type="radio" id="Q1-Opt4" name="Question1" value="Object Random Mapping"/>Object Random Mapping</td></tr>

<tr><td><label>Question 2: In Hibernate, based on directionality, what could be the mappings?</label></td></tr>
<tr><td><input type="radio" id="Q2-Opt1" name="Question2" value="uni-directional & bi-directional"/>uni-directional & bi-directional</td></tr>
<tr><td><input type="radio" id="Q2-Opt2" name="Question2" value="one-to-many & many-to-one"/>one-to-many & many-to-one</td></tr>
<tr><td><input type="radio" id="Q2-Opt3" name="Question2" value="inheritance mapping"/>one-to-many & many-to-one</td></tr>
<tr><td><input type="radio" id="Q2-Opt4" name="Question2" value="north & south mapping"/>north & south mapping</td></tr>


<tr><td><label>Question 3: In an Hibernate application, which file would have datasource details?</label></td></tr>
<tr><td><input type="radio" id="Q3-Opt1" name="Question3" value="hibernate mapping file"/>hibernate mapping file</td></tr>
<tr><td><input type="radio" id="Q3-Opt2" name="Question3" value="configuration file"/>configuration file</td></tr>
<tr><td><input type="radio" id="Q3-Opt3" name="Question3" value="Model/Entity class"/>Model/Entity class</td></tr>
<tr><td><input type="radio" id="Q3-Opt4" name="Question3" value="HibernateUtil class"/>HibernateUtil class</td></tr>


<tr><td><label>Question 4: What is the full form of HQL?</label></td></tr>
<tr><td><input type="radio" id="Q4-Opt1" name="Question4" value="High-level Query Language"/>High-level Query Language</td></tr>
<tr><td><input type="radio" id="Q4-Opt2" name="Question4" value="Hidden Query Language"/>High-level Query Language</td></tr>
<tr><td><input type="radio" id="Q4-Opt3" name="Question4" value="Hibernate Query Language"/>Hibernate Query Language</td></tr>
<tr><td><input type="radio" id="Q4-Opt4" name="Question4" value="Hibernate Quadratic Language"/>Hibernate Quadratic Language</td></tr>


<tr><td><label>Question 5: In an Hibernate application, concurrency can be controlled by setting?</label></td></tr>
<tr><td><input type="radio" id="Q5-Opt1" name="Question5" value="concurrency level"/>concurrency level</td></tr>
<tr><td><input type="radio" id="Q5-Opt2" name="Question5" value="one-to-one mapping"/>one-to-one mapping</td></tr>
<tr><td><input type="radio" id="Q5-Opt3" name="Question5" value="many-to-one bi-directional mapping"/>many-to-one bi-directional mapping</td></tr>
<tr><td><input type="radio" id="Q5-Opt4" name="Question5" value="isolation levels"/>isolation levels</td></tr>
</table>
<button type="submit" id="submithibernate">Submit</button>
</form:form>
</body>
</html>