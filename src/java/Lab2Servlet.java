/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.PageData;

/**
 *
 * @author coldr
 */
@WebServlet(name = "lab2servlet", urlPatterns = {"/lab2servlet"})
public class Lab2Servlet extends HttpServlet {
    private IndyWinnerDAO  indyWinnerDAO;
    private List<IndyWinnerTeam> results;
    private int page;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public Lab2Servlet(){
        this.indyWinnerDAO = new IndyWinnerDAOImp();
        this.results= new ArrayList<>();
        this.page=0;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, List<IndyWinnerTeam> results)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab2Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<table>");
            out.println("<tr><th>Year</th><th>Driver</th><th>Average Speed</th><th>Country</th></tr>");
            
            for(int i=0; i<results.size(); i++){
                out.println("<tr>");
                out.println("<td>"+results.get(i).getYear()+"</td>");
                out.println("<td>"+results.get(i).getDriver()+"</td>");
                out.println("<td>"+results.get(i).getAverageSpeed()+"</td>");
                out.println("<td>"+results.get(i).getCountry()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<br/><br/>");
            
            out.println("<form method='get'>");
            out.println("<button type='submit' name='action' value='previous'>Previous</button>");
            out.println("<button type='submit' name='action' value='next'>Next</button>");
            out.println("</form>");
            
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
        
        String action = request.getParameter("action");
        if (action.equals("previous") && page > 0) {
            page--;  
        } else if (action.equals("next")) {
            page++;  
        }
        
        this.results=indyWinnerDAO.display(this.page);
        processRequest(request, response, results);
        
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
//        processRequest(request, response);
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
