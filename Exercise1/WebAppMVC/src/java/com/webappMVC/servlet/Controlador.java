/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webappMVC.servlet;

import com.webappMVC.dto.ItemDTO;
import com.webappMVC.service.AccesoUsuarios;
import com.webappMVC.service.AccesoUsuariosImpl;
import com.webappMVC.service.ManejoInventario;
import com.webappMVC.service.ManejoInventarioImp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diazeg
 */
@WebServlet(name = "Controlador", urlPatterns = {"/controlador"})
public class Controlador extends HttpServlet {

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
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher requestDispatcher = null;
        ManejoInventario manejoInventario = new ManejoInventarioImp();
        int punto = 0;
        try {
            String puntoStr = request.getParameter("punto");
            punto = Integer.parseInt(puntoStr);
        } catch (NumberFormatException nex) {

        }
        if (request.getParameter("usuario").equals("true")) {
            AccesoUsuarios a = new AccesoUsuariosImpl();
            request.setAttribute("listaUsuarios", a.getListaUsuarios());
            requestDispatcher = request.getRequestDispatcher("/InfoUsuario.jsp");
        } else {
            if (request.getParameter("punto").equals("1")) {
                List<ItemDTO> itemDTOList = manejoInventario.getInventarioTienda(punto);
                request.setAttribute("itemList", itemDTOList);
                requestDispatcher = request.getRequestDispatcher("/puntoVenta1.jsp");
            } else {
                List<ItemDTO> itemDTOList = manejoInventario.getInventarioTienda(punto);
                request.setAttribute("itemList", itemDTOList);
                requestDispatcher = request.getRequestDispatcher("/puntoVenta2.jsp");
            }
        }
        requestDispatcher.forward(request, response);
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
