package com.saborcriollo.model;

import java.text.DateFormat;
import java.text.DecimalFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_Pedido")
public class Pedido {
	@Id
	@NotEmpty(message = "no debe estar vacío")
	private int idPedido;
	private int idCliente;
	private int idTipoPedido;
	private DateFormat fechaHoraPedido;
	private DecimalFormat totalPedido;
	private int idMetodoPago;
	private String cod_Ubigeo;
	private String direccionPedido;
	private int estado;

	public Cliente getobjCliente() {
		return objCliente;
	}

	public void setobjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}
	
	public TipoPedido getobjTipoPedido() {
		return objTipoPedido;
	}

	public void setobjPedido(TipoPedido objTipoPedido) {
		this.objTipoPedido = objTipoPedido;
	}
	
	public MetodoPago getobjMetodoPago() {
		return objMetodoPago;
	}

	public void setobjMetodoPago(MetodoPago objMetodoPago) {
		this.objMetodoPago = objMetodoPago;
	}
	
	public Ubigeo getobjUbigeo() {
		return objUbigeo;
	}

	public void setobjUbigeo(Ubigeo objUbigeo) {
		this.objUbigeo = objUbigeo;
	}
	
	@ManyToOne
	@JoinColumn(name="idCliente",insertable = false,updatable = false)
	private Cliente objCliente;
	@JoinColumn(name="idTipoPedido",insertable = false,updatable = false)
	private TipoPedido objTipoPedido;
	@JoinColumn(name="idMetodoPago",insertable = false,updatable = false)
	private MetodoPago objMetodoPago;
	@JoinColumn(name="cod_Ubigeo",insertable = false,updatable = false)
	private Ubigeo objUbigeo;
}

