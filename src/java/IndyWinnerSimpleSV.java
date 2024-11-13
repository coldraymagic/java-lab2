/*  File name: IndyWinnerSimpleSV.java
*  Author: Xinwei Wang, 41104208
*  Course: CST8288-020
*  Term: Fall2024
*  Assignment: Lab2
*  Date: 12, November, 2024
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
 * The Class IndyWinnerSimpleSV.
 *
 * @author Xinwei Wang
 */
@WebServlet(urlPatterns = {"/IndyWinnerSimpleSV"})
public class IndyWinnerSimpleSV extends HttpServlet {
    
    /** The indy winner DAO. */
    private IndyWinnerDAO  indyWinnerDAO;
    
    /** The results. */
    private List<IndyWinnerTeam> results;
    
    /** The page. */
    private int page;
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     */
    
    public IndyWinnerSimpleSV(){
        this.indyWinnerDAO = new IndyWinnerDAOImp();
        this.results= new ArrayList<>();
        this.page=0;
    }
    
    /**
     * Process request.
     *
     * @param request the request
     * @param response the response
     * @param results the results
     * @throws ServletException the servlet exception
     * @throws IOException Signals that an I/O exception has occurred.
     */
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
        if ("previous".equals(action) && page > 0) {
            page--;  
        } else if ("next".equals(action)) {
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
        String str = "The IndyWinnerSimpleSV servlet is designed to display"
                + " a paginated list of Indy winner teams, showing details "
                + "like the year, driver, average speed, and country in an "
                + "HTML table format.\nIt processes both GET and POST requests"
                + " (though POST is currently unused) and allows users to "
                + "navigate through the list with \"Previous\" and \"Next\" "
                + "buttons. \nThe servlet fetches data using an IndyWinnerDAO"
                + " implementation and updates the displayed results based on"
                + " the current page, which is managed as a class variable.";
        return str;
    }// </editor-fold>

}
