package br.com.voffice.aw2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.voffice.aw2.model.Delegacao;
import br.com.voffice.aw2.model.Usuario;

@WebServlet("/delegacaoView")
public class DelegacaoViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Delegacao> delegacoes = (List<Delegacao>) request.getAttribute("delegacoes");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("<h1> Lista das Delegacoes</h1>");

		out.println("<table>");
		out.println("<tr><td>Nome</td></tr>");
		for (Delegacao delegacao : delegacoes) {
			out.println("<tr><td>" + delegacao.getNome() + "</td></tr>");
		}
		out.println("</teble>");
		out.println("</body>");
		out.println("</html>");

	}

}
