<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Continuous Couriers</title>
    <style>
    
        *
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.full-page
{
    height: 100%;
  width: 100%;
  background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(images/home.jpg);
  background-position: center;
  background-size: cover;
  position: absolute;
}
.navbar
{
    display: flex;
    align-items: center;
    padding: 20px;
    padding-left: 50px;
    padding-right: 30px;
    padding-top: 50px;
}
nav
{
    flex: 1;
    text-align: right;
}
nav ul 
{
    display: inline-block;
    list-style: none;
}
nav ul li
{
    display: inline-block;
    margin-right: 70px;
}
nav ul li a
{
    text-decoration: none;
    font-size: 20px;
    color: white;
    font-family: sans-serif;
}
nav ul li button
{
    font-size: 20px;
    color: white;
    outline: none;
    border: none;
    background: transparent;
    cursor: pointer;
    font-family: sans-serif;
}
nav ul li button:hover
{
    color: aqua;
}
nav ul li a:hover
{
    color: aqua;
}
a
{
    text-decoration: none;
    color: palevioletred;
    font-size: 28px;
}
#login-form
{
    display: none;
}
.form-box
{
    width:380px;
  height:480px;
  position:relative;
  margin:2% auto;
  background:rgba(0,0,0,0.3);
  padding:10px;
    overflow: hidden;
}
.button-box
{
  width:220px;
  margin:35px auto;
  position:relative;
  box-shadow: 0 0 20px 9px #ff61241f;
  border-radius: 30px;
}
.toggle-btn
{
  padding:10px 30px;
  cursor:pointer;
  background:transparent;
  border:0;
  outline: none;
  position: relative;
}
#btn
{
  top: 0;
  left:0;
  position: absolute;
  width: 110px;
  height: 100%;
  background: #F3C693;
  border-radius: 30px;
  transition: .5s;
}
.input-group-login
{
  top: 150px;
  position:absolute;
  width:280px;
  transition:.5s;
}
.input-group-register
{
    top: 120px;
  position:absolute;
  width:280px;
  transition:.5s;
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
.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: yellow;
  border: none;
  color: pink;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.input-field
{
  width: 100%;
  padding:10px 0;
  margin:5px 0;
  border-left:0;
  border-top:0;
  border-right:0;
  border-bottom: 1px solid #999;
  outline:none;
  background: transparent;
}
.submit-btn
{
  width: 85%;
  padding: 10px 30px;
  cursor: pointer;
  display: block;
  margin: auto;
  background: #F3C693;
  border: 0;
  outline: none;
  border-radius: 30px;
}
.check-box
{
  margin: 30px 10px 34px 0;
}
span
{
  color:#777;
  font-size:12px;
  bottom:68px;
  position:absolute;
}
#login
{
  left:50px;
}
#login input
{
  color:white;
  font-size:15;
}
#register
{
  left:450px;
}
#register input
{
  color:white;
  font-size: 15;
}
    </style>
</head>
<body>

 <div class="full-page">
        <div class="navbar">
            <div>
                <a href='/'>Continuous Couriers</a>
            </div>
            <nav>
                <ul id='MenuItems'><br><br>
                    <li><a href='/'>Home</a></li>
                     <li><a href='#'>TrackProduct</a></li>
                     <li><a href='/bmlogin'>Logout</a></li>
                     
                </ul>
             </nav>
            </div>

<br>

<br>

<h3 align=center>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

</body>
</html>