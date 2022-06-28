<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <h1>Edit Employee</h1>  
       <form:form method="POST" action="/SpringMVCCRUDSimple/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="first_name" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="last_name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="department" /></td>  
         </tr> 
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="position" /></td>  
         </tr> 
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="email" /></td>  
         </tr> 
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="contact" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>     
</head>
<body>

</body>
</html>