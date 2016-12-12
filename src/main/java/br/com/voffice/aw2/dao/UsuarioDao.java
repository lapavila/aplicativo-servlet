package br.com.voffice.aw2.dao;

import java.util.List;

import br.com.voffice.aw2.model.Usuario;

public interface UsuarioDao {
	public Usuario findByUsername(String username);
	public Usuario findById(Integer id);
	public List<Usuario> findAll();
	
}
