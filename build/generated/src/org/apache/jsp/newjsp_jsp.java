package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   \n");
      out.write("        <style>\n");
      out.write("            #holder{    \n");
      out.write("height:200px;    \n");
      out.write("width:550px;\n");
      out.write("background-color:#F5F5F5;\n");
      out.write("border:1px solid #A4A4A4;\n");
      out.write("margin-left:10px;   \n");
      out.write("}\n");
      out.write("#place {\n");
      out.write("position:relative;\n");
      out.write("margin:7px;\n");
      out.write("}\n");
      out.write("#place a{\n");
      out.write("font-size:0.6em;\n");
      out.write("}\n");
      out.write("#place li\n");
      out.write("{\n");
      out.write(" list-style: none outside none;\n");
      out.write(" position: absolute;   \n");
      out.write("}    \n");
      out.write("#place li:hover\n");
      out.write("{\n");
      out.write("background-color:yellow;      \n");
      out.write("} \n");
      out.write("#place .seat{\n");
      out.write("background:url(\"IMAGES/available_seat_img.gif\") no-repeat scroll 0 0 transparent;\n");
      out.write("height:33px;\n");
      out.write("width:33px;\n");
      out.write("display:block;   \n");
      out.write("}\n");
      out.write("#place .selectedSeat\n");
      out.write("{ \n");
      out.write("background-image:url(\"IMAGES/booked_seat_img.gif\");          \n");
      out.write("}\n");
      out.write("#place .selectingSeat\n");
      out.write("{ \n");
      out.write("background-image:url(\"IMAGES/selected_seat_img.gif\");        \n");
      out.write("}\n");
      out.write("#place .row-3, #place .row-4{\n");
      out.write("margin-top:10px;\n");
      out.write("}\n");
      out.write("#seatDescription li{\n");
      out.write("//verticle-align:middle;    \n");
      out.write("list-style: none outside none;\n");
      out.write("padding-left:35px;\n");
      out.write("height:35px;\n");
      out.write("float:left;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("             <script>\n");
      out.write("            var settings = {\n");
      out.write("               rows: 5,\n");
      out.write("               cols: 15,\n");
      out.write("               rowCssPrefix: 'row-',\n");
      out.write("               colCssPrefix: 'col-',\n");
      out.write("               seatWidth: 35,\n");
      out.write("               seatHeight: 35,\n");
      out.write("               seatCss: 'seat',\n");
      out.write("               selectedSeatCss: 'selectedSeat',\n");
      out.write("               selectingSeatCss: 'selectingSeat'\n");
      out.write("           };\n");
      out.write("           var init = function (reservedSeat) {\n");
      out.write("                var str = [], seatNo, className;\n");
      out.write("                for (i = 0; i < settings.rows; i++) {\n");
      out.write("                    for (j = 0; j < settings.cols; j++) {\n");
      out.write("                        seatNo = (i + j * settings.rows + 1);\n");
      out.write("                        className = settings.seatCss + ' ' + settings.rowCssPrefix + i.toString() + ' ' + settings.colCssPrefix + j.toString();\n");
      out.write("                        if ($.isArray(reservedSeat) && $.inArray(seatNo, reservedSeat) !==-1) {\n");
      out.write("                            className += ' ' + settings.selectedSeatCss;\n");
      out.write("                        }\n");
      out.write("                        str.push('<li class=\"' + className + '\"' +\n");
      out.write("                                  'style=\"top:' + (i * settings.seatHeight).toString() + 'px;left:' + (j * settings.seatWidth).toString() + 'px\">' +\n");
      out.write("                                  '<a title=\"' + seatNo + '\">' + seatNo + '</a>' +\n");
      out.write("                                  '</li>');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                $('#place').html(str.join('.'));\n");
      out.write("            };\n");
      out.write("            //case I: Show from starting\n");
      out.write("            //init();\n");
      out.write(" \n");
      out.write("            //Case II: If already booked\n");
      out.write("            var bookedSeats = [5, 10, 25];\n");
      out.write("            init(bookedSeats);\n");
      out.write("           $('.' + settings.seatCss).click(function () {\n");
      out.write("        if ($(this).hasClass(settings.selectedSeatCss)){\n");
      out.write("            alert('This seat is already reserved');\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            $('.' + settings.seatCss).removeClass(settings.selectingSeatCss);\n");
      out.write("            $(this).addClass(settings.selectingSeatCss);\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("         else{\n");
      out.write("      $(this).toggleClass(settings.selectingSeatCss);\n");
      out.write("      $(\".settings.selectingSeatCss\").not(this).removeClass('settings.selectingSeatCss');\n");
      out.write("      }\n");
      out.write("\n");
      out.write(" \n");
      out.write("$('#btnShow').click(function () {\n");
      out.write("    var str = [];\n");
      out.write("    $.each($('#place li.' + settings.selectedSeatCss + ' a, #place li.'+ settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("        str.push($(this).attr('title'));\n");
      out.write("    });\n");
      out.write("    alert(str.join(','));\n");
      out.write("});\n");
      out.write(" \n");
      out.write("$('#btnShowNew').click(function () {\n");
      out.write("    var str = [], item;\n");
      out.write("    $.each($('#place li.' + settings.selectingSeatCss + ' a'), function (index, value) {\n");
      out.write("        item = $(this).attr('title');                   \n");
      out.write("        str.push(item);                   \n");
      out.write("    });\n");
      out.write("    alert(str.join(','));\n");
      out.write("});\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    <body>\n");
      out.write("                 \n");
      out.write("       <h2> Choose seats by clicking the corresponding seat in the layout below:</h2>\n");
      out.write("    <div id=\"holder\"> \n");
      out.write("        <ul  id=\"place\">\n");
      out.write("            \n");
      out.write("    \n");
      out.write("        </ul>    \n");
      out.write("    </div>\n");
      out.write("    <div style=\"float:left;\"> \n");
      out.write("    <ul id=\"seatDescription\">\n");
      out.write("        <li style=\"background:url('IMAGES/available_seat_img.gif') no-repeat scroll 0 0 transparent;\">Available Seat</li>\n");
      out.write("        <li style=\"background:url('IMAGES/booked_seat_img.gif') no-repeat scroll 0 0 transparent;\">Booked Seat</li>\n");
      out.write("        <li style=\"background:url('IMAGES/selected_seat_img.gif') no-repeat scroll 0 0 transparent;\">Selected Seat</li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"clear:both;width:100%\">\n");
      out.write("        <input type=\"button\" id=\"btnShowNew\" value=\"Show Selected Seats\" />\n");
      out.write("        <input type=\"button\" id=\"btnShow\" value=\"Show All\" />           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
