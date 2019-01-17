package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Bus_0020Details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        <style>\n");
      out.write("          \n");
      out.write("            select {\n");
      out.write("                width: 25%;\n");
      out.write("                padding: 6px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("       <style>\n");
      out.write("             ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #ff0033;\n");
      out.write("\n");
      out.write("                position:fix;\n");
      out.write("            }\n");
      out.write("            table,tr,td{\n");
      out.write("                border-spacing: 5px;\n");
      out.write("                margin-left: 200px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a, .dropbtn {\n");
      out.write("                display: inline-block;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button {\n");
      out.write("                background-color: #0033ff;\n");
      out.write("                color: white;\n");
      out.write("                padding: 9px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 8%;\n");
      out.write("                height: 3%;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border: 5px;\n");
      out.write("            \n");
      out.write("            txt{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            alig{\n");
      out.write("                margin-left: 430px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("         \n");
      out.write("        </style>\n");
      out.write("           \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    <form action=\"placedetail.jsp\">\n");
      out.write("        <center>Search Place :&nbsp&nbsp\n");
      out.write("            <select name=\"place\">\n");
      out.write("  <option value=\"Select Place\" >-----------------Select Place -----------------</option>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    ");

    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from travel");
           // out.println("<option>");
            
            while (rs.next()) {
                
                out.println( "<a href='display.jsp'><option>"+rs.getString(2));
                }
            
            out.println("</option>");
        } 
catch (Exception e) {
            out.println(e);
        }
      out.write("\n");
      out.write("        \n");
      out.write("  \n");
      out.write("</select>\n");
      out.write("            &nbsp&nbsp&nbsp<button type=\"Submit\">Search</button></center>\n");
      out.write("    </form>\n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("   <table style=\"width:10%\" border=\"2\"  >\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from travel");
            while (rs.next()) 
            {
                        out.println("<alig><tr><center>"
                        + "<img width='800' height='400' src=" + rs.getString(13) + ">"
                        + "</center></tr></alig><br><br><tr><center><txt>" + rs.getString(2)  + "</txt></center></tr><br>"+
                        "<tr><center><txt>Number Of Days :&nbsp;&nbsp;"+rs.getString(11)+"</txt></center></tr>"
                        + "<tr><center><txt>Number Of Nights :&nbsp;&nbsp;"+rs.getString(12)+"</txt></center>"
                        + "</tr><tr><center><txt>Approximate Price :&nbsp;&nbsp;"+rs.getString(14)+"</txt></center><br>");
            }
        } catch (Exception e) 
        {
            out.println(e);
        }
    
      out.write("\n");
      out.write("      \n");
      out.write("</table>\n");
      out.write("      \n");
      out.write("</body></html>\n");
      out.write("       \n");
      out.write(" \n");
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
