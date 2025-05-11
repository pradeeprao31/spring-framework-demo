<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title> MyShop - Home</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }
        header { background-color: #333; color: white; padding: 1em; text-align: center; }
        nav { background-color: #444; padding: 0.5em; text-align: center; }
        nav a { color: white; margin: 0 15px; text-decoration: none; }
        .banner { background-color: #f0f0f0; padding: 2em; text-align: center; }
        .categories, .products { display: flex; justify-content: space-around; flex-wrap: wrap; padding: 2em; }
        .box { border: 1px solid #ccc; padding: 1em; width: 200px; margin: 1em; text-align: center; }
        footer { background-color: #222; color: white; text-align: center; padding: 1em; }
    </style>
</head>
<body>

<%
  String name=(String)request.getAttribute("name");
  Integer id=(Integer)request.getAttribute("id");
  List<String> friend = (List<String>) request.getAttribute("f");
%>

<h1>Name is <%=name%></h1>
<h1>ID is <%=id %></h1>


<% 
   for (String s : friend) {
%>
   <h1><%=s %></h1>
<%
   }
%>

		

<header>
    <h1>MyShop</h1>
    <p>Your fashion destination</p>
</header>

<nav>
    <a href="#">Home</a>
    <a href="#">Men</a>
    <a href="#">Women</a>
    <a href="#">Kids</a>
    <a href="#">Accessories</a>
</nav>

<div class="banner">
    <h2>Flat 50% Off on New Arrivals!</h2>
    <p>Grab the hottest trends before they're gone!</p>
</div>

<section class="categories">
    <div class="box">
        <h3>Men</h3>
        <p>Shirts, T-Shirts, Jeans</p>
    </div>
    <div class="box">
        <h3>Women</h3>
        <p>Dresses, Kurtis, Tops</p>
    </div>
    <div class="box">
        <h3>Kids</h3>
        <p>Clothing, Toys, Shoes</p>
    </div>
</section>

<section class="products">
    <div class="box">
        <img src="images/product1.jpg" alt="Product 1" width="150" />
        <p>Stylish Shirt - ₹799</p>
    </div>
    <div class="box">
        <img src="images/product2.jpg" alt="Product 2" width="150" />
        <p>Floral Dress - ₹1199</p>
    </div>
    <div class="box">
        <img src="images/product3.jpg" alt="Product 3" width="150" />
        <p>Kids T-shirt - ₹499</p>
    </div>
</section>

<footer>
    <p>&copy; 2025 MyShop. All rights reserved.</p>
</footer>

</body>
</html>
