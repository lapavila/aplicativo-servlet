package br.com.voffice.aw2.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.voffice.aw2.model.Delegacao;
import br.com.voffice.aw2.model.Usuario;

@WebServlet("/delegacao")
public class DelegacaoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Delegacao> delegacoes = new ArrayList<Delegacao>();
		delegacoes.add(new Delegacao("Brasil", new Date()));
		delegacoes.add(new Delegacao("Estado Unidos", new Date()));
		delegacoes.add(new Delegacao("Canada", new Date()));
		delegacoes.add(new Delegacao("Alemanha", new Date()));
		delegacoes.add(new Delegacao("Japao", new Date()));
		delegacoes.add(new Delegacao("China", new Date()));
		
		request.setAttribute("delegacoes", delegacoes);
		
		request.getRequestDispatcher("delegacao/lista.jsp").forward(request, response);
	}
	
}
