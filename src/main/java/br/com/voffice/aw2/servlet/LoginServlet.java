package br.com.voffice.aw2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.voffice.aw2.dao.UsuarioDao;
import br.com.voffice.aw2.dao.mysql.UsuarioMysql;
import br.com.voffice.aw2.exception.LoginException;
import br.com.voffice.aw2.model.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.isEmpty() || password.isEmpty()) {
			request.getSession().setAttribute("message", "Informe username e/ou password");
			response.sendRedirect("login.jsp");
			return;
		}
		
		UsuarioDao dao = new UsuarioMysql();
		Usuario usuario = dao.findByUsername(username);
		
		if (usuario == null || (usuario != null && !usuario.isPassword(password))) {
			request.getSession().setAttribute("message", "Usuário ou senha inválidos");
			response.sendRedirect("login.jsp");
			return;
		}
		
		request.getSession().setAttribute("usuario", usuario);
		response.sendRedirect("index.jsp");
	}
	
}
