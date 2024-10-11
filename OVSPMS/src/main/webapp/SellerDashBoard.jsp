<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Dashboard</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            background-color: #f0f2f5;
            color: #ffffff;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        h2 {
            color: #1c2b4b;
            font-size: 28px;
            margin-bottom: 20px;
            text-align: center;
        }
        .dashboard {
            background-color: #1c2b4b;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #ffffff;
            color: #1c2b4b;
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #e0e0e0;
        }
        th {
            background-color: #f0f2f5;
            font-weight: 600;
            text-transform: uppercase;
            font-size: 14px;
        }
        tr:hover {
            background-color: #f5f7fa;
        }
        .btn {
            display: inline-block;
            padding: 8px 16px;
            background-color: #007aff;
            color: #ffffff;
            text-decoration: none;
            border-radius: 5px;
            font-size: 14px;
            transition: background-color 0.3s;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Seller Dashboard</h2>
        <div class="dashboard">
            <table>
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Username</th>
                        <th>E-mail</th>
                        <th>Contact Number</th>
                        <th>Address</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="sellerR" items="${SellReg}">
                        <tr>
                            <td>${sellerR.user_id}</td>
                            <td>${sellerR.user_name}</td>
                            <td>${sellerR.user_email}</td>
                            <td>${sellerR.user_conNum}</td>
                            <td>${sellerR.user_address}</td>
                            <td>
                                <a href="editSeller?id=${sellerR.user_id}" class="btn">Edit</a>
                                <a href="deleteSeller?id=${sellerR.user_id}" class="btn" onclick="return confirm('Are you sure you want to delete this seller?')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>