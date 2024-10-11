<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Registration</title>
    <style>
        :root {
            --primary-color: #1c2b4b;
            --secondary-color: #ffffff;
            --accent-color: #007aff;
            --background-color: #f0f2f5;
        }

        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            background-color: var(--background-color);
            color: var(--primary-color);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .registration-container {
            background-color: var(--secondary-color);
            border-radius: 20px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            padding: 40px;
            width: 100%;
            max-width: 400px;
        }

        h2 {
            color: var(--primary-color);
            font-size: 28px;
            margin-bottom: 30px;
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        .input-container {
            margin-bottom: 20px;
            position: relative;
        }

        label {
            font-size: 14px;
            font-weight: 600;
            margin-bottom: 5px;
            display: block;
            color: var(--primary-color);
        }

        input {
            width: 100%;
            padding: 12px;
            border: 2px solid #e0e0e0;
            border-radius: 8px;
            font-size: 16px;
            transition: border-color 0.3s;
        }

        input:focus {
            border-color: var(--accent-color);
            outline: none;
        }

        .password-toggle {
            position: absolute;
            right: 10px;
            top: 38px;
            background: none;
            border: none;
            color: var(--accent-color);
            cursor: pointer;
            font-size: 14px;
        }

        button[type="submit"] {
            background-color: var(--accent-color);
            color: var(--secondary-color);
            border: none;
            border-radius: 8px;
            padding: 14px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button[type="submit"]:hover {
            background-color: #0056b3;
        }

        .login-link {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
        }

        .login-link a {
            color: var(--accent-color);
            text-decoration: none;
            font-weight: 600;
        }

        .login-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="registration-container">
        <h2>Seller Registration</h2>
        <form id="registrationForm" action="SellerRegServlet" method="post">
            <div class="input-container">
                <label for="username">Username</label>
                <input type="text" id="username" name="user_name" required>
            </div>
            <div class="input-container">
                <label for="email">Email</label>
                <input type="email" id="email" name="user_email" required>
            </div>
            <div class="input-container">
                <label for="contactNumber">Contact Number</label>
                <input type="text" id="contactNumber" name="user_conNum" required>
            </div>
            <div class="input-container">
                <label for="address">Address</label>
                <input type="text" id="address" name="user_address" required>
            </div>
            <div class="input-container">
                <label for="password">Password</label>
                <input type="password" id="password" name="user_password" required>
                <button type="button" class="password-toggle" onclick="togglePassword('password')">Show</button>
            </div>
            <div class="input-container">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
                <button type="button" class="password-toggle" onclick="togglePassword('confirmPassword')">Show</button>
            </div>
            <button type="submit">Register</button>
        </form>
        <div class="login-link">
            Already have an account? <a href="#">Log in</a>
        </div>
    </div>
    <script src="JS/SellerRegistration.js"></script>
</body>
</html>