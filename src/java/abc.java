 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pratiksha
 */
public class abc extends HttpServlet {

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
            out.println("<title>Servlet abc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet abc at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
               String s1 = request.getParameter("name");
                String s2 = request.getParameter("email");
                String s3 = request.getParameter("username");
                String s4 = request.getParameter("pass");
                String s5 = request.getParameter("rpass");
             
               
                String s6 = request.getParameter("phone");
                HttpSession session=request.getSession();
                session.setAttribute("name",s1);
             
                    try {
                        
                        
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
                        PreparedStatement ps = con.prepareStatement("insert into register values('" + s1 + "','"
                                + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "','" + s6 + "')");
                        ps.executeUpdate();
                        out.println("Package Added Successfully");
                        response.sendRedirect("BUS.jsp");
                    } 
                    catch (Exception e) 
                    {
                        
                    }
        }
                    }
                        
                
    
  
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
