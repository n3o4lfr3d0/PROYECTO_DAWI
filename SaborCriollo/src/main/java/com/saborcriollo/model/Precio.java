package com.saborcriollo.model;

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
@Table(name = "tb_Precio")
public class Precio {
	@Id
	@NotEmpty(message = "no debe estar vacío")
	private int idPrecio;
	private int idProducto;
	private int idCategoria;
	private DecimalFormat precioUnitario;
	
	public Producto getobjProducto() {
		return objProducto;
	}

	public void setobjProducto(Producto objProducto) {
		this.objProducto = objProducto;
	}
	
	public Categoria getobjCategoria() {
		return objCategoria;
	}

	public void setobjCategoria(Categoria objCategoria) {
		this.objCategoria = objCategoria;
	}
	
	@ManyToOne
	@JoinColumn(name="idProducto",insertable = false,updatable = false)
	private Producto objProducto;
	@JoinColumn(name="idCategoria",insertable = false,updatable = false)
	private Categoria objCategoria;
}
