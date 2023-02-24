<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC CRUD Project</title>

<style type="text/css">
.button {
  background-color: #0000FF;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}

</style>

</head>
<body>
<h2 align=center>Spring MVC Web Application to Perform CRUD Operations</h2>
<hr><hr>

<br>

<h3 align=center style="color:red"><c:out value="${message}"></c:out></h3>

<h3 align=center><u>Update Employee</u></h3><br>

<form action="updateemployeerecord" method="post">

<table align=center>

<tr>
<td><label>Id</label></td>
<td><input type="number" name="id" value="${id}" readonly></td>
</tr>




<tr><td></td></tr>

<tr>
<td><label>Designation</label></td>
<td>
<select name="desg" required>
<option value="-1">---Select---</option>
<option value="MANAGER">Manager</option>
<option value="TEAM LEAD">Team Lead</option>
<option value="PROJECT TRAINEE">Project Trainee</option>
</select>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Salary</label></label></td>
<td><input type="number" name="salary" value="0.00" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Location</label></td>
<td><input type="text" name="location" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Marital Status</label></td>
<td>
<input type="radio" name="mstatus" value="true" required>Yes
<input type="radio" name="mstatus" value="false" required>No
</td>
</tr>


<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="pwd" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Contact No</label></td>
<td><input type="number" name="contactno" required></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td colspan=2><input type="submit" value="Update Employee" class="button"></td>
</tr>

</table>

</form>

</body>
</html>