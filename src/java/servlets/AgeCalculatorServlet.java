package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // get the two parameters from the POST request
        String age = request.getParameter("age");
        String regEx = "\\b([1-9]|[1-9][0-9]|100)\\b";
        
        // set the attributes for the JSP
        request.setAttribute("age", age);
        
        // validation: if the parameters don't exist or are empty, show the first page again
        if (age == null || age.equals("")) {
            // set an attribute for a message
            request.setAttribute("message", "You must give your current age.");
        }else if(age.matches(regEx)){
            // set an attribute for a message
            int next = Integer.parseInt(age)+1;
            // set an attribute for a message
            request.setAttribute("message", "Your age next birthday will be "+next);
            
        }else{
            request.setAttribute("message", "You must enter a number.");
        }
        
        // forward the request and response objects to the JSP
        // display the form again
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }
}
