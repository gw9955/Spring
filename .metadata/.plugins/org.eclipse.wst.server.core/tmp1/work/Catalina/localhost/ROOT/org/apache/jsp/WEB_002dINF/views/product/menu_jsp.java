/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-11-10 06:40:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1667780522526L));
    _jspx_dependants.put("jar:file:/C:/eclipse-jee-2020-06-R-win32-x86_64/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/springProduct/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fcsrfInput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody;

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
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fcsrfInput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fsec_005fcsrfInput_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/bootstrap.min.css\" />\r\n");
      out.write("<!-- 스프링 시큐리티 표현식\r\n");
      out.write("	- 인증 및 권한 정보에 따라 화면을 동적으로 구성할 수 있고, 로그인 한 사용자 정보를 보여줄 수 있다\r\n");
      out.write("	- hasRole([role]) : 해당 권한이 있으면 true\r\n");
      out.write("	- hasAnyRole([role, role2]) : 여러 roles 중에서 하나라도 해당하는 롤이 있으면 true(or처럼)\r\n");
      out.write("	- principal : 인증된 사용자의 사용자 정보(UserDetails 인터페이스를 구현한 클래스의 객체)\r\n");
      out.write("					CustomUserDetailsService의 memberMapper 멤버변수\r\n");
      out.write("	- authentication : 인증된 사용자의 인증 정보\r\n");
      out.write("	- permitAll : 모든 사용자에게 허용\r\n");
      out.write("	- denyAll : 모든 사용자를 거부\r\n");
      out.write("	- isAnonymous() : 익명의 사용자의 경우.(로그인 하지 않은 경우도 해당)\r\n");
      out.write("	- ifAuthenticated() : 인증된 사용자면 treu\r\n");
      out.write("	- isFullyAuthenticated() : Remember-me(로그인 유지)로 인증된 것이 아닌 \r\n");
      out.write("							일반적인 방법으로 인증된 사용자인 경우 true\r\n");
      out.write("-->\r\n");
      out.write("<nav class=\"navbar navbar-expand navbar-dark bg-dark\">\r\n");
      out.write("	<!-- 내용이 들어간다. -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"navbar-header\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"products\">Home</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div style=\"float: right;\">\r\n");
      out.write("			<!-- 인증된 사용자인 경우 true. 로그인 했을 때에만 로그아웃 버튼이 보인다 -->\r\n");
      out.write("			");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("버튼 클릭 시 Modal 창을 띄운다\r\n");
      out.write("- button의 data-bs-toggle 속성을 \"modal\"로 설정해야 한다\r\n");
      out.write("- data-bs-target 속성은 출력할 modal div객체의 id를 넣어준다\r\n");
      out.write("- class=\"modal\" 이 div가 모달의 전체를 포함한 가장 큰 껍데기\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("	aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\">\r\n");
      out.write("		<!-- modal-content 안에 모달을 구성할 내용이 들어감 -->\r\n");
      out.write("		<div class=\"modal-content\">\r\n");
      out.write("			<!-- 1. Header -->\r\n");
      out.write("			<div class=\"modal-header\">\r\n");
      out.write("				<h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">나의 정보</h1>\r\n");
      out.write("				<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 2. body -->\r\n");
      out.write("<div class=\"modal-body\">\r\n");
      out.write("	<form>\r\n");
      out.write("		<!-- 인증된 사용자인 경우에만 실행함 시작 -->\r\n");
      out.write("		");
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 3. footer(생략 가능) \r\n");
      out.write("		data-bs-dismiss=\"modal\" => 닫기 기능이 적용됨\r\n");
      out.write("-->\r\n");
      out.write("			<div class=\"modal-footer\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("					data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/product/menu.jsp(28,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("				<form action=\"/logout\" method=\"post\">\r\n");
        out.write("					<button type=\"submit\" class=\"btn btn-primary\"\r\n");
        out.write("						style=\"-bs-btn-padding-y: .25rem; - -bs-btn-padding-x: .5rem; - -bs-btn-font-size: .75rem;\">\r\n");
        out.write("						로그아웃</button>\r\n");
        out.write("					");
        if (_jspx_meth_sec_005fcsrfInput_005f0(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("				</form>\r\n");
        out.write("				<button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\"\r\n");
        out.write("					data-bs-target=\"#exampleModal\" data-bs-whatever=\"@mdo\">나의\r\n");
        out.write("					정보 보기</button>\r\n");
        out.write("			");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      _jspx_th_sec_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fcsrfInput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:csrfInput
    org.springframework.security.taglibs.csrf.CsrfInputTag _jspx_th_sec_005fcsrfInput_005f0 = (org.springframework.security.taglibs.csrf.CsrfInputTag) _005fjspx_005ftagPool_005fsec_005fcsrfInput_005fnobody.get(org.springframework.security.taglibs.csrf.CsrfInputTag.class);
    boolean _jspx_th_sec_005fcsrfInput_005f0_reused = false;
    try {
      _jspx_th_sec_005fcsrfInput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fcsrfInput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
      int _jspx_eval_sec_005fcsrfInput_005f0 = _jspx_th_sec_005fcsrfInput_005f0.doStartTag();
      if (_jspx_th_sec_005fcsrfInput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fcsrfInput_005fnobody.reuse(_jspx_th_sec_005fcsrfInput_005f0);
      _jspx_th_sec_005fcsrfInput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fcsrfInput_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fcsrfInput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/product/menu.jsp(65,2) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("			<div class=\"bd-example\">\r\n");
        out.write("				<div class=\"card\" style=\"width: 100%;\">\r\n");
        out.write("					<svg class=\"bd-placeholder-img card-img-top\" width=\"100%\"\r\n");
        out.write("						height=\"180\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\"\r\n");
        out.write("						aria-label=\"Placeholder: Image cap\"\r\n");
        out.write("						preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\">\r\n");
        out.write("						<title>Placeholder</title><rect width=\"100%\" height=\"100%\"\r\n");
        out.write("							fill=\"#868e96\"></rect>\r\n");
        out.write("						<text x=\"50%\" y=\"50%\" fill=\"#dee2e6\" dy=\".3em\">Image cap</text></svg>\r\n");
        out.write("\r\n");
        out.write("					<div class=\"card-body\">\r\n");
        out.write("						<h5 class=\"card-title\">\r\n");
        out.write("							");
        if (_jspx_meth_sec_005fauthentication_005f0(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("						</h5>\r\n");
        out.write("					</div>\r\n");
        out.write("					<ul class=\"list-group list-group-flush\">\r\n");
        out.write("						<li class=\"list-group-item\"><label\r\n");
        out.write("							for=\"exampleFormControlInput1\" class=\"form-label\">아이디</label>\r\n");
        out.write("							<input type=\"text\" class=\"form-control\" id=\"memId\"\r\n");
        out.write("							value=\"");
        if (_jspx_meth_sec_005fauthentication_005f1(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write(" \">\r\n");
        out.write("						</li>\r\n");
        out.write("						<li class=\"list-group-item\"><label\r\n");
        out.write("							for=\"exampleFormControlInput1\" class=\"form-label\">생일</label> <input\r\n");
        out.write("							type=\"text\" class=\"form-control\" id=\"memBir\"\r\n");
        out.write("							value=\"");
        if (_jspx_meth_sec_005fauthentication_005f2(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write(" \">\r\n");
        out.write("						</li>\r\n");
        out.write("						<li class=\"list-group-item\"><label\r\n");
        out.write("							for=\"exampleFormControlInput1\" class=\"form-label\">주소</label> <input\r\n");
        out.write("							type=\"text\" class=\"form-control\" id=\"memAddr\"\r\n");
        out.write("							value=\"");
        if (_jspx_meth_sec_005fauthentication_005f3(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write("  \">\r\n");
        out.write("						</li>\r\n");
        out.write("						<li class=\"list-group-item\"><label\r\n");
        out.write("							for=\"exampleFormControlInput1\" class=\"form-label\">휴대폰번호</label>\r\n");
        out.write("							<input type=\"text\" class=\"form-control\" id=\"memHp\"\r\n");
        out.write("							value=\"");
        if (_jspx_meth_sec_005fauthentication_005f4(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write("\">\r\n");
        out.write("						</li>\r\n");
        out.write("						<li class=\"list-group-item\"><label\r\n");
        out.write("							for=\"exampleFormControlInput1\" class=\"form-label\">메일주소</label>\r\n");
        out.write("							<input type=\"text\" class=\"form-control\" id=\"memMail\"\r\n");
        out.write("							value=\"");
        if (_jspx_meth_sec_005fauthentication_005f5(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
          return true;
        out.write(" \">\r\n");
        out.write("						</li>\r\n");
        out.write("					</ul>\r\n");
        out.write("				</div>\r\n");
        out.write("			</div>\r\n");
        out.write("		");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      _jspx_th_sec_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(78,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setProperty("principal.memberVO.memName");
      int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      _jspx_th_sec_005fauthentication_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(85,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f1.setProperty("principal.memberVO.memId");
      int _jspx_eval_sec_005fauthentication_005f1 = _jspx_th_sec_005fauthentication_005f1.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f1);
      _jspx_th_sec_005fauthentication_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f2 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f2_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(90,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f2.setProperty("principal.memberVO.memBir");
      int _jspx_eval_sec_005fauthentication_005f2 = _jspx_th_sec_005fauthentication_005f2.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f2);
      _jspx_th_sec_005fauthentication_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f2, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f3 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f3_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(95,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f3.setProperty("principal.memberVO.memName");
      int _jspx_eval_sec_005fauthentication_005f3 = _jspx_th_sec_005fauthentication_005f3.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f3);
      _jspx_th_sec_005fauthentication_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f3, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f4 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f4_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(100,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f4.setProperty("principal.memberVO.memHp");
      int _jspx_eval_sec_005fauthentication_005f4 = _jspx_th_sec_005fauthentication_005f4.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f4);
      _jspx_th_sec_005fauthentication_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f4, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f5 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f5_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f5.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
      // /WEB-INF/views/product/menu.jsp(105,14) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f5.setProperty("principal.memberVO.memMail");
      int _jspx_eval_sec_005fauthentication_005f5 = _jspx_th_sec_005fauthentication_005f5.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f5);
      _jspx_th_sec_005fauthentication_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f5, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f5_reused);
    }
    return false;
  }
}
