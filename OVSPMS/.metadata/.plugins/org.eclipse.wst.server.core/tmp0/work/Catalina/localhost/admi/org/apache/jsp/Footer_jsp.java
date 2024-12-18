/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.29
 * Generated at: 2024-10-21 11:07:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .footer {\r\n");
      out.write("            background-color: #001f3f; /* Dark background */\r\n");
      out.write("            color: #ffffff; /* White text */\r\n");
      out.write("            padding: 20px 0; /* Padding for top and bottom */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-around; /* Space between sections */\r\n");
      out.write("            max-width: 1200px; /* Maximum width for the footer */\r\n");
      out.write("            margin: 0 auto; /* Center footer */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-section {\r\n");
      out.write("            flex: 1; /* Make each section equal width */\r\n");
      out.write("            margin: 0 15px; /* Margin between sections */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-section h3 {\r\n");
      out.write("            margin-bottom: 10px; /* Spacing below the heading */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-section ul {\r\n");
      out.write("            list-style-type: none; /* No bullet points */\r\n");
      out.write("            padding: 0; /* No padding */\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .footer-section ul li::before {\r\n");
      out.write("            content: none; /* This will ensure no unwanted markers or symbols appear */\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .footer-section ul li {\r\n");
      out.write("            margin: 5px 0; /* Space between list items */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-section a {\r\n");
      out.write("            color: #ffffff; /* White links */\r\n");
      out.write("            text-decoration: none; /* No underline */\r\n");
      out.write("            transition: color 0.3s; /* Smooth transition */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-section a:hover {\r\n");
      out.write("            color: #00ccff; /* Light blue on hover */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-bottom {\r\n");
      out.write("            text-align: center; /* Center text */\r\n");
      out.write("            padding-top: 20px; /* Padding above the bottom section */\r\n");
      out.write("            border-top: 1px solid rgba(255, 255, 255, 0.2); /* Light top border */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-logo {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center; /* Center logo */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-logo img {\r\n");
      out.write("            width: 100px; /* Set logo width */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-social {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center; /* Center social icons */\r\n");
      out.write("            margin: 10px 0; /* Margin above and below */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-social a {\r\n");
      out.write("            margin: 0 10px; /* Spacing between icons */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer-social a img {\r\n");
      out.write("            width: 30px; /* Set a fixed width for social icons */\r\n");
      out.write("            height: 30px; /* Set a fixed height for social icons */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Responsive Design */\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            .footer-container {\r\n");
      out.write("                flex-direction: column; /* Stack sections on small screens */\r\n");
      out.write("                align-items: center; /* Center items */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .footer-bottom {\r\n");
      out.write("                flex-direction: column; /* Stack elements in bottom section */\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .footer-logo {\r\n");
      out.write("                margin: 10px 0; /* Margin above and below */\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer-container\">\r\n");
      out.write("        <div class=\"footer-section\">\r\n");
      out.write("            <h3>Our Company</h3>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"AboutUs.jsp\">About Us</a></li>\r\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQ</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-section\">\r\n");
      out.write("            <h3>Help and Support</h3>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-logo\">\r\n");
      out.write("            <img src=\"images/Logo.png\" alt=\"homepage.jsp\"> <!-- Replace with the actual path to your logo -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <p>Copyright 2022 © SpareMarts.com All Rights Reserved.</p>\r\n");
      out.write("        <div class=\"footer-social\">\r\n");
      out.write("            <a href=\"#\"><img src=\"images/FB.png\" alt=\"Facebook\"></a> <!-- Replace with actual social media icons -->\r\n");
      out.write("            <a href=\"#\"><img src=\"images/INSTA.png\" alt=\"Instagram\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"images/X.png\" alt=\"Twitter\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
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
