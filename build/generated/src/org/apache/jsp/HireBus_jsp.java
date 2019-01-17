package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class HireBus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hire Bus| MYBUS</title>\n");
      out.write("        <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("           <link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("        <style>\n");
      out.write("              input {\n");
      out.write("             width: 100%;\n");
      out.write("           }\n");
      out.write("           input[type=button] {\n");
      out.write("               width: 100%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 32px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("input[type=text], input[type=email],input[type=date],input[type=radio],input[type=number] {\n");
      out.write("    width: 100%;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    background-color: white;\n");
      out.write("    \n");
      out.write("    background-position: 10px 10px; \n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    padding: 12px 20px 12px 40px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-image: url(\"IMAGES/first.jpg\");\n");
      out.write("     background-repeat: no-repeat;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position:center center;\n");
      out.write("-webkit-background-size: cover;\n");
      out.write("-moz-background-size: cover;\n");
      out.write("-o-background-size: cover;\n");
      out.write("background-size: cover;\n");
      out.write(" \n");
      out.write("            }\n");
      out.write("          </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("    <li><a href=\"Bus Hire.html\">Bus Hire</a></li>\n");
      out.write("    <li><a href=\"HireBus.jsp\">Bus Book</a></li>\n");
      out.write("    <li><a href=\"PrintTicket.html\">Print Ticket</a></li>\n");
      out.write("    <li><a href=\"Cancellation.html\">Cancel Ticket</a></li>\n");
      out.write("    <li><a href=\"Logout1\">Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("        \n");
      out.write("        <form action=\"BusData.jsp\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td>\n");
      out.write("                            <b>Name</b></td><td><input type=\"text\" name=\"name\"></td></tr>\n");
      out.write("           <tr><td> <b>Email</b></td><td><input type=\"email\" name=\"b2\"></td></tr>\n");
      out.write("            <tr><td><b>Mobile No</b></td><td><input type=\"number\" name=\"b3\"></td></tr>\n");
      out.write("        \n");
      out.write("                    <tr><td> <b>From</b></td><td> <input type=\"text\" name=\"from\">\n");
      out.write("               </td></tr>\n");
      out.write("                    <tr><td><b>To</b></td><td> <input  type=\"text\" name=\"to\"></td></tr>\n");
      out.write("            \n");
      out.write("           <tr><td><b> Pickup Point</b></td><td><input type=\"text\" name=\"t2\"></td></tr>\n");
      out.write("           \n");
      out.write("           <tr><td><b>Distance</b></td><td>\n");
      out.write("           <select name=\"km\">\n");
      out.write("  <option value=\"Select Place\" >-----------------Select To Distance -----------------</option>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    ");

    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from hirebus");
           // out.println("<option>");
            
            while (rs.next()) {
                
                out.println("<option>"+ rs.getString(3));
                }
            
            out.println("</option>");
        } 
catch (Exception e) {
            out.println(e);
        }
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("           \n");
      out.write("            <tr><td><b>From Date</b></td><td><input type=\"date\" name=\"d1\"></td></tr>\n");
      out.write("            <tr><td><b>To Date</b></td><td><input type=\"date\" name=\"d2\"></td></tr>\n");
      out.write("            <tr><td><b>No of persons</b></td><td><input type=\"number\" name=\"num\"></td></tr>\n");
      out.write("          \n");
      out.write("            <tr> <td><input type=\"Submit\" value=\"Submit\" ></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
