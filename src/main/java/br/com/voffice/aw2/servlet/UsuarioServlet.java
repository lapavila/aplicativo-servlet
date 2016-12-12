package br.com.voffice.aw2.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

import br.com.voffice.aw2.dao.UsuarioDao;
import br.com.voffice.aw2.dao.mysql.UsuarioMysql;
import br.com.voffice.aw2.model.Usuario;

@WebServlet("/usuario/*")
public class UsuarioServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// retorna o que tem depois do "/usuario" tipo "/1"
		// compbase nele decidimos se é pra listar ou editar/criar um novo
		// usuario
		String info = req.getPathInfo();

		UsuarioDao dao = new UsuarioMysql();
		String destino;

		if (info == null) {
			List<Usuario> usuarios = dao.findAll();
			req.setAttribute("usuarios", usuarios);
			destino = "/user/lista.jsp";
		} else {
			String idStr = info.replaceAll("/", "");
			int id = Integer.parseInt(idStr);
			Usuario usuario = dao.findById(id);
			req.setAttribute("usuario", usuario);
			destino = "/user/form.jsp";
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(destino);
		dispatcher.forward(req, res);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Enumeration<String> parameters = req.getParameterNames();
		
		while(parameters.hasMoreElements()) {
			System.out.println("==>> Parametro: " + parameters.nextElement());
		}
		
		String contextPath = req.getContextPath();
		
		res.sendRedirect(contextPath + "/usuario");
		
	}

}
