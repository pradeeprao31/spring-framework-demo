<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Men - MyShop</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: url('images/men-bg.jpg') no-repeat center center fixed;
            background-size: cover;
            color: #fff;
        }
        header {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 1em;
            text-align: center;
        }
        nav {
            background-color: rgba(0, 0, 0, 0.6);
            padding: 0.5em;
            text-align: center;
        }
        nav a {
            color: white;
            margin: 0 15px;
            text-decoration: none;
        }
        .products {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 2em;
            gap: 2em;
            background-color: rgba(255, 255, 255, 0.1);
        }
        .card {
            background-color: rgba(255, 255, 255, 0.2);
            border: 1px solid #ccc;
            border-radius: 10px;
            padding: 1em;
            text-align: center;
            width: 220px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }
        .card img {
            width: 100%;
            border-radius: 5px;
        }
        .card p {
            margin: 0.5em 0 0;
            font-weight: bold;
        }
        footer {
            background-color: rgba(0, 0, 0, 0.8);
            text-align: center;
            padding: 1em;
            margin-top: 2em;
        }
    </style>
</head>

<%
 String name=(String)request.getAttribute("name");
 LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%>
<h1 style="text-align:center; background-color:rgba(0,0,0,0.6); padding:10px;">
    Name of the owner of this site is <%= name %>
</h1>

<h1 style="text-align:center; background-color:rgba(0,0,0,0.6); padding:10px;">
    Date And Time <%= time %>
</h1>

<body>

<header>
    <h1>Men's Collection</h1>
    <p>Latest Trends in Men's Fashion</p>
</header>

<nav>
    <a href="/SpringMVC_First/home">Home</a>
    <a href="/SpringMVC_First/men">Men</a>
    <a href="#">Women</a>
    <a href="#">Kids</a>
    <a href="#">Accessories</a>
</nav>

<section class="products">
    <div class="card">
        <img src="images/men-shirt.jpg" alt="Men Shirt">
        <p>Casual Shirt - ₹899</p>
    </div>
    <div class="card">
        <img src="images/men-jeans.jpg" alt="Men Jeans">
        <p>Blue Jeans - ₹1199</p>
    </div>
    <div class="card">
        <img src="images/men-jacket.jpg" alt="Men Jacket">
        <p>Winter Jacket - ₹1499</p>
    </div>
    <div class="card">
        <img src="images/men-hoodie.jpg" alt="Men Hoodie">
        <p>Stylish Hoodie - ₹999</p>
    </div>
</section>

<footer>
    <p>&copy; 2025 MyShop. All rights reserved.</p>
</footer>

</body>
</html>
