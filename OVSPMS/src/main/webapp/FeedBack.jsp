<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Feedback Form</title>
    <link rel="stylesheet" href="CSS/FeedBack.css">
</head>
<body>
    <div class="feedback-container">
        <h1>Feedback Form</h1>
        <form action="FeedBackInsertServlet" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="f_name" required>
            
            <label for="contact">Contact Number:</label>
            <input type="tel" id="contact" name="f_conNum" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="f_email" required>
            
            <label for="feedback">Feedback:</label>
            <textarea id="feedback" name="f_feedBack" required></textarea>
            
            <input type="submit" value="Submit Feedback">
        </form>
    </div>
        <script src="JS/Feedback.js"></script>
    
</body>
</html>