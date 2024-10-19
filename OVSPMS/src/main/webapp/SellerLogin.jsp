<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="user_name" required><br><br> <!-- Updated name to match servlet -->
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="user_password" required><br><br> <!-- Updated name to match servlet -->
        
        <input type="submit" value="Login">
    </form>
</body>
</html>
