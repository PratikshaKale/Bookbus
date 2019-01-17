package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class BusData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String s1,s2,s3,s4,s5,s6,D,s7,s8,s9;

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"icon\" href=\"IMAGES/11.png\" type=\"image/png\" sizes=\"16x16\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/link.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("    <li><a href=\"Bus Hire.html\">Bus Hire</a></li>\n");
      out.write("    <li><a href=\"HireBus.jsp\">Bus Book</a></li>\n");
      out.write("    <li><a href=\"PrintTicket.html\">Print Ticket</a></li>\n");
      out.write("    <li><a href=\"Cancellation.html\">Cancel Ticket</a></li>\n");
      out.write("    <li><a href=\"Logout1\">Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("        \n");
      out.write("           <div>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("      ");
      out.write(" \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

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
      out.write("       \n");
      out.write("        ");

          try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus", "root", "");
                        PreparedStatement ps = con.prepareStatement("insert into hiredb values('" + s1 + "','"
                                + s2 + "','" + s3 + "','" + s4 +"','" + s5 +"','" + s6 +"','" + D +"','" + s7 +"','" + s8 + "','" + s9 +"')");
                        ps.executeUpdate();
                        out.println("Data Save Successfully");
                        
                    } 
                    catch (Exception e) 
                    {
                        
                    }
                   

              
              
      out.write("\n");
      out.write("              \n");
      out.write("              ");
      out.write(" \n");
      out.write("              <script>\n");
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
      out.write("              \n");
      out.write("              \n");
      out.write("        <div >      \n");
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
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div>\n");
      out.write("\t\n");
      out.write("        <center>  <div style=\"border-style: solid; \n");
      out.write("    border-width: 2px; width: 350px;\">\n");
      out.write("\t\t\n");
      out.write("               <form action=\"Receipt.jsp\" method=\"post\"> \n");
      out.write("            \n");
      out.write("                Enter your Credit card details\n");
      out.write("                <table width=\"490px\" border=\"0\" cellspacing=\"10\" cellpadding=\"0\">\n");
      out.write("                  <tbody>\n");
      out.write("                      <tr height=\"32\">\n");
      out.write("                          <td width=\"100px\"><b>Credit Card No  </b> </td>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <div  style=\" overflow:hidden;\"> \n");
      out.write("                           \n");
      out.write("                          <input  type=\"text\" maxlength=\"19\" size=\"20\" name=\"card_number_1\"  placeholder=\"\" autocomplete=\"off\">\n");
      out.write("                         \n");
      out.write("                           </div>\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr height=\"32\">\n");
      out.write("                      <td><b>Expiry Date </b></td>\n");
      out.write("                    <td colspan=\"3\"><span >\n");
      out.write("                        <select  name=\"exp_month_1\" >\n");
      out.write("                          <option value=\"\">Month </option>\n");
      out.write("                          <option value=\"01\">01 (Jan)</option>\n");
      out.write("                          <option value=\"02\">02 (Feb)</option>\n");
      out.write("                          <option value=\"03\">03 (Mar)</option>\n");
      out.write("                          <option value=\"04\">04 (Apr)</option>\n");
      out.write("                          <option value=\"05\">05 (May)</option>\n");
      out.write("                          <option value=\"06\">06 (Jun)</option>\n");
      out.write("                          <option value=\"07\">07 (Jul)</option>\n");
      out.write("                          <option value=\"08\">08 (Aug)</option>\n");
      out.write("                          <option value=\"09\">09 (Sep)</option>\n");
      out.write("                          <option value=\"10\">10 (Oct)</option>\n");
      out.write("                          <option value=\"11\">11 (Nov)</option>\n");
      out.write("                          <option value=\"12\">12 (Dec)</option>\n");
      out.write("                        </select>&nbsp;&nbsp;\n");
      out.write("                        <select  name=\"exp_year_1\" >\n");
      out.write("                          <option value=\"\">Year </option>\n");
      out.write("                              <option value=\"17\">2017</option>\n");
      out.write("                                                        <option value=\"18\">2018</option>\n");
      out.write("                                                        <option value=\"19\">2019</option>\n");
      out.write("                                                        <option value=\"20\">2020</option>\n");
      out.write("                                                        <option value=\"21\">2021</option>\n");
      out.write("                                                        <option value=\"22\">2022</option>\n");
      out.write("                                                        <option value=\"23\">2023</option>\n");
      out.write("                                                        <option value=\"24\">2024</option>\n");
      out.write("                                                        <option value=\"25\">2025</option>\n");
      out.write("                                                        <option value=\"26\">2026</option>\n");
      out.write("                                                        <option value=\"27\">2027</option>\n");
      out.write("                                                        <option value=\"28\">2028</option>\n");
      out.write("                                                        <option value=\"29\">2029</option>\n");
      out.write("                                                        <option value=\"30\">2030</option>\n");
      out.write("                                                        <option value=\"31\">2031</option>\n");
      out.write("                                                        <option value=\"32\">2032</option>\n");
      out.write("                                                        <option value=\"33\">2033</option>\n");
      out.write("                                                        <option value=\"34\">2034</option>\n");
      out.write("                                                        <option value=\"35\">2035</option>\n");
      out.write("                                                        <option value=\"36\">2036</option>\n");
      out.write("                                                        <option value=\"37\">2037</option>\n");
      out.write("                                                        <option value=\"38\">2038</option>\n");
      out.write("                                                        <option value=\"39\">2039</option>\n");
      out.write("                                                        <option value=\"40\">2040</option>\n");
      out.write("                                                        <option value=\"41\">2041</option>\n");
      out.write("                                                        <option value=\"42\">2042</option>\n");
      out.write("                                                        <option value=\"43\">2043</option>\n");
      out.write("                                                        <option value=\"44\">2044</option>\n");
      out.write("                                                        <option value=\"45\">2045</option>\n");
      out.write("                                                        <option value=\"46\">2046</option>\n");
      out.write("                                                        <option value=\"47\">2047</option>\n");
      out.write("                                                        <option value=\"48\">2048</option>\n");
      out.write("                                                        <option value=\"49\">2049</option>\n");
      out.write("                                                        <option value=\"50\">2050</option>\n");
      out.write("                                                        <option value=\"51\">2051</option>\n");
      out.write("                                                    </select>\n");
      out.write("                      </span>\n");
      out.write("                  </td></tr>\n");
      out.write("                  <tr height=\"32\">\n");
      out.write("                      <td><b>CVV </b> </td>\n");
      out.write("                    <td colspan=\"3\"><span>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                   <table>\n");
      out.write("                       <tbody>\n");
      out.write("                           <tr><td>\n");
      out.write("                                   <input type=\"password\" name=\"cvv_1\"  placeholder=\"\" maxlength=\"4\"  size=\"6\" autocomplete=\"off\">\n");
      out.write("                               </td>\n");
      out.write("                               <td>\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                      </td>\n");
      out.write("                           </tr>\n");
      out.write("                       </tbody>\n");
      out.write("                   </table>\n");
      out.write("                        </span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr height=\"32\">\n");
      out.write("                      <td><b>Name on Card </b></td>\n");
      out.write("                    <td colspan=\"3\"><span>\n");
      out.write("                        <input type=\"text\" name=\"name_on_card_1\"   placeholder=\"\"  size=\"20\" autocomplete=\"off\">\n");
      out.write("                      </span></td>\n");
      out.write("                  </tr>\n");
      out.write("                  </tbody></table>\n");
      out.write("                <center><button onClick=\"window.location='Receipt.jsp'; \" value=\"Pay Now\">PAY NOW</button></center>\n");
      out.write("               </form>\n");
      out.write("              </div>\n");
      out.write("        </center>\n");
      out.write("  \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        \n");
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
