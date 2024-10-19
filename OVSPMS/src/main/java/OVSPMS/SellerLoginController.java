package OVSPMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SellerLoginController {

    private static Connection con = null;

    public static List<SellerLoginModel> SellerLogin(String user_name, String user_password) {
        List<SellerLoginModel> userSell = new ArrayList<>();
        String sqlQ = "SELECT * FROM userregistration WHERE user_name=? AND user_password=?";

        try {
            con = DBConnection.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sqlQ);
            pstmt.setString(1, user_name);
            pstmt.setString(2, user_password);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt(1);
                String userName = rs.getString(2);
                String userPassword = rs.getString(3);
                
                SellerLoginModel uS = new SellerLoginModel(userId, userName, userPassword);
                userSell.add(uS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userSell;
    }
}
