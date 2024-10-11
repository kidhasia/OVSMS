<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Dashboard</title>
    <link rel="stylesheet" href="CSS/SellerDashboard.css">
</head>
<body>
    <div class="dashboard-container">
        <h2>Seller Dashboard</h2>
        
        <!-- Profile Section -->
        <section id="profile">
            <h3>Seller Profile</h3>
            <p>Username: <span id="username">JohnDoe</span></p>
            <p>Email: <span id="email">john@example.com</span></p>
            <p>Contact Number: <span id="contactNumber">1234567890</span></p>
            <p>Address: <span id="address">123 Main St, City, Country</span></p>
            <button onclick="showEditForm()">Edit Profile</button>
        </section>

        <!-- Edit Profile Form (initially hidden) -->
        <section id="editProfileForm" style="display:none;">
            <h3>Edit Profile</h3>
            <form id="updateProfileForm">
                <div class="input-container">
                    <label for="editUsername">Username</label>
                    <input type="text" id="editUsername" name="username" required>
                </div>
                <div class="input-container">
                    <label for="editEmail">Email</label>
                    <input type="email" id="editEmail" name="email" required>
                </div>
                <div class="input-container">
                    <label for="editContactNumber">Contact Number</label>
                    <input type="text" id="editContactNumber" name="contactNumber" required>
                </div>
                <div class="input-container">
                    <label for="editAddress">Address</label>
                    <input type="text" id="editAddress" name="address" required>
                </div>
                <button type="submit">Update Profile</button>
            </form>
        </section>

        <!-- Product Management Section -->
        <section id="productManagement">
            <h3>Product Management</h3>
            <button onclick="showAddProductForm()">Add New Product</button>
            
            <!-- Add Product Form (initially hidden) -->
            <form id="addProductForm" style="display:none;">
                <div class="input-container">
                    <label for="productName">Product Name</label>
                    <input type="text" id="productName" name="productName" required>
                </div>
                <div class="input-container">
                    <label for="productDescription">Description</label>
                    <textarea id="productDescription" name="productDescription" required></textarea>
                </div>
                <div class="input-container">
                    <label for="productPrice">Price</label>
                    <input type="number" id="productPrice" name="productPrice" step="0.01" required>
                </div>
                <div class="input-container">
                    <label for="productQuantity">Quantity</label>
                    <input type="number" id="productQuantity" name="productQuantity" required>
                </div>
                <button type="submit">Add Product</button>
            </form>

            <!-- Product List -->
            <table id="productList">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Example product row -->
                    <tr>
                        <td>Sample Product</td>
                        <td>This is a sample product description</td>
                        <td>$19.99</td>
                        <td>50</td>
                        <td>
                            <button onclick="editProduct(1)">Edit</button>
                            <button onclick="deleteProduct(1)">Delete</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </section>
    </div>

    <script src="JS/SellerDashboard.js"></script>
</body>
</html>