<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="Header.jsp" />

    <meta charset="UTF-8">
    <title>Feedback Form</title>
    <link rel="stylesheet" href="CSS/FeedBack.css">
</head>
<body>
    <header class="site-header">
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="AboutUs.jsp">About Us</a></li>
                <li><a href="products.html">Products</a></li>
                <li><a href="ContactUs.jsp">Contact Us</a></li>
                <li><a href="SellerRegistration.jsp" class="header_seller-btn seller-btn">Become a Seller</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <div class="feedback-container">
            <h1>Feedback Form</h1>
            <form>
                <label for="name">Name:</label>
                <input type="text" id="name" name="name">

                <label for="email">Email:</label>
                <input type="email" id="email" name="email">

                <label for="message">Message:</label>
                <textarea id="message" name="message"></textarea>

                <input type="submit" value="Submit">
            </form>
        </div>
    </main>

    <footer class="footer">
    <jsp:include page="Footer.jsp" />
    </footer>
</body>

</html>