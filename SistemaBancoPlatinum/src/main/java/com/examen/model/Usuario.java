package com.examen.model;

public class Usuario {
	private int idUsuario;
	private String nombre;
	private String usuario;
	private String password;
	
	public Usuario(String nombre, String usuario, String password) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		
	}
	public Usuario() {
		
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", usuario=" + usuario + ", password="
				+ password + "]";
	}
	
	
}
