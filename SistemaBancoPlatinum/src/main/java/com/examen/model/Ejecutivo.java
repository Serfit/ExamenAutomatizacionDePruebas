package com.examen.model;

public class Ejecutivo {
	private int id;
	private String rut;
	private String nombre;
	private String departamento;
	
	public Ejecutivo(int id, String nombre, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.departamento= departamento;
	}
	public Ejecutivo() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Ejecutivo [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", departamento=" + departamento + "]";
	}
	
}
