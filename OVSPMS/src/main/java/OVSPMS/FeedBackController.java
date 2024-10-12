package OVSPMS;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FeedBackController {

    private static boolean isSuccess;
    private static Connection con = null;

    // Insert data function
    public static boolean insertFeedback(String f_name, String f_conNum, String f_email, String f_feedBack) {
        boolean isSuccess = false;
        
        try {
            con = DBConnection.getConnection();
            
            // SQL Query using PreparedStatement
            String sqlQ = "INSERT INTO feedback (f_name, f_conNum, f_email, f_feedBack) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sqlQ);
            
            pstmt.setString(1, f_name);
            pstmt.setString(2, f_conNum);
            pstmt.setString(3, f_email);
            pstmt.setString(4, f_feedBack);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                isSuccess = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources properly
            try {
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return isSuccess;
    }
}
