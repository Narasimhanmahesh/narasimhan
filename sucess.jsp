<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>last page</title>
</head>
<body>
<form method="post" action="add" >
<table border="5" width="50%" cellpadding="2">  
<tr><th>Id</th><th>FirstName</th><th>LastName</th></tr>  
   <c:forEach var="emp" items="${msg}">   
   <tr>  
    <td>${emp.id}</td>
   <td>${emp.firstName}</td>  
   <td>${emp.lastName}</td>  
   </tr>  
   </c:forEach>
   
   </table>  <br>
    <input type="submit" value="addemployee">
    </form>
success
</body>
</html>