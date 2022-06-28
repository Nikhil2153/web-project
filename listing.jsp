<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>first_name</th><th>last_name</th><th>Salary</th><th>department</th><th>position</th><th>email</th><th>contact</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.first_name}</td>  
   <td>${emp.last_name}</td>  
   <td>${emp.salary}</td>  
   <td>${emp.department}</td> 
    <td>${emp.position}</td> 
     <td>${emp.email}</td> 
      <td>${emp.contact}</td>  
   <td><a href="Editlist/${emp.first_name}">Edit</a></td>  
   <td><a href="deleteemp/${emp.first_name}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="registration">Add New Employee</a>  
</head>
<body>

</body>
</html>