package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class redSeat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div class=\"seat-container-wrapper expand\">\n");
      out.write("           \n");
      out.write("   <div class=\"seat-container-div seatlayout-main-body clearfix\">\n");
      out.write("     <!--<div class=\"seat-select-lbl\">Select Seats</div>-->\n");
      out.write("      <div class=\"seat-container\"><div><div class=\"SeatsSelectorWrapper\">\n");
      out.write("\t<div class=\"clearfix SeatsSelector MB\">\n");
      out.write("    <div class=\"price-ploy-container\" style=\"display: none;\">\n");
      out.write("      <div class=\"price-ploy-innerWrapper\">\n");
      out.write("        <h3 class=\"seat-label\">Seat Price</h3>\n");
      out.write("        <div class=\"clearfix price-ploy-wrapper\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"clearfix\"></div>\n");
      out.write("\t\t<div class=\"leftContent clearfix seatlayout-padding-40\">\n");
      out.write("      <div class=\"seat-layout clearfix\">\n");
      out.write("                <div class=\"label-wrapper clearfix hide\">\n");
      out.write("                    <div class=\"fr lower-selector hide\">Lower</div>\n");
      out.write("                    <div class=\"fl upper-selector hide\">Upper</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lower-canvas canvas-wrapper\">\n");
      out.write("                  <div class=\"label hide\">Lower Deck</div>\n");
      out.write("                <canvas data-type=\"lower\" width=\"447\" height=\"193\" class=\"\"></canvas></div>\n");
      out.write("                <div class=\"upper-canvas canvas-wrapper\">\n");
      out.write("                    <div class=\"label hide\">Upper Deck</div>\n");
      out.write("                </div>\n");
      out.write("                     \n");
      out.write("        </div>\n");
      out.write("\t\t</div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div></div>\n");
      out.write("      <div class=\"other-container\">\n");
      out.write("         <span class=\"seat-close\" title=\"close\"><i class=\"icon-cross\"></i></span>\n");
      out.write("         <!--<div class=\"travel-date-info hide\"></div>-->\n");
      out.write("\n");
      out.write("         <div class=\"legend-container\">\n");
      out.write("            <h3 class=\"legend-header\">seat legend</h3>\n");
      out.write("            <div class=\"legend-wrap\">\n");
      out.write("               <div class=\"legend-left clearfix\">\n");
      out.write("                  <div class=\"seat-legend-wrap  seater-legend\">\n");
      out.write("                     <div class=\"available-seat fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">available</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"seat-legend-wrap sleeper-legend hide\">\n");
      out.write("                     <div class=\"available-sleep fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">available</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"seat-legend-wrap seater-legend\">\n");
      out.write("                     <div class=\"unavailable-seat fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">unavailable</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"seat-legend-wrap sleeper-legend hide\">\n");
      out.write("                     <div class=\"unavailable-sleep fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">unavailable</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"seat-legend-wrap  seater-legend ladies-legend hide\">\n");
      out.write("                     <div class=\"ladies-seat fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">ladies</div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"seat-legend-wrap  sleeper-legend ladies-legend hide\">\n");
      out.write("                     <div class=\"ladies-sleep fl\"></div>\n");
      out.write("                     <div class=\"legend-label\">ladies</div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"extra-info\">\n");
      out.write("\n");
      out.write("          <div class=\"route-notes hide\">\n");
      out.write("            <h3 class=\"notes-label\">SERVICE NOTE</h3>\n");
      out.write("            <div class=\"service-item\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"redDeal-wrapper hide\">\n");
      out.write("            <h3 class=\"redDeal-label\">Red Deals</h3>\n");
      out.write("            <p class=\"red-offr\"></p>\n");
      out.write("            <p>Terms &amp; Conditions:</p>\n");
      out.write("            <div class=\"redDeals-item\"></div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"search-seatlayout animated hide\">\n");
      out.write("          <div class=\"curtain\"></div>\n");
      out.write("          <div class=\"seatlayout-meta-container clearfix\">\n");
      out.write("            <div class=\"seatlayout-main-body\">\n");
      out.write("              <p class=\"location-label\">Choose your Boarding and Dropping point</p>\n");
      out.write("              <div class=\"rtcBpDp-holder clearfix hide\">\n");
      out.write("                <div class=\"holder-label\">Boarding &amp; Dropping Points</div>\n");
      out.write("                <div class=\"fl\">\n");
      out.write("                  <div class=\"bp-val fl\"></div>\n");
      out.write("                  <div class=\"dp-val fl\"></div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"bp-dp-container\"><div class=\"clearfix\" data-view=\"seatlayoutBpDpView\"><i class=\"icon icon-down bp-dp-down\"></i>\n");
      out.write("<div class=\"list-cont\">\n");
      out.write("\t<div class=\"bp-list-cont\" data-type=\"bp\">\n");
      out.write("\t\t<div class=\"header pick-up\">\n");
      out.write("      <span>Boarding</span>\n");
      out.write("      <span>/</span>\n");
      out.write("      <span>Dropping</span>\n");
      out.write("\n");
      out.write("      <!--<i class=\"icon icon-down bp-dp-down\"></i>-->\n");
      out.write("  </div>\n");
      out.write("\t\t<div class=\"bp-val\"></div>\n");
      out.write("    <div class=\"bp-address\"></div>\n");
      out.write("   <div class=\"bp-address-container hide\">\n");
      out.write("      <p class=\"bp-address-hover\"></p>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\t<label class=\"bp-err hide\">Select Boarding Point</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"dp-list-cont\" data-type=\"dp\">\n");
      out.write("\t<div class=\"header \">Dropping<i class=\"icon icon-down bp-dp-down\"></i></div>\n");
      out.write("\t<div class=\"dp-val\"></div>\n");
      out.write("  <div class=\"dp-address\"></div>\n");
      out.write("  <div class=\"dp-address-container hide\">\n");
      out.write("    <p class=\"dp-address-hover\"></p>\n");
      out.write("  </div>\n");
      out.write("<label class=\"dp-err hide\">Select Dropping Point</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"bp-dp-selector-container\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div></div>\n");
      out.write("              <hr class=\"seperator\">\n");
      out.write("              <p class=\"summary-title\"></p>\n");
      out.write("              <div class=\"seatlayout-meta\"><div class=\"clearfix\" data-view=\"seatlayoutMetaView\"><div>\n");
      out.write("\t<div class=\"seats-selected-container\">\n");
      out.write("\t\t<label>SEAT NUMBER : </label>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div></div>\n");
      out.write("              <div class=\"fare-break\"><div class=\"clearfix\" data-view=\"seatlayoutFareSummaryView\"></div></div>\n");
      out.write("\n");
      out.write("              <div class=\"seatlayout-fare-break-container hide\">\n");
      out.write("              </div>\n");
      out.write("              <h3 class=\"fare-toggle-btn\">\n");
      out.write("                Show Fare Details\n");
      out.write("\n");
      out.write("              </h3>\n");
      out.write("              <div class=\"fr showlayout-button-container w-15\"><div class=\"clearfix\" data-view=\"seatlayoutShowLayoutView\"></div></div>\n");
      out.write("              <div class=\"continue-container \">\n");
      out.write("                <button class=\"button continue dn inactive\">Proceed</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"clearfix\"></div>\n");
      out.write("       <div class=\"seat-loader hide\"></div>\n");
      out.write(" \n");
      out.write("   <div class=\"no-of-buses hide main-body clearfix\">\n");
      out.write("      <span class=\"no-of-buses-block\"> <span class=\"buses-remaining\"></span><span>Buses</span><i class=\"icon icon-down buses-down\"></i>\n");
      out.write("      </span>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"sel-bp-dp hide main-body\">\n");
      out.write("     Select Boarding and Dropping Points to show seat layout\n");
      out.write("   </div>\n");
      out.write("   <div class=\"seat-overlay hide\"></div>\n");
      out.write("</div>\n");
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
