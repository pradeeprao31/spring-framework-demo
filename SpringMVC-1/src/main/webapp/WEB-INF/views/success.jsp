<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success Page</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        body {
            margin: 0;
            height: 100vh;
            background: linear-gradient(135deg, #ff007f, #ff7f00, #7fff00, #00ff7f, #00ffff, #007fff, #0000ff, #7f00ff);
            display: flex;
            justify-content: center;
            align-items: center;
            color: white;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            position: relative;
            overflow: hidden;
        }

        /* Background images */
        .background-images {
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            z-index: 0;
            opacity: 0.1; /* Adjust opacity for subtlety */
            background-image: url('https://example.com/path/to/image1.png'), 
                              url('https://example.com/path/to/image2.png'), 
                              url('https://example.com/path/to/image3.png');
            background-size: 150px, 150px, 150px; /* Adjust size of images */
            background-repeat: no-repeat, no-repeat, no-repeat;
            background-position: 10% 10%, 80% 20%, 50% 70%; /* Position images */
        }

        .success-box {
            background-color: rgba(255, 255, 255, 0.9);
            color: #333;
            padding: 40px;
            border-radius: 16px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
            max-width: 500px;
            width: 90%;
            position: relative;
            z-index: 1; /* Ensure the box is above the background */
        }

        .success-box h2 {
            color: #28a745;
        }

        .btn-custom {
            background-color: #0072ff;
            color: white;
            border: none;
        }

        .btn-custom:hover {
            background-color: #0056cc;
        }
    </style>
</head>
<body>

<!-- Background images -->
<div class="background-images"></div>

<div class="success-box">
    <h2>✅ Form Submitted Successfully!</h2>
    <p><strong>User Email:</strong> <%= request.getAttribute("email") %></p>
    <p><strong>User Name:</strong> <%= request.getAttribute("userName") %></p>
    <p><strong>User Password:</strong> <%= request.getAttribute("Password") %></p>
    <a href="contact" class="btn btn-custom mt-3">Back to Form</a>
</div>

</body>
</html>