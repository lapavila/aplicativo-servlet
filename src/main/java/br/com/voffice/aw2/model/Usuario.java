package br.com.voffice.aw2.model;

public class Usuario {
	Integer id;
	String fullName;
	String username;
	String password;
	
	public Usuario() {}
	
	public Usuario(Integer id, String fullName, String username, String password) {
		this.id = id;
		this.fullName = fullName;
		this.username = username;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isPassword(String password) {
		return this.password.equals(password);
	}
	
}
