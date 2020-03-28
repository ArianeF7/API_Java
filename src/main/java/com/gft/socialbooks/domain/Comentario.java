package com.gft.socialbooks.domain;

import java.sql.Date;

public class Comentario {
	
	private Long id;
	private String Texto;
	private String Usuario;
	private Date Data;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public Date getData() {
		return Data;
	}
	public void setData(Date data) {
		Data = data;
	}
	

}
