package com.foo.listeners;

import com.foo.models.Footer;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Charlie
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialized");
        ServletContext context = sce.getServletContext();
        String email = context.getInitParameter("helpEmail");
        Footer footerBean = new Footer();
        footerBean.setEmail(email);
        context.setAttribute("email", footerBean);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroyed");
    }
    
}
