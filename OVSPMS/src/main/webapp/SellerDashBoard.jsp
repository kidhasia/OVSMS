<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Seller Profile</title>
    <jsp:include page="Header.jsp" />
    <link rel="stylesheet" href="CSS/SellerDashBoard.css">
</head>
<body>
<h2>Seller Profile</h2>
<table>
    <tr>
        <th>User ID</th>
        <th>Username</th>
        <th>E-mail</th>a
        <th>Contact Number</th>
        <th>Address</th>
        <th>Password</th>
        <th>Action</th>
    </tr>
    <c:forEach var="sellerR" items="${SellReg}">
    <tr>
        <td>${sellerR.user_id}</td>
        <td>${sellerR.user_name}</td>
        <td>${sellerR.user_email}</td>
        <td>${sellerR.user_conNum}</td>
        <td>${sellerR.user_address}</td>
        <td>${sellerR.user_password}</td>

        <td class="action-column">
            <!-- Update Button -->
            <a href="UpdateSeller.jsp?user_id=${sellerR.user_id}&user_name=${sellerR.user_name}&user_email=${sellerR.user_email}&user_conNum=${sellerR.user_conNum}&user_address=${sellerR.user_address}&user_password=${sellerR.user_password}">
                <button class="update-button">Update</button>
            </a>

            <!-- Delete Button -->
            <form action="DeleteServlet" method="post" onsubmit="return confirm('Are you sure you want to delete this profile?');">
                <input type="hidden" name="user_id" value="${sellerR.user_id}"/>
                <button type="submit" class="delete-button">Delete</button>
            </form>
        </td>
    </tr>
    </c:forEach>
</table>
<script src="JS/SellerProfile.js"></script>
<jsp:include page="Footer.jsp" />
</body>
</html>
