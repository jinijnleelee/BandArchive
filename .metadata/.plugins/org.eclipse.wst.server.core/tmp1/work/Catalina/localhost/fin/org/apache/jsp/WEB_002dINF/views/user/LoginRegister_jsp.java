/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-12-24 01:36:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("	<title>로그인</title>\n");
      out.write("\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/global.css\">\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/fullcalendar@6.1.8/index.global.min.js\"></script>\n");
      out.write("	<script src=\"https://kit.fontawesome.com/44f3dd3f25.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("	<script type=\"text/javascript\" src=\"https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/LoginRegister.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css\"/>\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/naverLogin.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/loginbootStrap.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/loginModal.css\">\n");
      out.write("	<script src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/myPageModal.js\"></script>\n");
      out.write("  <script src=\"https://t1.kakaocdn.net/kakao_js_sdk/2.2.0/kakao.min.js\"\n");
      out.write("  integrity=\"sha384-x+WG2i7pOR+oWb6O5GV5f1KN2Ko6N7PTGPS7UlasYWNxZMKQA63Cj/B2lbUmUfuC\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css\">\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("	</head>\n");
      out.write("      <!--바디 부분 시작-->\n");
      out.write("      <body>\n");
      out.write(" 	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("   \n");
      out.write(" 	\n");
      out.write(" 	<div class=\"svgBox\">\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 1117 669\">\n");
      out.write("            <g id=\"loginBack\">\n");
      out.write("              <path class=\"loginPath\" d=\"m335.5,92.5c-4.16,2.26-10.27,5.28-18,8-8.44,2.97-13.67,4.82-21,5-10.67.27-18.75-3.15-23-5-3.78-1.64-11.02-4.88-18-12-3.16-3.22-13.32-13.59-14-29-.21-4.66-.56-12.57,5-19,.9-1.04,8.34-9.38,18-7,8.32,2.05,11.43,10.35,12,12,.36,1.06,3.27,9.82-1,13-2.63,1.96-7.61,1.5-9-1-1.38-2.49,1.22-6.24,3-8,5.4-5.35,14.34-3.4,16-3,2.37.57,7.03,1.7,10,6,3.06,4.42,2.37,9.36,2,12-.27,1.94-1.12,8.02-6,12-2.91,2.38-6.27,2.92-13,4-3.59.58-4.63.23-11,1-1.78.21-1.92.26-7,1-9.03,1.31-9.98,1.36-14,2-4.17.66-6.65,1.17-11,2-12.11,2.32-16.06,2.87-22,4-7.1,1.35-20.1,3.88-35,9-3.24,1.11-13.4,4.7-26,11-9.61,4.81-26.21,13.24-44,29-5.77,5.11-14.78,13.19-24,26-7.64,10.63-12.08,19.85-15,26-6.89,14.5-10.24,26.27-11,29-2.67,9.6-7.39,26.99-6,49,.45,7.14,1.43,12.96,2,16,.44,2.34,2.14,11.07,8,27,4.49,12.19,6.73,18.29,11,26,2.05,3.7,8.21,14.39,19,26,1.6,1.72,8.49,9.05,19,17,3.72,2.81,8.37,6.3,15,10,8.29,4.62,14.82,6.86,24,10,9.06,3.1,15.68,5.37,25,7,2.84.5,4.54.69,24,2,22.33,1.5,24.32,1.53,28,1,6.91-1,17.46-2.68,25-11,1.46-1.61,8.36-9.23,6-15-2.62-6.4-15.11-6.83-22-6-2.63.32-11.26,1.63-28,15-7.95,6.35-18.19,14.66-28,29-10.17,14.87-14.82,28.8-17,37-.93,3.5-4.22,16.51-4,34,.09,7.12.42,22.71,7,41,10.23,28.46,29.02,45.19,38,53,14.36,12.49,27.65,18.99,36,23,18.58,8.93,33.86,12.32,51,16,9.76,2.1,28.13,5.59,52,7,8.88.52,43.93,2.26,91-6,19.29-3.39,32.38-7.01,54-13,48.71-13.49,83.88-27.69,92-31,33.51-13.68,57.49-26.25,78-37,8.03-4.21,35.22-18.59,70-40,11.43-7.04,29.96-19.36,67-44,46.63-31.01,55.1-37.12,63-43,20.19-15.04,16.21-13.47,48-38,32.07-24.74,37.09-27.09,57-44,16.88-14.34,25.32-21.51,34-30,14.62-14.3,21.85-23.39,24-22,1.52.98-.23,6.74-13,36-8.19,18.77-14.78,33.15-17,38-15.19,33.17-22.82,49.82-24,53-1.29,3.45-8.16,22.09-13,31-.45.83-2.56,4.65-5,10-1.95,4.26-1.49,6.21-3,7-2.78,1.44-7.05-2.6-13-7-.5-.37-7-4.25-20-12-12.45-7.43-15.94-6.12-22-12-3.27-3.17-3.82-4.77-6-5-5.11-.53-8.7,7.57-19,20-8.12,9.79-8.83,11.29-10,11-4.87-1.22,2.34-24.49-10-45-2.24-3.73-4.4-7.29-8-10-3.65-2.74-6.35-3.15-11-5-4.85-1.93-3.71-2.2-17-10-10.87-6.38-16.31-9.57-20-11-4.11-1.59-5.87-1.88-6-3-.36-3.1,12.44-6.63,32-13,10.72-3.49,21.31-7.39,32-11,1.32-.45,25.01-8.46,50-18,19.55-7.46,37.11-14.79,52-21,32.24-13.45,40.9-17.77,42-16,2.05,3.29-24.45,23.57-42,37-1.62,1.24-12.41,9.16-34,25-17.99,13.2-26.01,19.07-37,28-8.59,6.98-15.46,12.96-20,17\"/>\n");
      out.write("            </g>\n");
      out.write("        </svg>\n");
      out.write("    </div>\n");
      out.write(" 	\n");
      out.write(" 	\n");
      out.write("    <section class=\"loginSection\"> <!-- body -->\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\"> <!--wrapper-->\n");
      out.write("\n");
      out.write("            <div class=\"formBox login\"> <!--for-box login-->\n");
      out.write("                <h2>LOGIN</h2>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("		\n");
      out.write("                <form action=\"fin/login\" method=\"POST\" name=\"login-form\" onsubmit=\"return loginValidate()\">\n");
      out.write("                	<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ref}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"ref\">\n");
      out.write("                    <div class=\"inputBox\"> <!--input-box-->\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"mail\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"email\" name=\"userEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.saveId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"required>\n");
      out.write("                        <label>EMAIL</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">  <!--input-box-->\n");
      out.write("                        <span class=\"icon\" onclick=\"showAndHide()\">\n");
      out.write("                            <i id=\"eye\" class=\"bi bi-eye-fill\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"password\" id=\"password\" name=\"userPw\" required>\n");
      out.write("                        <label>PASSWORD</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"rememberForgot\">  <!--remember-forgot-->\n");
      out.write("                        <label><input type=\"checkbox\" name=\"saveId\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chk}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("  id=\"saveId\"> Remember me</label>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/findPw\">Forgot Password?</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"loginBtnBox\" title=\"밴드아카이브 로그인\">\n");
      out.write("                      \n");
      out.write("                      <button type=\"submit\" class=\"btn\">LOGIN</button>\n");
      out.write("                      \n");
      out.write("                      <div id=\"naver_id_login\" title=\"네이버 아이디로 로그인\">\n");
      out.write("                        LOGIN WITH NAVER\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"naverImgBox\">\n");
      out.write("                        <img id=\"naverIMG\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/naverIMG.png\" alt=\"\" title=\"네이버 아이디로 로그인\">\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                      <div class=\"kakaoBtn\" title=\"카카오 아이디로 로그인\">\n");
      out.write("                        <a id=\"kakao-login-btn\" href=\"https://kauth.kakao.com/oauth/authorize?client_id=de31983424f4bd5faadc8493b90e5626&response_type=code&redirect_uri=http://bandarchive.kro.kr/fin/kakaoLogin\">\n");
      out.write("                          LOGIN WITH KAKAO\n");
      out.write("                        </a>\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/kakaoIcon.png\" alt=\"\">\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"loginRegister\">   <!--login-register-->\n");
      out.write("                        <p>Don't have an account? <a href=\"#\" class=\"register-link\">Register</a></p>\n");
      out.write("                        <p>Are you businessman?<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/businessRegi\" class=\"register-link\">Business login</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- register -->\n");
      out.write("\n");
      out.write("            <div class=\"formBox register\"> \n");
      out.write("                <h2>REGISTRATION</h2>\n");
      out.write("\n");
      out.write("                <form id =\"form\" action=\"fin/signUp\" method=\"POST\" name=\"regi-form\" onsubmit=\"return signUpValidate()\">\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\" id=\"embox\"> <!--input-box-->\n");
      out.write("                        <span class=\"icon\" id=\"emion\">\n");
      out.write("                            <ion-icon name=\"mail\" id=\"sendEmail\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"email\" id=\"email\" name=\"userEmail\">\n");
      out.write("                        <label>EMAIL&nbsp;&nbsp;<span class=\"signUp-message\" id=\"emailMessage\"></span></label>\n");
      out.write("                        <div class=\"emshow\"><p>이메일 보내기</p></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\"> <!--input-box-->\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"key-outline\" id=\"sendEm\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"text\" id=\"checkEmail\">\n");
      out.write("                        <label>CERTIFICATION NUMBER&nbsp;&nbsp;<span class=\"signUp-message\" id=\"emailCheckMessage\"></span></label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">  <!--input-box-->         \n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"lock-closed\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        \n");
      out.write("                        <input type=\"password\" id=\"rpassword\" name=\"userPw\">\n");
      out.write("                        <label>PASSWORD&nbsp;&nbsp;<span class=\"signUp-message\" id=\"pwMessage\"></span></label>                      \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">  <!--input-box-->\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"checkmark-outline\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"password\" id=\"password2\">\n");
      out.write("                        <label>CHECK PW&nbsp;&nbsp;<span class=\"signUp-message\" id=\"pwMessage2\"></span></label>                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">  <!--input-box-->\n");
      out.write("                        <span class=\"icon\">\n");
      out.write("                            <ion-icon name=\"person-outline\"></ion-icon>\n");
      out.write("                        </span>\n");
      out.write("                        <input type=\"text\" id=\"nickname\" name=\"userNick\">\n");
      out.write("                        <label>Nickname&nbsp;&nbsp;<span class=\"signUp-message\" id=\"nicknameMessage\"></span></label>                       \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"rememberForgot\">  <!--remember-forgot-->\n");
      out.write("                        <label><input type=\"checkbox\" name=\"agreeList\" id=\"agree\"> Agree to the terms & conditions</label>            \n");
      out.write("                        <a href=\"#\" class=\"js-static-modal-toggle\">Show terms  & conditions</a>\n");
      out.write("              		</div>\n");
      out.write("					           \n");
      out.write("                    <button type=\"submit\" class=\"btn\">REGISTER</button>\n");
      out.write("\n");
      out.write("                    <div class=\"loginRegister\">   <!--login-register-->\n");
      out.write("                        <p>Already have an account? <a href=\"#\" class=\"login-link\">Login</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("              \n");
      out.write("        <div id=\"static-modal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" style=\"display: none; padding-right: 17px;\">\n");
      out.write("          <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("              <h1>Terms Of Use</h1>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("               <div class=\"contents\">\n");
      out.write("        <form action=\"/\" method=\"POST\" id=\"form__wrap\">\n");
      out.write("          <div class=\"terms__check__all\">\n");
      out.write("            <input type=\"checkbox\" name=\"checkAll\" id=\"checkAll\" />\n");
      out.write("            <label for=\"checkAll\"\n");
      out.write("              >BandArchive 이용약관, 매치정보 수신(선택)에 모두 동의합니다.</label\n");
      out.write("            >\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"terms__list\">\n");
      out.write("            <li class=\"terms__box\">\n");
      out.write("              <div class=\"input__check\">\n");
      out.write("                <input type=\"checkbox\" name=\"agreement\" id=\"termsOfService\" value=\"termsOfService\" required />\n");
      out.write("                <label for=\"termsOfService\" class=\"required\">BandArchive 이용약관 동의</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"terms__content\">\n");
      out.write("                BandArchive 여러분을 환영합니다.  서비스 및 제품(이하 ‘서비스’)을 이용해 주셔서 감사합니다. 본 약관은 다양한 JUN\n");
      out.write("                서비스의 이용과 관련하여 서비스를 제공하는  주식회사(이하 ‘서비스’)와 이를 이용하는  서비스\n");
      out.write("                회원(이하 ‘회원’) 또는 비회원과의 관계를 설명하며, 아울러 여러분의  서비스 이용에 도움이 될 수 있는\n");
      out.write("                유익한 정보를 포함하고 있습니다. 서비스를 이용하시거나 서비스 회원으로 가입하실 경우 여러분은 본\n");
      out.write("                약관 및 관련 운영 정책을 확인하거나 동의하게 되므로, 잠시 시간을 내시어 주의 깊게 살펴봐 주시기\n");
      out.write("                바랍니다.\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"terms__box\">\n");
      out.write("              <div class=\"input__check\">\n");
      out.write("                <input type=\"checkbox\" name=\"agreement\" id=\"privacyPolicy\" value=\"privacyPolicy\" required />\n");
      out.write("                <label for=\"privacyPolicy\" class=\"required\">개인정보 수집 및 이용 동의</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"terms__content\">\n");
      out.write("                개인정보보호법에 따라 BandArchive에 회원가입 신청하시는 분께 수집하는 개인정보의 항목, 개인정보의 수집 및\n");
      out.write("                이용목적, 개인정보의 보유 및 이용기간, 동의 거부권 및 동의 거부 시 불이익에 관한 사항을 안내 드리오니\n");
      out.write("                자세히 읽은 후 동의하여 주시기 바랍니다.1. 수집하는 개인정보 이용자는 회원가입을 하지 않아도 정보 검색,\n");
      out.write("                뉴스 보기 등 대부분의 네이버 서비스를 회원과 동일하게 이용할 수 있습니다. 이용자가 메일, 캘린더, 카페,\n");
      out.write("                블로그 등과 같이 개인화 혹은 회원제 서비스를 이용하기 위해 회원가입을 할 경우, 네이버는 서비스 이용을\n");
      out.write("                위해 필요한 최소한의 개인정보를 수집합니다.\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"terms__box\">\n");
      out.write("              <div class=\"input__check\">\n");
      out.write("                <input type=\"checkbox\" name=\"agreement\" id=\"allowPromotions\" value=\"allowPromotions\" />\n");
      out.write("                <label for=\"allowPromotions\"  class=\"required\">매치 정보 동의</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"terms__content\">\n");
      out.write("                BandArchive에서 제공하는 이벤트/혜택 등 다양한 정보를 휴대전화(BandArchive앱 알림 또는 문자), 이메일로 받아보실 수\n");
      out.write("                있습니다. 일부 서비스(별도 회원 체계로 운영하거나 BandArchive 가입 이후 추가 가입하여 이용하는 서비스 등)의\n");
      out.write("                경우, 개별 서비스에 대해 별도 수신 동의를 받을 수 있으며, 이때에도 수신 동의에 대해 별도로 안내하고\n");
      out.write("                동의를 받습니다.\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\" id=\"agreebtn\">Agree</button>\n");
      out.write("              </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("              </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("          </div><!-- /.modal-dialog -->\n");
      out.write("          \n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      const msg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("      if (msg.trim() !== \"\") {\n");
      out.write("        Swal.fire({\n");
      out.write("          icon: \"warning\",\n");
      out.write("          text: msg,\n");
      out.write("          title: \"BandArchive\"\n");
      out.write("        });\n");
      out.write("      } \n");
      out.write("\n");
      out.write("      \n");
      out.write("        // 왜 자꾸 로그인 창을 들어가도 공백 alert가 뜰까 \n");
      out.write("        // -> 해결 -> != null로 조건을 주지 말고, 문자열로 체크를 해서 주면 발생하지않음.\n");
      out.write("        // 빈 문자열인 경우에는 alert를 발생시키지 않음\n");
      out.write("    </script>\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/faq/faq.jsp", out, false);
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/chatting/chatRoomList.jsp", out, false);
      out.write("\n");
      out.write("        	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("   \n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/LoginRegister.js?ver=1\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/naverLogin.js\"></script>\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/kakaoLogin.js\"></script>\n");
      out.write("  </body>\n");
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