package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import server.model.Produto;

public final class estoque_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
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
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Estoque</h1>\r\n");
      out.write("        <table class=\"table table-striped\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">Código</th>\r\n");
      out.write("                    <th scope=\"col\">Nome</th>\r\n");
      out.write("                    <th scope=\"col\">Medida</th>\r\n");
      out.write("                    <th scope=\"col\">Quantidade</th>\r\n");
      out.write("                    <th scope=\"col\">Preço</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");

                   List<Produto> product = (List<Produto>) request.getAttribute("product");
                   for ( Produto prod : product ){
                       out.print("<tr>");
                       out.print("<td>" + prod.getId() + "</td>");
                       out.print("<td>" + prod.getNome() + "</td>");
                       out.print("<td>" + prod.getMedida() + "</td>");
                       out.print("<td>" + prod.getQuantidade() + "</td>");
                       out.print("<td>" + String.format("%.2f", prod.getPreco()) + "</td>");
                       out.print("</tr>");
                   }
               
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("            <a href=\"editar\">Editar Produto</a>\r\n");
      out.write("            <form action=\"home\"><button class=\"btn btn-primary\">Voltar</button></form>\r\n");
      out.write("    </div>\r\n");
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
