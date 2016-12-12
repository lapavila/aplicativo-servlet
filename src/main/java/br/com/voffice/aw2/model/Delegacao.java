package br.com.voffice.aw2.model;

import java.util.Date;

public class Delegacao {
	String nome;
	Date dataCadastro;

	public Delegacao(){}
	
	public Delegacao(String nome, Date dataCadastro) {
		super();
		this.nome = nome;
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
}
