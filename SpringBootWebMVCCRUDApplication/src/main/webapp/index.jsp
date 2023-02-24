<!DOCTYPE html>
<html>
<head>
<style>

* {
   box-sizing: border-box;
}
.imageColumn {
   float: left;
   width: 25%;
   padding: 10px;
}

ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>Spring Boot Web MVC CRUD Operations Project</h1>

<br>

<ul>
  <li><a class="active" href="/">Home</a></li>
  <li><a href="adminlogin">Admin</a></li>
  <li><a href="employeelogin">Employee</a></li>
</ul>

<br><br><br>

<div class="alignRow">
<div class="imageColumn">
<img src="images/spring-boot-logo.png" alt="img1" style="width:100%">
</div>
<div class="imageColumn">
<img src="images/restws.png" alt="img2" style="width:100%">
</div>
<div class="imageColumn">
<img src="images/jpahibernate.png" alt="img3" style="width:100%">
</div>
<div class="imageColumn">
<img src="images/MySQL-Logo.png" alt="img4" style="width:100%">
</div>
</div>

</body>
</html>

 
