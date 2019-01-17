package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Date;

public final class Receipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Receipt</title>\n");
      out.write("         <style>\n");
      out.write("       * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write(" \n");
      out.write("  background-position: 10px 10px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  width: 20%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 5px 20px 5px 40px;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable th, #myTable td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr {\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myTable tr.header, #myTable tr:hover {\n");
      out.write("  background-color: #f1f1f1;\n");
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
      out.write("             mark { \n");
      out.write("                background-color:#ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("    <li><a href=\"Bus Hire.html\">Bus Hire</a></li>\n");
      out.write("    <li><a href=\"HireBus.jsp\">Bus Book</a></li>\n");
      out.write("    <li><a href=\"PrintTicket.html\">Print Ticket</a></li>\n");
      out.write("    <li><a href=\"Cancellation.html\">Cancel Ticket</a></li>\n");
      out.write("    <li><a href=\"Logout1\">Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("         <script>\n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, table, tr, td, i;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toUpperCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("    if (td) {\n");
      out.write("      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    }       \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("        <div id=\"printableArea\">\n");
      out.write("        ");
      out.write(" \n");
      out.write("        <script>\n");
      out.write("           function printDiv(divName) {\n");
      out.write("     var printContents = document.getElementById(divName).innerHTML;\n");
      out.write("     var originalContents = document.body.innerHTML;\n");
      out.write("\n");
      out.write("     document.body.innerHTML = printContents;\n");
      out.write("\n");
      out.write("     window.print();\n");
      out.write("\n");
      out.write("     document.body.innerHTML = originalContents;\n");
      out.write("} \n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("         <h3><b>User</b></h3>  ");
 String s=(String)session.getAttribute("user");
            out.println(s);
                
      out.write("\n");
      out.write("\n");
      out.write("                <h3><b> Today Date</b> </h3>\n");
      out.write("                ");

   Date date = new Date();
   out.print( "<h3>" +date.toString()+"</h3>");

      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div >      \n");
      out.write("    <center> <h1><b>Hire Bus</b></h1></center>\n");
      out.write("    <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search Bus Type\">\n");
      out.write("            <table id=\"myTable\" style=\"width:70%\" border=\"1\" align=\"center\">\n");
      out.write("\n");
      out.write("    <tr class=\"header\">\n");
      out.write("        <th>Seat</th>\n");
      out.write("        <th>Bus Type</th>\n");
      out.write("        <th>Distance</th>\n");
      out.write("        <th>price</th>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           ");

        String from = request.getParameter("km");
       // String to = request.getParameter("t2");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from hirebus where Distance=?");
           ps.setString(1, from);
           // ps.setString(2, to);
           // Statement st=con.createStatement();
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 out.println("<tr><td><mark>" + rs.getString(1) + "</mark></td><td><mark>" + rs.getString(2) + "</mark></td><td><mark>" + rs.getString(3) + "</mark></td><td><mark>" + rs.getString(4) + "</mark></td></tr>" );
            }

        } catch (Exception e) {
            out.println(e);
        }
    
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("          \n");
      out.write("         ");

            String s1 = request.getParameter("name");
            String s2 = request.getParameter("b2");
            String s3 = request.getParameter("b3");
            String s4 = request.getParameter("from");
            String s5 = request.getParameter("to");
            String s6 = request.getParameter("t2");
            String D = request.getParameter("km");
            String s7 = request.getParameter("d1");
            String s8 = request.getParameter("d2");
            String s9 = request.getParameter("num");
        
      out.write("\n");
      out.write("        <center>\n");
      out.write("        <div style=\"border-style: solid;\n");
      out.write("    border-width: 2px; padding: 2px;\">\n");
      out.write("        <h4>Details</h4>\n");
      out.write("        <b> Name</b>\n");
      out.write("        ");

        out.println(s1);
        
      out.write("<br>\n");
      out.write("        <b>Email </b>");

        out.println(s2);
        
      out.write("<br>\n");
      out.write("        <b>Mobile NO </b>");

        out.println(s3);
        
      out.write("<br>\n");
      out.write("      <b>  From </b>");

        out.println(s4);
        
      out.write("<br>\n");
      out.write("       <b> To  </b>");

        out.println(s5);
        
      out.write("<br>\n");
      out.write("       <b> Pickup Point </b> ");

        out.println(s6);
        
      out.write("<br>\n");
      out.write("       <b> Distance </b>");

        out.println(D);
        
      out.write("<br>\n");
      out.write("        \n");
      out.write("        From Date ");

        out.println(s7);
        
      out.write("<br>\n");
      out.write("        To Date ");

        out.println(s8);
        
      out.write("<br>\n");
      out.write("        No of Persons ");

        out.println(s9);
        
      out.write("<br>\n");
      out.write("        <br>\n");
      out.write("        <button style=\" \n");
      out.write("    bottom: 0px; padding: 15px 32px;text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    \" onclick=\"printDiv('printableArea')\"    value=\"PRINT\">Print</button>\n");
      out.write("    </div>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
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
