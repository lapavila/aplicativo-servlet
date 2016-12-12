package br.com.voffice.aw2.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.voffice.aw2.model.Usuario;

@WebFilter(urlPatterns = {"/*"})
public class SessionFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Usuario usuario = (Usuario) httpRequest.getSession().getAttribute("usuario");
		StringBuffer url = httpRequest.getRequestURL();
		
		//verifica se a url nao contem login para liberar o acesso a login.jsp e o servlet login
		if (!url.toString().contains("login")) {
			if (usuario == null) {
				httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
			}
		}
		chain.doFilter(request, response);
	}

	public void destroy() {
	}

}
