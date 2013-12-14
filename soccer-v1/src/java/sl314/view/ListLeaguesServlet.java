/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sl314.model.League;

/**
 *
 * @author charlie
 */
public class ListLeaguesServlet extends HttpServlet {

    public static final List<League> LEAGUE_LIST;

    static {
        LEAGUE_LIST = new LinkedList<>();
        LEAGUE_LIST.add(new League(2003, "Soccer League", "Spring"));
        LEAGUE_LIST.add(new League(2013, "Soccer League 3", "Summer"));
        LEAGUE_LIST.add(new League(2004, "Soccer League Love", "Fall"));
        LEAGUE_LIST.add(new League(2007, "Soccer League Summer", "Summer"));
        LEAGUE_LIST.add(new League(2008, "Soccer League Fall 08", "Fall"));
        LEAGUE_LIST.add(new League(2010, "Soccer League Decades", "Spring"));
    }
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<title>Duke's Soccer League: List Leagues</title>");
            out.println("<body>");
            out.println("<!-- Page Heading -->");
            out.println("<table border='1' cellpadding='5' cellspacing='0' width='400'>");
            out.println("<tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>");
            out.println("<td><h3>Duke's Soccer League: List Leagues</h3></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<p>");
            out.println("The set of soccer leagues are:");
            out.println("</p>");
            out.println("<ul>");
            for(League l : LEAGUE_LIST){
                out.println("<li>"+l.getTitle()+" ("+l.getSeason()+" "+l.getYear()+")</li>");
            }
            out.println("<input type=\"submit\" onclick=\"history.go(-1)\" value=\"Back\"/>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
