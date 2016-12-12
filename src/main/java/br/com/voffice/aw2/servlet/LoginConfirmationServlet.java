package br.com.voffice.aw2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginConfirmationServlet
 */
@WebServlet("/loginConfirmation")
public class LoginConfirmationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = (String) request.getAttribute("nome_usuario");
		
		ServletContext ctx = request.getServletContext();
		
		String bancoDados = ctx.getInitParameter("banco_dados");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Login efetuado com sucesso para " + usuario + "</h1>");
		out.println("<h3>Banco de dados: " + bancoDados + "</h3>");
		out.println("<h3>" + this.getClass().getName() + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
