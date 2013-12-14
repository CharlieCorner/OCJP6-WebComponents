/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sl314.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sl314.model.League;
import sl314.view.ListLeaguesServlet;

/**
 *
 * @author charlie
 */
public class AddLeagueServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddLeagueServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddLeagueServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> errors = new LinkedList<>();
        String yearS = request.getParameter("year");
        String title = request.getParameter("title");
        String season = request.getParameter("season");
        int year = 0;
        try {
            year = Integer.parseInt(yearS);
        } catch (NumberFormatException e) {
            errors.add("The year must be a positive integer.");
        }
        if (year < 2000 || year > 2011) {
            errors.add("The year must be between 2000 and 2011");
        }
        if ("UNKNOWN".equalsIgnoreCase(season)) {
            errors.add("Select a season");
        }
        if (title.isEmpty()) {
            errors.add("Enter a title");
        }
        if (!errors.isEmpty()) {
            request.setAttribute("errors", errors);
            RequestDispatcher rd = request.getRequestDispatcher("error_page.view");
            rd.forward(request, response);
        } else {
            League l = new League(year, title, season);
            ListLeaguesServlet.LEAGUE_LIST.add(l);
            request.setAttribute("league", l);
            RequestDispatcher rd = request.getRequestDispatcher("success.view");
            rd.forward(request, response);
        }
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
