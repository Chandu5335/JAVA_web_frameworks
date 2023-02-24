<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Boot Project</title>
    <style>
        .navbar{
            background-color: black;
            border-radius: 30px;
            
        }
        .navbar ul{
            overflow: auto;
        }
        .navbar li{
            float:left;
            list-style: none; 
            margin: 13px 20px;
            
        }
        .navbar li a{
            padding: 3px 3px;
            text-decoration: none;
            color: white;
        }
        .navbar li a:hover{
            color: red
        }
        .search{
            float: right;
            color: white;
            padding: 12px 75px;
        }
        .navbar input{
            border: 2px solid black;
            border-radius: 14px;
            padding: 3px 17px;
            width: 129px;
        }
    </style>
</head>

<body>

<h2 align="center">Product Upload and Download Example</h2>

    <header>
        <nav class="navbar">
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="addproduct">Add Product</a></li>
                <li><a href="viewallprods">View All Products</a></li>
                 <li><a href="viewproductbyid">View Product By ID</a></li>
               
            </ul>
        </nav>
    </header>
</body>

</html>
