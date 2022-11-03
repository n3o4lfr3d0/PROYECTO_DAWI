package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_DetallePedido")
@Data
public class DetallePedido {
	
	@Id
	private int idDetallePedido;
	private int idPedido;
	private int idProducto;
	private int cantidad;
	private int idPrecio;
	
	public DetallePedido(int idDetallePedido, int idPedido, int idProducto, int cantidad, int idPrecio) {
		super();
		this.idDetallePedido = idDetallePedido;
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.idPrecio = idPrecio;
	}

	public int getIdDetallePedido() {
		return idDetallePedido;
	}

	public void setIdDetallePedido(int idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdPrecio() {
		return idPrecio;
	}

	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}

	@Override
	public String toString() {
		return "DetallePedido [idDetallePedido=" + idDetallePedido + ", idPedido=" + idPedido + ", idProducto="
				+ idProducto + ", cantidad=" + cantidad + ", idPrecio=" + idPrecio + "]";
	}	

}