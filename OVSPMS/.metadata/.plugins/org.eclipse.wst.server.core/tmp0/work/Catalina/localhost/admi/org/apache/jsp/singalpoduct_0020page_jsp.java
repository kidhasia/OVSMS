/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.29
 * Generated at: 2024-10-20 14:45:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class singalpoduct_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Vehicle Part Details</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("            background-color: #f8f9fa; /* Light background */\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            margin: 40px auto;\r\n");
      out.write("            background-color: #ffffff; /* White background for the container */\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1); /* Softer shadow */\r\n");
      out.write("            border-radius: 15px; /* Rounded corners */\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #333; /* Dark text color for the title */\r\n");
      out.write("            font-size: 32px; /* Increased font size for emphasis */\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            font-family: 'Poppins', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        .product-image img {\r\n");
      out.write("            width: 60%; /* Reduced width for image */\r\n");
      out.write("            height: auto;\r\n");
      out.write("            max-height: 250px; /* Reduced max height */\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            border-radius: 10px; /* Rounded corners for image */\r\n");
      out.write("            transition: transform 0.3s; /* Smooth hover effect */\r\n");
      out.write("        }\r\n");
      out.write("        .product-image img:hover {\r\n");
      out.write("            transform: scale(1.05); /* Scale image on hover */\r\n");
      out.write("        }\r\n");
      out.write("        .description {\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("            color: #555; /* Slightly lighter text for descriptions */\r\n");
      out.write("            font-size: 18px; /* Increased font size */\r\n");
      out.write("        }\r\n");
      out.write("        .price {\r\n");
      out.write("            font-size: 28px; /* Increased price font size */\r\n");
      out.write("            color: #28a745; /* Green color for price */\r\n");
      out.write("            margin: 15px 0;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .quantity {\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("            font-size: 16px; /* Font size for quantity */\r\n");
      out.write("            color: #333; /* Dark color for quantity label */\r\n");
      out.write("        }\r\n");
      out.write("        .quantity input {\r\n");
      out.write("            width: 60px; /* Width of the input field */\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            text-align: center; /* Center the input text */\r\n");
      out.write("            font-size: 16px; /* Font size for input */\r\n");
      out.write("        }\r\n");
      out.write("        .btn {\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            background-color: #007bff; /* Blue color for buttons */\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            font-size: 18px; /* Increased button font size */\r\n");
      out.write("            transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("            text-decoration: none; /* No underline for links */\r\n");
      out.write("            margin-top: 20px; /* Space above button */\r\n");
      out.write("        }\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            background-color: #0056b3; /* Darker blue on hover */\r\n");
      out.write("            transform: translateY(-2px);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1>Engine 123</h1>\r\n");
      out.write("    <div class=\"product-image\">\r\n");
      out.write("        <img src=\"images/A.jpg\" alt=\"Engine 123\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"description\">Part No: 12883945375</p>\r\n");
      out.write("    <p class=\"price\">$25.99</p>\r\n");
      out.write("\r\n");
      out.write("    <!-- Form to submit product details to the servlet -->\r\n");
      out.write("    <form action=\"insert.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"product_name\" value=\"Engine 123\">\r\n");
      out.write("        <input type=\"hidden\" name=\"price\" value=\"25.99\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- Quantity Input Field -->\r\n");
      out.write("        <div class=\"quantity\">\r\n");
      out.write("            <label for=\"quantity\">Quantity:</label>\r\n");
      out.write("            <input type=\"number\" id=\"quantity\" name=\"quantity\" value=\"1\" min=\"1\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <button type=\"submit\" class=\"btn\">Add to Cart</button>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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