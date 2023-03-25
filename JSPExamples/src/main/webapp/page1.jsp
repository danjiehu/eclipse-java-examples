<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>The Forward Action Example</title>
   </head>
   
   <body>
         <h2>Page 1</h2>
          
         <jsp:forward page = "page2.jsp">
         <jsp:param name="name" value="Harry" /> 
		<jsp:param name="school" value="nuig" /> 
		</jsp:forward>
         
   </body>
</html>
