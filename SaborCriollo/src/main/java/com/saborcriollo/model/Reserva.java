package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "tb_Reserva")
@Data
public class Reserva {	
	@Id
	@NotEmpty(message = "no de estar vació")
	private int idReserva;
	private int idLocal;
	private String nombreCliente;
	private String apellidoCliente;
	private String documento;
	private String correoCliente;
	private String telefono;
	private String fechaReserva;
	private String horaReserva;
	private int cantidadPersonas;
	private String observacion;
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="idLocal", insertable = false, updatable = false)
	private Local objLocal;
	
	public Local getObjLocal() {
		return objLocal;
	}

	public void setObjLocal(Local objLocal) {
		this.objLocal = objLocal;
	}	

	public Reserva(int idReserva, int idLocal, String nombreCliente, String apellidoCliente, String documento,
			String correoCliente, String telefono, String fechaReserva, String horaReserva, int cantidadPersonas,
			String observacion, int estado) {
		super();
		this.idReserva = idReserva;
		this.idLocal = idLocal;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.documento = documento;
		this.correoCliente = correoCliente;
		this.telefono = telefono;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
		this.cantidadPersonas = cantidadPersonas;
		this.observacion = observacion;
		this.estado = estado;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(String horaReserva) {
		this.horaReserva = horaReserva;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", idLocal=" + idLocal + ", nombreCliente=" + nombreCliente
				+ ", apellidoCliente=" + apellidoCliente + ", documento=" + documento + ", correoCliente="
				+ correoCliente + ", telefono=" + telefono + ", fechaReserva=" + fechaReserva + ", horaReserva="
				+ horaReserva + ", cantidadPersonas=" + cantidadPersonas + ", observacion=" + observacion + ", estado="
				+ estado + ", objLocal=" + objLocal + "]";
	}
	
}