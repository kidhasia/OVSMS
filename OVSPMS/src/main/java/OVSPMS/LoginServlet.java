package OVSPMS;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String user_name = request.getParameter("user_name");
        String user_password = request.getParameter("user_password");
        
        try {
        	List<SellerLoginModel> sellerLogin = SellerLoginController.SellerLogin(user_name, user_password);
       
        	request.setAttribute("sellerLogin",sellerLogin);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       
        RequestDispatcher dis = request.getRequestDispatcher("SellerRegServlet");
        dis.forward(request, response);
    }
    
}
