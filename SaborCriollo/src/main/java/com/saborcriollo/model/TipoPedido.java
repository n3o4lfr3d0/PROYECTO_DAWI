package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_TipoPedido")
public class TipoPedido {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private int idTipoPedido;
	private String descripcion;
	private int idDelivery;
	
	public PrecioDelivery getobjPrecioDelivery() {
		return objPrecioDelivery;
	}

	public void setobjPrecioDelivery(PrecioDelivery objPrecioDelivery) {
		this.objPrecioDelivery = objPrecioDelivery;
	}
	
	@ManyToOne
	@JoinColumn(name="idDelivery",insertable = false,updatable = false)
	private PrecioDelivery objPrecioDelivery;
}
