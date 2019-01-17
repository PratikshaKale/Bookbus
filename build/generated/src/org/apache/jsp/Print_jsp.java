package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;

public final class Print_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head id=\"Head1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Design.css\">\n");
      out.write("   \n");
      out.write("   <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("  \n");
      out.write(" \n");
      out.write("<style>\n");
      out.write("            body {\n");
      out.write("    background-image: url(\"/IMAGES/images.jpg\");\n");
      out.write("     background-repeat: no-repeat;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("    background-position:center center;\n");
      out.write("-webkit-background-size: cover;\n");
      out.write("-moz-background-size: cover;\n");
      out.write("-o-background-size: cover;\n");
      out.write("background-size: cover;\n");
      out.write(" font: normal 14px/1.4 'Lato';\n");
      out.write("            }\n");
      out.write("            .search_btn{height:50px;width:125px;border-width:0;background-color:#d74f57;color:#f8d1ce;margin-top:2em;margin-left:75%}\n");
      out.write("       .container h2{margin:auto;margin-left:41%;color:#757575;padding-top:3em}\n");
      out.write(".container h3{margin-left:40%;margin-top:0;color:#9c9c9c}\n");
      out.write(".container{width:100%;min-height:500px;background-color:hsla(0,0%,95%,.45)}\n");
      out.write(".search-box{position:relative;width:226px;border:1px solid #d2d2d2;height:50px;background-color:#fff;left:34%;box-shadow:1px 2px 3px #888}.fl{float:left}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("    <li><a href=\"Bus Hire.html\">Bus Hire</a></li>\n");
      out.write("    <li><a href=\"BusBook.html\">Bus Book</a></li>\n");
      out.write("    <li><a href=\"PrintTicket.html\">Print Ticket</a></li>\n");
      out.write("    <li><a href=\"Cancellation.html\">Cancel Ticket</a></li>\n");
      out.write("    <li><a href=\"Logout1\" >Logout</a></li>\n");
      out.write("</ul>   \n");
      out.write("    <section id=\"rh_main\">\n");
      out.write("        \n");
      out.write("        <div id=\"mBWrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2 style=\"color: black;\">Print Bus Ticket</h2><br>\n");
      out.write("    <h3  style=\"color: black;\">Please enter your ticket number below</h3>\n");
      out.write("\n");
      out.write("<form action=\"\" id=\"searchForm\" method=\"post\"name=\"myForm\"onsubmit=\"return validateForm()\">  \n");
      out.write("    <div id=\"printableArea\" class=\"db\">\n");
      out.write("    <div class=\"fl search-box\" style=\"border-color: rgb(210, 210, 210);\">\n");
      out.write("     \n");
      out.write("        \n");
      out.write("    <br>\n");
      out.write("        <div>\n");
      out.write("            ");
 String s=(String)session.getAttribute("user");
            out.println(s);
                
      out.write("\n");
      out.write("\n");
      out.write("                <h1> Today Date </h1>\n");
      out.write("                ");

   Date date = new Date();
   out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");

      out.write("\n");
      out.write("        </div>\n");
      out.write("                    <span class=\"errorMessageOptions\"></span>\n");
      out.write("                    <input type=\"submit\" onclick=\"printDiv('printableArea')\" value=\"SUBMIT\" class=\"search_btn\">\n");
      out.write("                </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("</form>    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("     \n");
      out.write("</body>\n");
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
