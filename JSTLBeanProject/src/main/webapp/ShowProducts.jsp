<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 
Step-1 Add two JAR files in the project
Step-2 Add <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> in a file
Step-3 Use JSTL/EL to print name and phone numbers of all friends
Step-4 Link back to add more friends
 -->
<html>
<head>
<meta charset="UTF-8">
<title>Products Page</title>
</head>
<body>


<c:out value="List of Products"/>
<table>

<tr>

<td>
Product Name
</td>


<td>

Product Category

</td>

</tr>

<c:forEach var="product" items="${productlist}">
<tr>
<td>${product.name }</td>
<td>${product.category}</td>
</tr>
</c:forEach>
</table>

<a href="home.html">Add more products</a>


</body>
</html>