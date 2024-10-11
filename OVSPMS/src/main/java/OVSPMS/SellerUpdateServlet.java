package OVSPMS;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SellerUpdateServlet
 */
@WebServlet("/SellerUpdateServlet")
public class SellerUpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static Connection con = null;
    private static PreparedStatement pst = null;
    private RequestDispatcher dispatcher = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user_name = request.getParameter("user_name");
        String user_email = request.getParameter("user_email");
        int user_conNum = Integer.parseInt(request.getParameter("user_conNum"));
        String user_address = request.getParameter("user_address");
        String user_password = request.getParameter("user_password");

        boolean updated = updateProfile(user_name, user_email, user_conNum, user_address, user_password);

        if (updated) {
            request.setAttribute("updateProfileStatus", "success");
            dispatcher = request.getRequestDispatcher("sellerDashboard.jsp");
        } else {
            request.setAttribute("updateProfileStatus", "failed");
            dispatcher = request.getRequestDispatcher("sellerUpdateForm.jsp"); // Redirect back to the update form on failure
        }
        dispatcher.forward(request, response);
    }

    // Update profile function
    public static boolean updateProfile(String user_name, String user_email, int user_conNum, String user_address, String user_password) {
        boolean isSuccess = false;
        try {
            con = DBConnection.getConnection();
            String sqlQ = "UPDATE `userregistration` SET user_email = ?, user_conNum = ?, user_address = ?, user_password = ? WHERE user_name = ?";
            pst = con.prepareStatement(sqlQ);
            pst.setString(1, user_email);
            pst.setInt(2, user_conNum);
            pst.setString(3, user_address);
            pst.setString(4, user_password);
            pst.setString(5, user_name);

            int rowsAffected = pst.executeUpdate();
            isSuccess = (rowsAffected > 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pst != null) pst.close(); // Close PreparedStatement
                if (con != null) con.close(); // Close Connection
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isSuccess;
    }
}
