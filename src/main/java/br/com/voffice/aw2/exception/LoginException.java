package br.com.voffice.aw2.exception;

import javax.servlet.ServletException;

public class LoginException extends ServletException {

	public LoginException(String message) {
		super(message);
	}
}
