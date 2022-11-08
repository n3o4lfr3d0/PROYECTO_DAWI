package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_Producto")
public class Producto {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private int idProducto;
	private String descripcion;
	private int idCategoria;
	private int stock;
	
	public Categoria getobjCategoria() {
		return objCategoria;
	}

	public void setobjCategoria(Categoria objCategoria) {
		this.objCategoria = objCategoria;
	}
	
	@ManyToOne
	@JoinColumn(name="idCategoria",insertable = false,updatable = false)
	private Categoria objCategoria;
}
