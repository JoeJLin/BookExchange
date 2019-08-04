<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>
		  
<meta charset="UTF-8">
		  
	<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
	<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

<title>Home</title>

</head>

<body>
	<h1>Main Book Exchange Page</h1>
	
	<ul>
		<!-- call student.getOperatingSystems() and loop through it -->
		<c:forEach var="temp" items="${inventory.bookList}">
		
			<li> ${temp.key}${" ISBN: "}${temp.value} </li>
			
		</c:forEach>
			
	</ul>

</body>
</html>