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

<h3 align=center><u>View All Employees</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Company</th>
<th>Department</th>
<th>Designation</th>
<th>Salary</th>
<th>Location</th>
<th>Marital Status</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${emplist}" var="emp">

<tr>

<td> <c:out value="${emp.id}"></c:out>   </td>
<td> <c:out value="${emp.name}"></c:out>   </td>
<td> <c:out value="${emp.gender}"></c:out>   </td>
<td> <c:out value="${emp.dateofbirth}"></c:out>   </td>
<td> <c:out value="${emp.company}"></c:out>   </td>
<td> <c:out value="${emp.department}"></c:out>   </td>
<td> <c:out value="${emp.designation}"></c:out>   </td>
<td> <c:out value="${emp.salary}"></c:out>   </td>
<td> <c:out value="${emp.location}"></c:out>   </td>
<td> 

<c:if test="${emp.maritalstatus==true}">

<c:out value="Married"></c:out>

</c:if>

<c:if test="${emp.maritalstatus==false}">

<c:out value="Unmarried"></c:out>

</c:if>



</td>
<td> <c:out value="${emp.emailid}"></c:out>   </td>
<td> <c:out value="${emp.username}"></c:out>   </td>
<td> <c:out value="${emp.contactno}"></c:out>   </td>


<td>

<a href='<c:url value='deleteemployee?id=${emp.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewemployeebyid?id=${emp.id}'></c:url>'>View</a>&nbsp;&nbsp;
<a href='<c:url value='updateemployee?id=${emp.id}'></c:url>'>Update</a>&nbsp;&nbsp;


</td>

</tr>

</c:forEach>


</table>


</body>
</html>