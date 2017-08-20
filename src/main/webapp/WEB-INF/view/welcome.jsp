<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>How to Generate Excel using Spring and Apache POI</title>
</head>
<body>
<c:forEach var="student" items="${studentList}" >
 "${student.getStudentName()}"
  "${student.getStudentId()}"
  "${student.getStudentMobileNum()}"
  <br>
</c:forEach>

 <h1>Download Excel File: </h1>
 <spring:url value="/report" var="xlsURL"></spring:url>
 <a href="${xlsURL}">Excel Document</a>
</html>