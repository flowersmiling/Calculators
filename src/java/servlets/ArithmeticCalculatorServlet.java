/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // get the two parameters from the POST request
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String oper = request.getParameter("oper");
        String regEx = "\\D";
        
        // set the attributes for the JSP
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
        // validation: if the parameters don't exist or are empty, show the first page again
        if (first == null || first.equals("") || second == null || second.equals("") || first.matches(regEx) || second.matches(regEx)) {
            // set an attribute for a message
            request.setAttribute("message", "invalid");
        }else{
            int fir = Integer.parseInt(first);
            int sec = Integer.parseInt(second);
            
            switch(oper){
                case "+":
                    request.setAttribute("message", fir+sec);
                    break;
                case "-":
                    request.setAttribute("message", fir-sec);
                    break;
                case "*":
                    request.setAttribute("message", fir*sec);
                    break;
                case "%":
                    if(sec != 0){
                        request.setAttribute("message", fir/sec);
                    }else
                    {
                        request.setAttribute("message", "invalid");
                    }
                    break;
            }
        }
        
        // forward the request and response objects to the JSP
        // display the form again
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    }
}
