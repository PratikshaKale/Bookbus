package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Data Update</title>\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("    addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } \n");
      out.write("                            </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<!-- js -->\n");
      out.write("<link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        \n");
      out.write("<script src=\"js/jquery-2.1.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<link href=\"css/AdminForm.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("    <li><a href=\"\">Home</a></li>\n");
      out.write("    <li><a href=\"Admin.jsp\">Update Bus TimeTable</a></li>\n");
      out.write("    <li><a href=\"Adisplay.sp\">Display Bus TimeTable</a></li>\n");
      out.write("    <li><a href=\"AdminHBD.jsp\">Update Bus Data</a></li>\n");
      out.write("    <li><a href=\"Logout1\">Logout</a></li>\n");
      out.write(" \n");
      out.write("</ul>  \n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<h1>Details</h1>\n");
      out.write("\t\t<div class=\"agileinfo_main\">\n");
      out.write("\t\t\t<form id=\"testform\" action=\"AdminData\" method=\"post\" novalidate>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<fieldset style=\"border: 1px solid #999\">\n");
      out.write("\t\t\t\t\t<legend>Admin</legend>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p for=\"firstName\" class=\"w3_field1\">From</p>\n");
      out.write("\t\t\t\t\t<input id=\"firstName\" name=\"From\" type=\"text\" required data-error-msg=\"Enter Place\" />\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p for=\"phoneNum\">To</p>\n");
      out.write("\t\t\t\t\t<input id=\"phoneNum\" name=\"To\" type=\"text\" required data-error-msg=\"Enter Place\" />\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t\t\t<p>Arrival  Time</p>\n");
      out.write("                                        <input id=\"emailAddress\" name=\"ArrivalTime\" type=\"datetime\"  required data-error-msg=\"Enter Arrival Time \" ></input>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t\t\t<p for=\"secondName\">Distance</p>\n");
      out.write("\t\t\t\t\t<input id=\"secondName\" name=\"Distance\" type=\"number\" required data-error-msg=\"Enter Distance\" />\n");
      out.write("\t\t\t\t         <p>Date</p>\n");
      out.write("                                         <input  name=\"date\" id=\"D1\" type=\"date\"  placeholder=\"YYYY-MM-DD\" required pattern=\"[0-9]{4}-[0-9]{2}-[0-9]{2}\" required data-error-msg=\"Enter Date \" />\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t\t\t<p for=\"secondName\">Price</p>\n");
      out.write("\t\t\t\t\t<input  name=\"price\" type=\"number\" required data-error-msg=\"Enter Amount\" />\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</fieldset>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                                    <input type=\"submit\" name=\"Submit\" >\n");
      out.write("                                   \n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                              \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Calendar -->\n");
      out.write("\t\t\t\t<link rel=\"stylesheet\" href=\"css/jquery-ui.css\" />\n");
      out.write("\t\t\t\t<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("\t\t\t\t  <script>\n");
      out.write("\t\t\t\t\t\t  $(function() {\n");
      out.write("\t\t\t\t\t\t\t$( \"#datepicker\" ).datepicker();\n");
      out.write("\t\t\t\t\t\t  });\n");
      out.write("\t\t\t\t  </script>\n");
      out.write("\t\t\t<!-- //Calendar -->\n");
      out.write("\t\t<script src=\"js/attrvalidate.jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<!--<script type=\"text/javascript\">\n");
      out.write("\t\t  $(document).ready(function(){\n");
      out.write("\t\t\t$('#testform').attrvalidate();\n");
      out.write("\t\t\t$('#resetBtn').click(function(){ $('#testform').attrvalidate('reset'); });\n");
      out.write("\t\t\t$('#expandBtn').click(function(){\n");
      out.write("\t\t\t  var collapsible = $('#' + $(this).attr('aria-controls'));\n");
      out.write("\t\t\t  $(collapsible).attr('aria-hidden', ($(collapsible).attr('aria-hidden') === 'false'));\n");
      out.write("\t\t\t  $(this).attr('aria-expanded', ($(this).attr('aria-expanded') === 'false'));\n");
      out.write("\t\t\t});\n");
      out.write("\t\t  });\n");
      out.write("\t\t</script>!-->\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
