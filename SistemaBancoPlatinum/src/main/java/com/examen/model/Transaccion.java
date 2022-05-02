package com.examen.model;

public class Transaccion {
	private int idTransaccion;
	private int idRutCliente;
	private int idRutDueño;
	private int idCuenta;
	private int montoTransferencia;
	private String cuentaTransferencia;
	private String tipoCuente;

	public Transaccion(int idTransaccion, int idRutCliente, int idRutDueño, int idCuenta, int montoTransferencia,
			String cuentaTransferencia, String tipoCuente) {
		super();
		this.idTransaccion = idTransaccion;
		this.idRutCliente = idRutCliente;
		this.idRutDueño = idRutDueño;
		this.idCuenta = idCuenta;
		this.montoTransferencia = montoTransferencia;
		this.cuentaTransferencia = cuentaTransferencia;
		this.tipoCuente = tipoCuente;
	}
	
	public Transaccion() {
		super();
	}
	
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public int getIdRutCliente() {
		return idRutCliente;
	}
	public void setIdRutCliente(int idRutCliente) {
		this.idRutCliente = idRutCliente;
	}
	public int getIdRutDueño() {
		return idRutDueño;
	}
	public void setIdRutDueño(int idRutDueño) {
		this.idRutDueño = idRutDueño;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public int getMontoTransferencia() {
		return montoTransferencia;
	}
	public void setMontoTransferencia(int montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}
	public String getCuentaTransferencia() {
		return cuentaTransferencia;
	}
	public void setCuentaTransferencia(String cuentaTransferencia) {
		this.cuentaTransferencia = cuentaTransferencia;
	}
	public String getTipoCuente() {
		return tipoCuente;
	}
	public void setTipoCuente(String tipoCuente) {
		this.tipoCuente = tipoCuente;
	}

	@Override
	public String toString() {
		return "Transaccion [idTransaccion=" + idTransaccion + ", idRutCliente=" + idRutCliente + ", idRutDueño="
				+ idRutDueño + ", idCuenta=" + idCuenta + ", montoTransferencia=" + montoTransferencia
				+ ", cuentaTransferencia=" + cuentaTransferencia + ", tipoCuente=" + tipoCuente + "]";
	}	
	
}
