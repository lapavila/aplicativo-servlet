package br.com.voffice.aw2.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.voffice.aw2.dao.UsuarioDao;
import br.com.voffice.aw2.model.Usuario;

public class UsuarioMysql implements UsuarioDao {

	public Usuario findByUsername(String username) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement("SELECT * FROM usuario WHERE username = ?");
            prepStmt.setString(1, username);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
            	int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                username = rs.getString("username");
                String password = rs.getString("password");
                usuario = new Usuario(id, fullName, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return usuario;
	}
	
	public Usuario findById(Integer id) {
        Connection conn = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conn = ConnectionManager.getConexao();
            prepStmt = conn.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            prepStmt.setInt(1, id);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
            	id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String username = rs.getString("username");
                String password = rs.getString("password");
                usuario = new Usuario(id, fullName, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn, prepStmt, rs);
        }
        return usuario;
	}

	public List<Usuario> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            conn = ConnectionManager.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM usuario");
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String username = rs.getString("username");
                String password = rs.getString("password");
                lista.add(new Usuario(id, fullName, username, password));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn, stmt, rs);
        }
        return lista;
	}

}
