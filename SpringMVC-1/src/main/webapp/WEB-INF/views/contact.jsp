<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world!</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
      body {
        background-color: #f4f6f9;
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
      }

      .form-container {
        background-color: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        width: 100%;
        max-width: 400px;
      }
    </style>
  </head>
  <body>
    
    <div class="form-container">
    
    <h2>Registration Form</h2>
    
      <form action="processForm" method="post">
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Email address</label>
          <input 
          type="email" 
          class="form-control" 
          id="exampleInputEmail1" 
          aria-describedby="emailHelp"
          name="email"
          >
          
          
          <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        
        <div class="mb-3">
          <label for="userName" class="form-label">userName</label>
          <input 
          type="text" 
          class="form-control" 
          id="userName" 
          aria-describedby="Enter Here."
          name="userName";
          >
          <div id="userName" class="form-text">We'll never share your userName with anyone else.</div>
        </div>
        
        <div class="mb-3">
          <label for="Password" class="form-label">Password</label>
          <input 
          type="text" 
          class="form-control" 
          id="Password" 
          aria-describedby="Enter Here."
          name="Password";
          >
          <div id="Password" class="form-text">We'll never share your Password with anyone else.</div>
        </div>
        
        <button type="submit" class="btn btn-success">Sing Up</button>
        
      </form>
    </div>

    <!-- Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

  </body>
</html>
