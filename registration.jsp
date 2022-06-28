<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<center>
        <h1> Add new Employee</h1>
        <form method="post" action="Save" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>First Name: </td>
                    <td><input type="text" name="first_Name" size="50"/></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><input type="text" name="last_Name" size="50"/></td>
                </tr>
                <tr>
                    <td>salary: </td>
                    <td><input type="text" name="salary" size="50"/></td>
                </tr>
                <tr>
                    <td>Department: </td>
                    <td><input type="text" name="Department" size="50"/></td>
                </tr>
                <tr>
                    <td>Position: </td>
                    <td><input type="text" name="Position" size="50"/></td>
                </tr>
                <tr>
                    <td>email_address: </td>
                    <td><input type="text" name="email_address" size="50"/></td>
                </tr>
                <tr>
                    <td>Contact: </td>
                    <td><input type="text" name="Contact" size="50"/></td>
                </tr>
                
                <tr>
                    <td>Profile Photo: </td>
                    <td><input type="file" name="photo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</head>
<body>

</body>
</html>