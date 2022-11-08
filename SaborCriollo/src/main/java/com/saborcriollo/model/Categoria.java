package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_Categoria")
public class Categoria {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private int idCategoria;
	private String nombre;
}
