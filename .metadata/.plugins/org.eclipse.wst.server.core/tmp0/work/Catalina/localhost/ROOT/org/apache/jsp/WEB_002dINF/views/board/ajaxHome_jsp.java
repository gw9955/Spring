/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-10-25 08:01:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajaxHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1666247046900L));
    _jspx_dependants.put("jar:file:/C:/eclipse-jee-2020-06-R-win32-x86_64/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write(" src=\"/resources/js/jquery.min.js\"></script>\r\n");
      out.write("<title>Headers 매핑</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//document가 로딩이 완료 되면 실행\r\n");
      out.write("$(function(){\r\n");
      out.write("   $(\"button\").on(\"click\",function(){\r\n");
      out.write("      let boardNoVal = \"7\";\r\n");
      out.write("      let boardObject = {\r\n");
      out.write("            \"boardNo\" : \"7\",\r\n");
      out.write("            \"title\" : \"개똥이 수리남가다\",\r\n");
      out.write("            \"content\" : \"식사는 잡쉈어?\",\r\n");
      out.write("            \"writer\" : \"개똥이\"\r\n");
      out.write("      }\r\n");
      out.write("      console.log(\"boardObject :\" + JSON.stringify(boardObject));\r\n");
      out.write("      //비동기\r\n");
      out.write("      //아작났어유.. PC다탔어\r\n");
      out.write("      //contentType => 보내는 타입\r\n");
      out.write("      //dataType => 응답타입\r\n");
      out.write("      $.ajax({\r\n");
      out.write("         url : \"/board/\"+boardNoVal,\r\n");
      out.write("         contentType : \"application/json;charset=utf-8\",\r\n");
      out.write("         data : JSON.stringify(boardObject),\r\n");
      out.write("         type : \"put\",\r\n");
      out.write("         success : function(result){\r\n");
      out.write("            console.log(\"result : \" + result);\r\n");
      out.write("         }\r\n");
      out.write("      });\r\n");
      out.write("   }); //end\r\n");
      out.write("   \r\n");
      out.write("   $(\"input[name='btnAccept']\").on(\"click\",function() {\r\n");
      out.write("	   let boardNo = $(\"#boardNo\").val(); // 7\r\n");
      out.write("	   \r\n");
      out.write("	   console.log(\"boardNo : \" + boardNo);\r\n");
      out.write("	   // get방식으로/board/7 URI를 요청하면\r\n");
      out.write("	   // JSON 데이터로 비동기 응답이 된다\r\n");
      out.write("	   $.get(\"/board/\"+boardNo, function(data) {\r\n");
      out.write("		   // data : JSON데이터\r\n");
      out.write("		   console.log(\"data : \" + JSON.stringify(data));\r\n");
      out.write("	   })\r\n");
      out.write("   }); //end\r\n");
      out.write("   \r\n");
      out.write("   $(\"input[name='btnJson']\").on(\"click\",function() {\r\n");
      out.write("	  let boardNo = $(\"#boardNo\").val();\r\n");
      out.write("	  \r\n");
      out.write("	  console.log(\"boardNo : \" + boardNo);\r\n");
      out.write("	  \r\n");
      out.write("	  let data = {\r\n");
      out.write("			  \"boardNo\":boardNo\r\n");
      out.write("	  };\r\n");
      out.write("	  // ajax\r\n");
      out.write("	  $.ajax( {\r\n");
      out.write("		  url:\"/board/getBook\",\r\n");
      out.write("		  contentType:\"application/json;charset:utf-8\",\r\n");
      out.write("		  data:JSON.stringify(data),\r\n");
      out.write("		  type:\"post\",\r\n");
      out.write("		  success:function(result) {\r\n");
      out.write("			  // result는 bookVO => JSON으로 변환\r\n");
      out.write("			  console.log(JSON.stringify(result));\r\n");
      out.write("		  }\r\n");
      out.write("	  });\r\n");
      out.write("   });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>Headers 매핑</h2>\r\n");
      out.write("<button type=\"button\">식사는 잡쉈어?</button>\r\n");
      out.write("<h2>7.Accept 매핑</h2>\r\n");
      out.write("<p><input type=\"text\" name=\"boardNo\" id=\"boardNo\" value=\"7\" /></p>\r\n");
      out.write("<p><input type=\"button\" name=\"btnAccept\" value=\"실행\" /></p>\r\n");
      out.write("<p><input type=\"button\" name=\"btnJson\" value=\"ajax로실행\" /></p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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