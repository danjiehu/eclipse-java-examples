<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<html>
	<head> 
		<title>Tag Example</title> 
	</head> 
	<body> 
		<c:set var = "salary" scope = "session" value = "${2000*2}"/> 
		<c:if test = "${salary > 2000}">
			 <p>My salary is: <c:out value = "${salary}"/><p>
		</c:if> 
		</body> 
</html>