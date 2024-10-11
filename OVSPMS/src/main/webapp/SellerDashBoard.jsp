<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller Dash Board</title>
</head>
<body>
<h2>Seller Dash Board</h2>
<table>
<tr>
<th>User ID</th>
<th>Username</th>
<th>E-mail</th>
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

<td>
	<a href="UpdateSeller.jsp?user_id=${sellerR.user_id}&user_name=${sellerR.user_name}&user_email=${sellerR.user_email}&user_conNum=${sellerR.user_conNum}&user_address=${sellerR.user_address}&user_password=${sellerR.user_password}">
	<button>Update</button>
	</a>

</td>

</tr>
</c:forEach>
</table>

</body>
</html>