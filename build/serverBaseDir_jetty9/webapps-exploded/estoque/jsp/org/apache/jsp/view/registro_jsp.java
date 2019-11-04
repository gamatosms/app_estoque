package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css\\style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib\\bootstrap\\css\\bootstrap.min.css\">\r\n");
      out.write("    <title>Caixa</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"registro\">\r\n");
      out.write("        <h1>Registro de Produto</h1>\r\n");
      out.write("        <label for=\"\">Código: </label>\r\n");
      out.write("        <input type=\"text\">\r\n");
      out.write("        <label for=\"\">Nome: </label>\r\n");
      out.write("        <input type=\"text\">\r\n");
      out.write("        <label for=\"\">Unidade de medida: </label>\r\n");
      out.write("        <input type=\"text\">\r\n");
      out.write("        <label for=\"\">Valor: </label>\r\n");
      out.write("        <input type=\"text\" value=\"R$ \">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" id=\"registrar\">Registrar</button>\r\n");
      out.write("        <div class=\"alert alert-success\" role=\"alert\">\r\n");
      out.write("            Produto Registrado! <a href=\"home\" class=\"alert-link\">Voltar</a>.\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"lib\\jquery\\jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"lib\\bootstrap\\js\\bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js\\efeitos.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    </html>");
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
