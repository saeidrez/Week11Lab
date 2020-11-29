/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;
import services.AccountService;

/**
 *
 * @author PC
 */
public class ForgotPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
    
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String email = request.getParameter("email");
       
        
        // save email to a cookie
        Cookie cookie = new Cookie("email", email);
        cookie.setMaxAge(60 * 60 * 24 * 365 * 3);
        response.addCookie(cookie);
        
        
       
        AccountService as = new AccountService();
        
        String path = getServletContext().getRealPath("/WEB-INF");
        
        boolean forgot = as.forgotPassword(email, path);
        request.setAttribute("message", "If the address you entered is valid, you will receive an email very soon. Please check your email for your password");
         getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);

    
    }


}
