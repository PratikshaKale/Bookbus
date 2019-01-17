package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ADisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("        <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myInput {\n");
      out.write("  background-image: url('/css/searchicon.png');\n");
      out.write("  background-position: 10px 10px;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 16px;\n");
      out.write("  padding: 12px 20px 12px 40px;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  margin-bottom: 12px;\n");
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
      out.write("            mark { \n");
      out.write("                background-color:#ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <ul class=\"nav\">\n");
      out.write("    <li><a href=\"\">Home</a></li>\n");
      out.write("    <li><a href=\"Admin.jsp\">Update Bus TimeTable</a></li>\n");
      out.write("    <li><a href=\"Adisplay.sp\">Display Bus TimeTable</a></li>\n");
      out.write("    <li><a href=\"AdminHBD.jsp\">Update Bus Data</a></li>\n");
      out.write("    <li><a href=\"Logout1\">Logout</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("        <table id=\"myTable\" style=\"width:70%\" border=\"1\" align=\"center\">\n");
      out.write("\n");
      out.write("    <tr class=\"header\">\n");
      out.write("        <th>From</th>\n");
      out.write("        <th>To</th>\n");
      out.write("        <th>Arrival  Time</th>\n");
      out.write("        <th>Distance</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("        <th>price</th>\n");
      out.write("       \n");
      out.write("\n");
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
      out.write("         ");

       

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");

            PreparedStatement ps = con.prepareStatement("select * from bdata1");
           
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 out.println("<tr><td><mark>" + rs.getString(1) + "</mark></td><td><mark>" + rs.getString(2) + "</mark></td><td><mark>" + rs.getString(3) + "</mark></td><td><mark>" + rs.getString(4) + "</mark></td><td><mark>"+rs.getString(5)+"</mark></td><td><mark><a href=BUS.jsp>" + rs.getString(6) + "</a></mark></td></tr>" );
            }

        } catch (Exception e) {
            out.println(e);
        }
    
      out.write("\n");
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
