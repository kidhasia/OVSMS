package OVSPMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SellerRegController {

    // Connect DB
    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    // Insert data function
    public static boolean insertdata(String user_name, String user_email, int user_conNum, String user_address, String user_password) {
        boolean isSuccess = false;
        int userId = 0;
        PreparedStatement checkEmailPstmt = null;
        ResultSet emailRs = null;
        PreparedStatement pstmt = null;

        try {
            // Get database connection
            con = DBConnection.getConnection();
            
            // Check if email already exists in the database
            String checkEmailQuery = "SELECT COUNT(*) FROM userregistration WHERE user_email = ?";
            checkEmailPstmt = con.prepareStatement(checkEmailQuery);
            checkEmailPstmt.setString(1, user_email);
            emailRs = checkEmailPstmt.executeQuery();

            // If email already exists, throw an exception
            if (emailRs.next() && emailRs.getInt(1) > 0) {
                throw new IllegalArgumentException("Email is already registered");
            }

            // SQL Query to insert data
            String sqlQ = "INSERT INTO `userregistration` (user_name, user_email, user_conNum, user_address, user_password) VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sqlQ, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user_name);
            pstmt.setString(2, user_email);
            pstmt.setInt(3, user_conNum);
            pstmt.setString(4, user_address);
            pstmt.setString(5, user_password);

            int rowsAffected = pstmt.executeUpdate();
            ResultSet generatedKeys = pstmt.getGeneratedKeys();

            if (rowsAffected > 0 && generatedKeys.next()) {
                isSuccess = true;
                userId = generatedKeys.getInt(1); // Fetching the inserted user's ID
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (checkEmailPstmt != null) checkEmailPstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isSuccess;
    }

    // Get Data
    public static List<SellerReg> getAllSellerReg() {
        ArrayList<SellerReg> sellerR = new ArrayList<>();
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sqlQ = "SELECT * FROM userregistration ORDER BY user_id DESC LIMIT 1";
            rs = stmt.executeQuery(sqlQ);

            while (rs.next()) {
                int user_id = rs.getInt(1);
                String user_name = rs.getString(2);
                String user_email = rs.getString(3);
                int user_conNum = rs.getInt(4);
                String user_address = rs.getString(5);
                String user_password = rs.getString(6);

                SellerReg seller2 = new SellerReg(user_id, user_name, user_email, user_conNum, user_address, user_password);
                sellerR.add(seller2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return sellerR;
    }

    // Update function
    public static boolean updateData(int user_id, String user_name, String user_email, int user_conNum, String user_address, String user_password) {
        PreparedStatement pst = null;
        boolean isSuccess = false;

        try {
            // Get database connection
            con = DBConnection.getConnection();

            // Query
            String sqlQ = "UPDATE userregistration SET user_name = ?, user_email = ?, user_conNum = ?, user_address = ?, user_password = ? WHERE user_id = ?";

            // Use PreparedStatement to prevent SQL injection
            pst = con.prepareStatement(sqlQ);

            // Set the parameters in the query
            pst.setString(1, user_name);
            pst.setString(2, user_email);
            pst.setInt(3, user_conNum);
            pst.setString(4, user_address);
            pst.setString(5, user_password);
            pst.setInt(6, user_id);

            // Execute update
            int rs = pst.executeUpdate();

            // Check if the update was successful
            isSuccess = rs > 0;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }

    // Delete data
    public static boolean deleteData(int user_id) {
        boolean isSuccess = false;
        PreparedStatement pst = null;

        try {
            // DB connection
            con = DBConnection.getConnection();

            // SQL query
            pst = con.prepareStatement("DELETE FROM userregistration WHERE user_id = ?");

            // Set the user_id parameter
            pst.setInt(1, user_id);

            // Execute the update
            int rowsAffected = pst.executeUpdate();

            // Check if rows were affected
            isSuccess = (rowsAffected > 0); // Deletion successful if rowsAffected is greater than 0

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }

    public static boolean isSuccess() {
        return isSuccess;
    }

    public static void setSuccess(boolean isSuccess) {
        SellerRegController.isSuccess = isSuccess;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        SellerRegController.rs = rs;
    }
}
