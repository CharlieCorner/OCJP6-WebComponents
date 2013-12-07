/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.charliecorner.ocjp6.webcomponents.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author charlie
 */
public class ImageViewerServlet extends HttpServlet {
    
    public static final int BUFFER_SIZE = 524288;
    
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
            out.println("<title>Servlet ImageViewerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ImageViewerServlet at " + request.getContextPath() + "</h1>");
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
        ServletOutputStream outputStream = null;
        response.setContentType("jpg");
        response.setHeader("Content-Disposition", "inline; filename=\\imagenTemp.jpg\"");
        outputStream = response.getOutputStream();
        byte[] byteToRead = null;
        
        String widthTmp = getServletConfig().getInitParameter("width");
        String heightTmp = getServletConfig().getInitParameter("height");
        String path = getServletConfig().getInitParameter("path");
        int width = Integer.parseInt(widthTmp);
        int height = Integer.parseInt(heightTmp);
        try {
            String idFileName = null;
            String fileId = request.getParameter("fileId");
            if (null != fileId) {
                int fileIdInt = Integer.parseInt(fileId);
                idFileName = fileId;
            }
            File inputFileObj = new File(path, idFileName + ".jpg");
            FileInputStream infile = new FileInputStream(inputFileObj);
            byteToRead = new byte[524288];
            int i = 0;
            i = infile.read(byteToRead);
            while (-1 != i) {
                outputStream.write(byteToRead, 0 ,i);
                i = infile.read(byteToRead);
            }
            infile.close();
            infile = null;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        outputStream.flush();
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
        //processRequest(request, response);
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
