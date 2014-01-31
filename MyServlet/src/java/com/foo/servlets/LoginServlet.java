package com.foo.servlets;

import com.foo.models.PersonalInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author Charlie
 */
public class LoginServlet extends HttpServlet {

    private String myCompanyName;

    public LoginServlet() {
        System.out.println("LoginServlet - constructor");
    }

    @Override
    public void init() {
        System.out.println("LoginServlet - init() WITHOUT args");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("LoginServlet - init() WITH args");
        myCompanyName = config.getInitParameter("companyName");
        
        super.init(config);
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginServlet - service() method");
        System.out.println("LoginServlet - HTTP Method is: " + request.getMethod());
        super.service(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("LoginServlet - doGet() method");
        String loginMessage = getServletConfig().getInitParameter("loginMessage");
        response.setContentType("text/html");
        response.setHeader("myHeader", "myHeaderValue");
        response.setHeader("myHeader", "myRealValue");
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<head><title>WellCome to " + this.myCompanyName + "</title></head>");
            out.println("<h2>" + loginMessage + "</h2><br/>");
            out.println("<form action='login' method='post'>");
            out.println("Username: <input type='text' name='userName' value='admin'/><br/>");
            out.println("Password: <input type='password' name='password' value='qwerty'/><br/>");
            out.println("<input type='submit' value='Login'/>");
            out.println("</form>");
            out.println("<a href='mailto:" + this.getServletContext().getInitParameter("helpEmail") + "'>Need Help</a> ");
            out.println("</html></body>");

        } catch (IOException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        System.out.println("LoginServlet - doPost() method");
        
        String userNameParam = request.getParameter("userName");
        String passwordParam = request.getParameter("password");
        
        HttpSession session = request.getSession(true);
        PersonalInfo user = new PersonalInfo();
        user.setUserName(userNameParam);
        session.setAttribute("userInfo", user);
        /*
        RequestDispatcher dispatcher = request.getRequestDispatcher("/actions/selectBeer");
        dispatcher.forward(request, response);
                */
        response.sendRedirect("../actions/selectBeer");
    }

    @Override
    public void destroy() {
        System.out.println("LoginServlet - destroy() method");
    }
}
