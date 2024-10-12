<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Get in Touch</title>
    <link rel="stylesheet" href="CSS/ContactUs.css"> <!-- Link your CSS file here -->
    <script>
        function submitFeedback() {
            document.getElementById('feedbackForm').submit();
        }
    </script>
</head>
<body>
    <div class="container">
        <header>
            <h1>Get in touch</h1>
            <p class="subtitle">Want to get in touch? We'd love to hear from you. Here's how you can reach us.</p>
        </header>
        <div class="contact-options">
            <div class="contact-card">
                <div class="icon">📞</div>
                <h2>Talk to Sales</h2>
                <p>Interested in our software? Just pick up the phone to chat with a member of our sales team.</p>
                <a href="tel:+6565556000" class="btn" aria-label="Call sales team">+65 6 555 6000</a>
            </div>
            <div class="contact-card">
                <div class="icon">💬</div>
                <h2>Feedback</h2>
                <p>We're here to help! If you have any questions or need assistance, our support team is just a message away.</p>
                <button class="btn" onclick="submitFeedback()">Give us Feedback!</button>
                <form id="feedbackForm" action="FeedBackInsertServlet" method="post" style="display: none;">
                    <input type="text" name="f_name" value="asd" required>
                    <input type="text" name="f_conNum" value="1290" required>
                    <input type="email" name="f_email" value="josd@asdas.com" required>
                    <textarea name="f_feedBack" required>Your feedback here...</textarea>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
