/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-12-30 19:25:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.lesson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lessonWriting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1703380882317L));
    _jspx_dependants.put("jar:file:/Users/jy/Desktop/222/finalPrj/fin/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>lessonWriting</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/global.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/lessonWriting.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.css\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.4.10/dist/sweetalert2.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/3e3bbde124.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <section class=\"allSection\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("	<form method =\"post\" action=\"writeLessonForm\" id=\"writeLessonForm\" enctype=\"multipart/form-data\">\n");
      out.write("        <div class =\"imgbox\">\n");
      out.write(" 			<label for=\"img1\">\n");
      out.write("	 			<img id=\"imageInsertPic\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/images/imageinsert.png\">\n");
      out.write(" 			</label>\n");
      out.write(" 			<input type=\"file\" class=\"inputImage\" id=\"img1\" name=\"images\" accept=\"image/*\">\n");
      out.write(" 		</div>\n");
      out.write("         <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.userNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"loginUserNo\">\n");
      out.write("            <!-- input 박스 요소들 -->\n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                        <ion-icon name=\"person\"></ion-icon>\n");
      out.write("                    </span>\n");
      out.write("                    <input id=\"lessonMottoPlace\" name=\"userMotto\" type=\"text\" required maxlength=\"20\">\n");
      out.write("                    <label>TITLE</label>\n");
      out.write("                </div>\n");
      out.write("			\n");
      out.write("			<!-- 이름 -->\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                        <ion-icon name=\"Name\"></ion-icon>\n");
      out.write("                    </span>\n");
      out.write("                    <input id=\"lessonNamePlace\" name=\"userNick\" type=\"text\" required>\n");
      out.write("                    <label>NAME</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                        <ion-icon name=\"lock-closed\"></ion-icon>\n");
      out.write("                    </span>\n");
      out.write("                    <input id=\"lessonLocationPlace\" name=\"userRegion\" type=\"text\" required>\n");
      out.write("                    <label>LOCATION</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                        <ion-icon name=\"person\"></ion-icon>\n");
      out.write("                    </span>\n");
      out.write("                   <input id=\"lessonSocialPlace\" name=\"userSocial\" type=\"text\" required>\n");
      out.write("                    <label>SOCIAL MEDIA</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"input-box inputBoxText\">\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("	                        <ion-icon name=\"person\"></ion-icon>\n");
      out.write("                    </span>\n");
      out.write("                    <textarea name=\"userDetailExplain\" id=\"lessonDetailExplain\" cols=\"30\" rows=\"10\" required></textarea>\n");
      out.write("                    <label class=\"textLabel\">TELL YOUR STROY</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	\n");
      out.write("            <div class=\"lessonCheckWrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"genreWrapper\">\n");
      out.write("                    <p id=\"genreP\" class=\"\">GENRE</p>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <div class=\"genreBox\">\n");
      out.write("                        <table class=\"genreTable\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"ELECTRONIC\" name=\"genre\" value=\"ELECTRONIC\">\n");
      out.write("                                    <label for=\"ELECTRONIC\">ELECTRONIC</label>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"AQUSTIC\" name=\"genre\" value=\"AQUSTIC\">\n");
      out.write("                                    <label for=\"AQUSTIC\">AQUSTIC</label>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"FOLK\" name=\"genre\" value=\"FOLK\">\n");
      out.write("                                    <label for=\"FOLK\">FOLK</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"BLUES\" name=\"genre\" value=\"BLUES\">\n");
      out.write("                                    <label for=\"BLUES\">BLUES</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"METAL\" name=\"genre\" value=\"METAL\">\n");
      out.write("                                    <label for=\"METAL\">METAL</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"JAZZ\" name=\"genre\" value=\"JAZZ\">\n");
      out.write("                                    <label for=\"JAZZ\">JAZZ</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"ROCK\" name=\"genre\" value=\"ROCK\">\n");
      out.write("                                    <label for=\"ROCK\">ROCK</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"POP\" name=\"genre\" value=\"POP\">\n");
      out.write("                                    <label for=\"POP\">POP</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"lessonWrapper\">\n");
      out.write("                    <p id=\"lessonP\" class=\"\">LESSON</p>\n");
      out.write(" \n");
      out.write("                    <div class=\"lessonBox\">\n");
      out.write("                        <table class=\"lessonTable\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"GUITAR\" name=\"inst\" value=\"GUITAR\">\n");
      out.write("                                    <label for=\"GUITAR\">GUITAR</label>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"BASS\" name=\"inst\" value=\"BASS\">\n");
      out.write("                                    <label for=\"BASS\">BASS</label>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"KEYBOARD\" name=\"inst\" value=\"KEYBOARD\">\n");
      out.write("                                    <label for=\"KEYBOARD\">KEYBOARD</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"VOCAL\" name=\"inst\" value=\"VOCAL\">\n");
      out.write("                                    <label for=\"VOCAL\">VOCAL</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"SOUND\" name=\"inst\" value=\"SOUND\">\n");
      out.write("                                    <label for=\"SOUND\">SOUND</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"COMPOSITION\" name=\"inst\" value=\"COMPOSITION\">\n");
      out.write("                                    <label for=\"COMPOSITION\">COMPOSITION</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"DRUM\" name=\"inst\" value=\"DRUM\">\n");
      out.write("                                    <label for=\"DRUM\">DRUM</label>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"radio\" id=\"HORN\" name=\"inst\" value=\"HORN\">\n");
      out.write("                                    <label for=\"HORN\">HORN</label>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"writingBtnBox\">\n");
      out.write("                <button type=\"button\" id=\"writingBtn\">SUBMIT</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/chatting/chatRoomList.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/faq/faq.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <script src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/lessonWriting.js\"></script>\n");
      out.write("</body>\n");
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
