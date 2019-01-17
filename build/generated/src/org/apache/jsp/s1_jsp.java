package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class s1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online seat reservation</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"seat.css\"/>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"seat.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /*\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("*/\n");
      out.write("/* \n");
      out.write("    Created on : Jul 31, 2015, 11:38:31 AM\n");
      out.write("    Author     : Niranjan\n");
      out.write("*/\n");
      out.write("\n");
      out.write(".screen {\n");
      out.write("    padding: 6px;\n");
      out.write("    margin-top: 30px;\n");
      out.write("    margin-bottom: 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table>.fixed-column {\n");
      out.write("    position: absolute;\n");
      out.write("    display: inline-block;\n");
      out.write("    width: auto;\n");
      out.write("    border-right: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".td th {\n");
      out.write("    width: 31px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".tdBox {\n");
      out.write("    display: inline-block; \n");
      out.write("    width: 26px;\n");
      out.write("    height: 23px;\n");
      out.write("    padding: 1px 3px; \n");
      out.write("    border: 4px double white;\n");
      out.write("    background-color:#ddd;\n");
      out.write("    opacity: 0.4;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".spanBox {\n");
      out.write("    display: inline-block; \n");
      out.write("    width: 28px;\n");
      out.write("    height: 23px;\n");
      out.write("    padding: 1px 3px; \n");
      out.write("    border: 4px double white;\n");
      out.write("    background-color:#ddd;\n");
      out.write("    margin-top: 2%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".seatsBtn {\n");
      out.write("    margin-top: 1%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input {\n");
      out.write("    width: 14%;\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("    margin-right: 2%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".greenColor{\n");
      out.write("    background-color: #5cb85c;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".redColor{\n");
      out.write("    background-color: #d9534f;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".resultTable td:nth-child(3){\n");
      out.write("    max-width:100%;\n");
      out.write("    word-break: break-all;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-lg-12 col-sm-12 col-md-12 text-center\">\n");
      out.write("                    <h1>MOVIE SEAT RESERVATION</h1>\n");
      out.write("                    <div class='row text-center'>\n");
      out.write("                        <input type=\"text\" class=\"form-control input\" id=\"Name\" placeholder=\"Enter Name\" >\n");
      out.write("                        <input type=\"number\" min='0' max='50' class=\"form-control input\" id=\"Seats\" placeholder=\"Enter number of seats\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class='row'>\n");
      out.write("                        <button type=\"button\" id=\"Selectseat\" class=\"btn btn-success seatsBtn\">Select Seats</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-sm-2 col-md-2 col-lg-2\"></div>\n");
      out.write("                        <div class=\"col-xs-12 col-sm-8 col-md-8 col-lg-8 bg-primary screen\">SCREEN</div>\n");
      out.write("                        <div class=\"col-xs-12 col-sm-2 col-md-2 col-lg-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-sm-2 col-md-2 col-lg-2\"></div>\n");
      out.write("                        <div class=\"col-xs-12 col-sm-8 col-md-8 col-lg-8\">\n");
      out.write("                            <table id=\"seatTable\" class=\"table fixed-column td\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>2</th>\n");
      out.write("                                        <th>3</th>\n");
      out.write("                                        <th>4</th>\n");
      out.write("                                        <th>5</th>\n");
      out.write("                                        <th>6</th>\n");
      out.write("                                        <th>7</th>\n");
      out.write("                                        <th>8</th>\n");
      out.write("                                        <th>9</th>\n");
      out.write("                                        <th>10</th>\n");
      out.write("                                        <th></th>\n");
      out.write("                                        <th>11</th>\n");
      out.write("                                        <th>12</th>\n");
      out.write("                                        <th>13</th>\n");
      out.write("                                        <th>14</th>\n");
      out.write("                                        <th>15</th>\n");
      out.write("                                        <th>16</th>\n");
      out.write("                                        <th>17</th>\n");
      out.write("                                        <th>18</th>\n");
      out.write("                                        <th>19</th>\n");
      out.write("                                        <th>20</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>A</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>B</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>C</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>D</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>E</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>F</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>G</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>H</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>I</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>J</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            <button type=\"button\" id=\"ConfirmSeat\" class=\"btn btn-warning seatsBtn\">Confirm Seats</button>\n");
      out.write("                            <div>\n");
      out.write("                                <span class=\"spanBox\" style='Background-color:green'></span><label>Selected Seats</label>\n");
      out.write("                                <span class=\"spanBox\" style='Background-color:red'></span><label>Reserved Seats</label>\n");
      out.write("                                <span class=\"spanBox\"></span><label>Empty Seats</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-12 col-sm-2 col-md-2 col-lg-2\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class='row'>\n");
      out.write("                <div class='col-xs-12 col-sm-2 col-md-2 col-lg-2'></div>\n");
      out.write("                <div class='col-xs-12 col-sm-6 col-md-6 col-lg-6'>\n");
      out.write("                    <table class='table-striped table table-bordered resultTable'>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>No. of Seats</th>\n");
      out.write("                                <th>Seats Reserved</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class='col-xs-12 col-sm-4 col-md-4 col-lg-4'></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("Raw\n");
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
