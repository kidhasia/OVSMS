package OVSPMS;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/FeedBackInsertServlet")

public class FeedBackInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String f_name = request.getParameter("f_name");
        String f_conNum = request.getParameter("f_conNum");
        String f_email = request.getParameter("f_email");
        String f_feedBack = request.getParameter("f_feedBack");
        
        boolean isSuccess;
        
        isSuccess = FeedBackController.insertFeedback(f_name, f_conNum, f_email, f_feedBack);
        
        RequestDispatcher dispatcher;
        
        if (isSuccess) {
            request.setAttribute("feedbackStatus", "success");
        } else {
            request.setAttribute("feedbackStatus", "failed");
        }
        
        dispatcher = request.getRequestDispatcher("FeedBack.jsp");
        dispatcher.forward(request, response);
    
	}

}
