/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.29
 * Generated at: 2024-10-20 08:38:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"slider\">\r\n");
      out.write("        <div class=\"slides\">\r\n");
      out.write("            <img src=\"images\\vehicle-spare-parts-1-1.jpg\" class=\"pictures\">\r\n");
      out.write("            <img src=\"images\\disc-brake-and-pads-on-a-vehicle.jpg\" class=\"pictures\">\r\n");
      out.write("            <img src=\"images\\219-DGARAGE-KiaForteGTPart3-000-lead.jpg\" class=\"pictures\">\r\n");
      out.write("            <img src=\"images\\Tips-to-Choose-Genuine-Spare-Parts-from-Online-or-Physical-Store.jpg\" class=\"pictures\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <h1 class=\"text\">Auto parts paradise Sri Lanka</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <!-- Engine Parts Box -->\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"box-content\">\r\n");
      out.write("                <img src=\"images/ve-sinh-khoang-dong-co.jpg\" alt=\"Engine Parts\">\r\n");
      out.write("                <div class=\"box-text\">\r\n");
      out.write("                    <h2>ENGINE PARTS</h2>\r\n");
      out.write("                    <a href=\"catalogpage.jsp\" class=\"more-details\">More Details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"details\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Cylinder Block</li>\r\n");
      out.write("                    <li>Crankshaft</li>\r\n");
      out.write("                    <li>Camshaft</li>\r\n");
      out.write("                    <li>Pistons</li>\r\n");
      out.write("                    <li>Connecting Rods</li>\r\n");
      out.write("                    <li>Oil Pump</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Service Parts Box -->\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"box-content\">\r\n");
      out.write("                <img src=\"images/R.jpeg\" alt=\"Service Parts\">\r\n");
      out.write("                <div class=\"box-text\">\r\n");
      out.write("                    <h2>SERVICE PARTS</h2>\r\n");
      out.write("                    <a href=\"#\" class=\"more-details\">More Details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"details\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Air Filters</li>\r\n");
      out.write("                    <li>Oil Filters</li>\r\n");
      out.write("                    <li>Brake Pads & Rotors</li>\r\n");
      out.write("                    <li>Fuel Filters</li>\r\n");
      out.write("                    <li>Spark Plugs</li>\r\n");
      out.write("                    <li>Timing Belts/Chains</li>\r\n");
      out.write("                    <li>Batteries</li>\r\n");
      out.write("                    <li>Coolant</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Body Parts Box -->\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"box-content\">\r\n");
      out.write("                <img src=\"images/feature-image-6.jpg\" alt=\"Body Parts\">\r\n");
      out.write("                <div class=\"box-text\">\r\n");
      out.write("                    <h2>BODY PARTS</h2>\r\n");
      out.write("                    <a href=\"#\" class=\"more-details\">More Details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"details\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Bumpers</li>\r\n");
      out.write("                    <li>Fenders</li>\r\n");
      out.write("                    <li>Hoods</li>\r\n");
      out.write("                    <li>Mirrors</li>\r\n");
      out.write("                    <li>Grilles</li>\r\n");
      out.write("                    <li>Headlights & Taillights</li>\r\n");
      out.write("                    <li>Doors & Door Handles</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Lubricants Box -->\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"box-content\">\r\n");
      out.write("                <img src=\"images/lubricants2.jpg\" alt=\"Lubricants\">\r\n");
      out.write("                <div class=\"box-text\">\r\n");
      out.write("                    <h2>LUBRICANTS</h2>\r\n");
      out.write("                    <a href=\"#\" class=\"more-details\">More Details</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"details\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>Gear Oil</li>\r\n");
      out.write("                    <li>Coolant/Antifreeze</li>\r\n");
      out.write("                    <li>Grease</li>\r\n");
      out.write("                    <li>Power Steering Fluid</li>\r\n");
      out.write("                    <li>Brake Fluid</li>\r\n");
      out.write("                    <li>Transmission Fluid</li>\r\n");
      out.write("                    <li>Engine Oil</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("       :root {\r\n");
      out.write("    --primary-color: #1c2b4b;\r\n");
      out.write("    --secondary-color: #ffffff;\r\n");
      out.write("    --accent-color: #007aff;\r\n");
      out.write("    --text-color: #ffffff;\r\n");
      out.write("    --background-color: #f0f2f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background-color: var(--background-color);\r\n");
      out.write("    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: var(--primary-color);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  .slider{\r\n");
      out.write("   \r\n");
      out.write("    top:50%;\r\n");
      out.write("    left:50%;\r\n");
      out.write("    width :100%;\r\n");
      out.write("    height: 540px;\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("  .slides{\r\n");
      out.write("    transform: translate(-50%,-50%);\r\n");
      out.write("    width :100%;\r\n");
      out.write("    height: 540px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    animation: slide 30s infinite;\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("  }\r\n");
      out.write("  @keyframes slide{\r\n");
      out.write("    0%{\r\n");
      out.write("      transform: translateX(0);\r\n");
      out.write("    }\r\n");
      out.write("    12.5%{\r\n");
      out.write("      transform: translateX(0);\r\n");
      out.write("    }\r\n");
      out.write("    25%{\r\n");
      out.write("      transform: translateX(-100%);\r\n");
      out.write("    }\r\n");
      out.write("    37.5%{\r\n");
      out.write("      transform: translateX(-100%);\r\n");
      out.write("    }\r\n");
      out.write("    50%{\r\n");
      out.write("      transform: translateX(-200%);\r\n");
      out.write("    }\r\n");
      out.write("    62.5%{\r\n");
      out.write("      transform: translateX(-200%);\r\n");
      out.write("    }\r\n");
      out.write("    75%{\r\n");
      out.write("      transform: translateX(-300%);\r\n");
      out.write("    }\r\n");
      out.write("    87.5%{\r\n");
      out.write("      transform: translateX(-300%);\r\n");
      out.write("    }\r\n");
      out.write("   \r\n");
      out.write("    100%{\r\n");
      out.write("      transform: translateX(-400%);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("  .slider::after{\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top:107px;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 540px;\r\n");
      out.write("    background-color: rgba(0,0,0,0.65);\r\n");
      out.write("   \r\n");
      out.write("  }\r\n");
      out.write("  .slides img{\r\n");
      out.write("    flex:1 0 100%;\r\n");
      out.write("    scroll-snap-align: start;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("  }\r\n");
      out.write(" .text {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    transform: translate(-50%, -50%); /* This will perfectly center the text */\r\n");
      out.write("    color: rgb(255, 255, 255);\r\n");
      out.write("    z-index: 999;\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(" .container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    padding: 40px 20px;\r\n");
      out.write("    max-width: 1300px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box {\r\n");
      out.write("    background-color: var(--primary-color);\r\n");
      out.write("    color: var(--text-color);\r\n");
      out.write("    max-width: 700px;\r\n");
      out.write("    margin: 20px;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    border-radius: 12px;\r\n");
      out.write("    box-shadow: 0 8px 16px rgba(0, 0, 0, 0.15);\r\n");
      out.write("    transition: transform 0.3s ease-in-out, box-shadow 0.3s ease-in-out;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: row;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box:hover {\r\n");
      out.write("    transform: scale(1.05);\r\n");
      out.write("    box-shadow: 0 12px 24px rgba(0, 0, 0, 0.25);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box img {\r\n");
      out.write("    width: 220px;\r\n");
      out.write("    height: 160px;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("    border-radius: 12px;\r\n");
      out.write("    margin-right: 25px;\r\n");
      out.write("    transition: transform 0.3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".box-content {\r\n");
      out.write("    flex: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box h2 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    color: var(--accent-color);\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".box-text {\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".more-details {\r\n");
      out.write("    background-color: var(--accent-color);\r\n");
      out.write("    color: var(--secondary-color);\r\n");
      out.write("    padding: 12px 30px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    transition: background-color 0.3s ease, transform 0.3s ease;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".more-details:hover {\r\n");
      out.write("    background-color: #0056b3;\r\n");
      out.write("    transform: translateY(-3px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".details {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".details ul {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".details ul li {\r\n");
      out.write("    padding: 8px 0;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".details ul li:last-child {\r\n");
      out.write("    border-bottom: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 768px) {\r\n");
      out.write("    .box {\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .box img {\r\n");
      out.write("        margin: 0 0 20px 0;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        max-width: 400px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .box-content {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
