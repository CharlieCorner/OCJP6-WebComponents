package com.foo.servlets;

import java.io.IOException;
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
    public void init(){
        System.out.println("LoginServlet - init() WITHOUT args");
    }
    
    @Override
    public void init(ServletConfig config){
        System.out.println("LoginServlet - init() WITH args");
        myCompanyName = config.getInitParameter("companyName");
    }
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("LoginServlet - service() method");
        System.out.println("LoginServlet - HTTP Method is: " + request.getMethod());
        super.service(request, response);
    }
    
    @Override
    public void destroy(){
        System.out.println("LoginServlet - destroy() method");
    }
}
