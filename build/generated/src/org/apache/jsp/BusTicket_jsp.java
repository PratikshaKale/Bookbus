package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BusTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Bus Ticket Reservation </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.seat-charts.css\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.seat-charts.js\"></script>\n");
      out.write("<style>\n");
      out.write("#myDIV {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 50px 0;\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: lightblue;\n");
      out.write("    margin-top:20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"content\">\n");
      out.write("    <form action=\"TicketData.jsp\" method=\"post\">\n");
      out.write("\t<h1>Bus Ticket Reservation</h1>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<h2>Book Your Seat Now?</h2>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<div id=\"seat-map\">\n");
      out.write("\t\t\t\t<div class=\"front-indicator\"><h3>Front</h3></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"booking-details\">\n");
      out.write("\t\t\t\t\t\t<div id=\"legend\"></div>\n");
      out.write("\t\t\t\t\t\t<h3> Selected Seats (<span id=\"counter\">0</span>):</h3>\n");
      out.write("\t\t\t\t\t\t<ul id=\"selected-seats\" class=\"scrollbar scrollbar1\"></ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tTotal: <b>RS<span id=\"total\">0</span></b>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<button class=\"checkout-button\">Pay Now</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t\tvar firstSeatLabel = 1;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\tvar $cart = $('#selected-seats'),\n");
      out.write("\t\t\t\t\t\t$counter = $('#counter'),\n");
      out.write("\t\t\t\t\t\t$total = $('#total'),\n");
      out.write("\t\t\t\t\t\tsc = $('#seat-map').seatCharts({\n");
      out.write("\t\t\t\t\t\tmap: [\n");
      out.write("\t\t\t\t\t\t\t'ff_ff',\n");
      out.write("\t\t\t\t\t\t\t'ff_ff',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee___',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'ee_ee',\n");
      out.write("\t\t\t\t\t\t\t'eeeee',\n");
      out.write("\t\t\t\t\t\t],\n");
      out.write("\t\t\t\t\t\tseats: {\n");
      out.write("\t\t\t\t\t\t\tf: {\n");
      out.write("\t\t\t\t\t\t\t\tprice   : 100,\n");
      out.write("\t\t\t\t\t\t\t\tclasses : 'first-class', //your custom CSS class\n");
      out.write("\t\t\t\t\t\t\t\tcategory: 'First Class'\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\te: {\n");
      out.write("\t\t\t\t\t\t\t\tprice   : 40,\n");
      out.write("\t\t\t\t\t\t\t\tclasses : 'economy-class', //your custom CSS class\n");
      out.write("\t\t\t\t\t\t\t\tcategory: 'Economy Class'\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tnaming : {\n");
      out.write("\t\t\t\t\t\t\ttop : false,\n");
      out.write("\t\t\t\t\t\t\tgetLabel : function (character, row, column) {\n");
      out.write("\t\t\t\t\t\t\t\treturn firstSeatLabel++;\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tlegend : {\n");
      out.write("\t\t\t\t\t\t\tnode : $('#legend'),\n");
      out.write("\t\t\t\t\t\t\titems : [\n");
      out.write("\t\t\t\t\t\t\t\t[ 'f', 'available',   'First Class' ],\n");
      out.write("\t\t\t\t\t\t\t\t[ 'e', 'available',   'Economy Class'],\n");
      out.write("\t\t\t\t\t\t\t\t[ 'f', 'unavailable', 'Already Booked']\n");
      out.write("\t\t\t\t\t\t\t]\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tclick: function () {\n");
      out.write("\t\t\t\t\t\t\tif (this.status() == 'available') {\n");
      out.write("\t\t\t\t\t\t\t\t//let's create a new <li> which we'll add to the cart items\n");
      out.write("\t\t\t\t\t\t\t\t$('<li>'+this.data().category+' : Seat no '+this.settings.label+': <b>Rs'+this.data().price+'</b> <a href=\"#\" class=\"cancel-cart-item\">[cancel]</a></li>')\n");
      out.write("\t\t\t\t\t\t\t\t\t.attr('id', 'cart-item-'+this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t.data('seatId', this.settings.id)\n");
      out.write("\t\t\t\t\t\t\t\t\t.appendTo($cart);\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\t\t * Lets update the counter and total\n");
      out.write("\t\t\t\t\t\t\t\t *\n");
      out.write("\t\t\t\t\t\t\t\t * .find function will not find the current seat, because it will change its stauts only after return\n");
      out.write("\t\t\t\t\t\t\t\t * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.\n");
      out.write("\t\t\t\t\t\t\t\t */\n");
      out.write("\t\t\t\t\t\t\t\t$counter.text(sc.find('selected').length+1);\n");
      out.write("\t\t\t\t\t\t\t\t$total.text(recalculateTotal(sc)+this.data().price);\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\treturn 'selected';\n");
      out.write("\t\t\t\t\t\t\t} else if (this.status() == 'selected') {\n");
      out.write("\t\t\t\t\t\t\t\t//update the counter\n");
      out.write("\t\t\t\t\t\t\t\t$counter.text(sc.find('selected').length-1);\n");
      out.write("\t\t\t\t\t\t\t\t//and total\n");
      out.write("\t\t\t\t\t\t\t\t$total.text(recalculateTotal(sc)-this.data().price);\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t//remove the item from our cart\n");
      out.write("\t\t\t\t\t\t\t\t$('#cart-item-'+this.settings.id).remove();\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t//seat has been vacated\n");
      out.write("\t\t\t\t\t\t\t\treturn 'available';\n");
      out.write("\t\t\t\t\t\t\t} else if (this.status() == 'unavailable') {\n");
      out.write("\t\t\t\t\t\t\t\t//seat has been already booked\n");
      out.write("\t\t\t\t\t\t\t\treturn 'unavailable';\n");
      out.write("\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\treturn this.style();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t//this will handle \"[cancel]\" link clicks\n");
      out.write("\t\t\t\t\t$('#selected-seats').on('click', '.cancel-cart-item', function () {\n");
      out.write("\t\t\t\t\t\t//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here\n");
      out.write("\t\t\t\t\t\tsc.get($(this).parents('li:first').data('seatId')).click();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t//let's pretend some seats have already been booked\n");
      out.write("\t\t\t\t\tsc.get(['1_2', '4_1', '7_1', '7_2']).status('unavailable');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\tfunction recalculateTotal(sc) {\n");
      out.write("\t\t\t\tvar total = 0;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t//basically find every selected seat and sum its price\n");
      out.write("\t\t\t\tsc.find('selected').each(function () {\n");
      out.write("\t\t\t\t\ttotal += this.data().price;\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\treturn total;\n");
      out.write("\t\t\t}\n");
      out.write("                        \n");
      out.write("\t\t</script>\n");
      out.write("                \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("<button onclick=\"myFunction()\">Try it</button>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("function myFunction() {\n");
      out.write("    var x = document.getElementById('myDIV');\n");
      out.write("    if (x.style.display === 'none') {\n");
      out.write("        x.style.display = 'block';\n");
      out.write("    } else {\n");
      out.write("        x.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<div id=\"myDIV\">\n");
      out.write("This is my DIV element.\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
