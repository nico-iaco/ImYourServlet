/*
 * Sweethome Domotic System
 * Copyright © 2017 Nicola Iacovelli
 * Tutti i diritti sono riservati
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicola-pc
 */
public class application extends HttpServlet {

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
            out.println("<title>Get e Post</title>");            
            out.println("</head>");
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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nome=request.getParameter("Nome");
        String cognome=request.getParameter("Cognome");
        try (PrintWriter out = response.getWriter()) {
            out.println("<body>");
            out.println("<h1>Pagina creata da chiamata GET</h1>");
            out.println("Il tuo nome è:"+nome+"<br/>");
            out.println("Il tuo cognome è:"+cognome+"<br/>");
            if("Nicola".equals(nome) && "Iacovelli".equals(cognome)){
                out.println("<b>Sei il mio creatore</b><br/>");
                out.println("<b>Grazie per avermi creato</b>");
            }
            else{
                out.println("<b>Esci da questa pagina!</b><br/>Non sei il mio creatore");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request2 servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doPost(HttpServletRequest request2, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nome=request2.getParameter("Nome");
        String cognome=request2.getParameter("Cognome");
        try (PrintWriter out = response.getWriter()) {
            out.println("<body>");
            out.println("<h1>Pagina creata da chiamata POST</h1>");
            out.println("Il tuo nome è:"+nome+"<br/>");
            out.println("Il tuo cognome è:"+cognome+"<br/>");
            if("Nicola".equals(nome) && "Iacovelli".equals(cognome)){
                out.println("<b>Sei il mio creatore</b><br/>");
                out.println("<b>Grazie per avermi creato</b>");
            }
            else{
                out.println("<b>Esci da questa pagina!</b><br/>Non sei il mio creatore");
            }
            out.println("</body>");
            out.println("</html>");
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
