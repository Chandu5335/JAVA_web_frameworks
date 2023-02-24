<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC CRUD Project</title>

<style type="text/css">

</style>

</head>
<body>
<h2 align=center>Spring MVC Web Application to Perform CRUD Operations</h2>
<hr><hr>

<br><br>

<h3 align=center><u>View Employee ID</u></h3>

<table align=center border=2>


<tr><td>ID:<c:out value="${emp.id}"></c:out>   </td></tr>
<tr><td>Name:<c:out value="${emp.name}"></c:out>   </td></tr>
<tr><td>Gender:<c:out value="${emp.gender}"></c:out>   </td></tr>
<tr><td>Date of Birth:<c:out value="${emp.dateofbirth}"></c:out>   </td></tr>
<tr><td>Company:<c:out value="${emp.company}"></c:out>   </td></tr>
<tr><td>Department<c:out value="${emp.department}"></c:out>   </td></tr>
<tr><td>Designation<c:out value="${emp.designation}"></c:out>   </td></tr>
<tr><td>Salary<c:out value="${emp.salary}"></c:out>   </td></tr>
<tr><td>Location:<c:out value="${emp.location}"></c:out>   </td></tr>

<tr>

<td>

Marital Status:

<c:if test="${emp.maritalstatus==true}">

<c:out value="Married"></c:out>

</c:if>

<c:if test="${emp.maritalstatus==false}">

<c:out value="Unmarried"></c:out>

</c:if>

 </td>

</tr>


<tr><td>Email ID:<c:out value="${emp.emailid}"></c:out>   </td></tr>
<tr><td>Username:<c:out value="${emp.username}"></c:out>   </td></tr>
<tr><td>Contact No:<c:out value="${emp.contactno}"></c:out>   </td></tr>




</table>


</body>
</html>