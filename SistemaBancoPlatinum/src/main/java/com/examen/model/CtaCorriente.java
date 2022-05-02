package com.examen.model;

public class CtaCorriente {
	private int idCuenta;
	private int idRutCliente;
	private int monto;
	private String ejecutivo;
	
	
	
	public CtaCorriente(int idCuenta, int idRutCliente, int monto, String ejecutivo) {
		super();
		this.idCuenta = idCuenta;
		this.idRutCliente = idRutCliente;
		this.monto = monto;
		this.ejecutivo = ejecutivo;
	}
	
	
	
	public CtaCorriente() {
		super();
	}



	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public int getIdRutCliente() {
		return idRutCliente;
	}
	public void setIdRutCliente(int idRutCliente) {
		this.idRutCliente = idRutCliente;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}



	@Override
	public String toString() {
		return "CtaCorriente [idCuenta=" + idCuenta + ", idRutCliente=" + idRutCliente + ", monto=" + monto
				+ ", ejecutivo=" + ejecutivo + "]";
	}
	
	
	
}
