package com.authentification.authapp;

import com.authentification.backend.DAO.LoginDAO;
import com.authentification.backend.IDAO.ILoginDAO;
import com.authentification.backend.entities.Login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ILoginDAO loginDAO = new LoginDAO();

            Login user = null;

            user = loginDAO.isUserExistent(request.getParameter("un"), request.getParameter("pw"));

            if (user != null)
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser",user);
                response.sendRedirect("ValidLogin.jsp"); //logged-in page
            }
            else {
                response.sendRedirect("InvalidLogin.jsp"); //error page
            }
        }
        catch(Throwable exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
