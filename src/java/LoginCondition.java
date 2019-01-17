

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
@WebServlet(name = "LoginCondition", urlPatterns ={"/LoginCondition"})
public class LoginCondition extends HttpServlet{ 
        
    


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginCondition</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginCondition at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try (PrintWriter out = response.getWriter()) {
             HttpSession session=request.getSession(true);
        String uname=request.getParameter("User_Name");
            String pass=request.getParameter("Password");
            try{
                    
          Class.forName("com.mysql.jdbc.Driver");
          Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bus","root","");
          PreparedStatement ps=(PreparedStatement) c.prepareStatement("select * from register where uname=? and pass=?");
          ps.setString(1, uname);
          ps.setString(2, pass);
          ResultSet rs=ps.executeQuery();
          if(! rs.next())
          {
            out.println("<script language='javascript'>alert('Please Enter Valid Username And Password!!!');</script>");
              RequestDispatcher rd=request.getRequestDispatcher("Login.html");
              rd.include(request, response);
              //out.println("Please Enter Valid Username And Password");
              //out.println("<html><head></head><body><a href='loginform.html'><br>To Login Click Here</a></body></html>");
          }
                    else
          {
               out.print("Welcome, "+uname);
             // HttpSession session=request.getSession();
              session.setAttribute("user", uname);
             // session.setAttribute("id", rs.getString(1));
              response.sendRedirect("BUS.jsp");
          }
            }catch(IOException | ClassNotFoundException | SQLException e)
            {
                out.println(e);
            }
    }

    }
    }


