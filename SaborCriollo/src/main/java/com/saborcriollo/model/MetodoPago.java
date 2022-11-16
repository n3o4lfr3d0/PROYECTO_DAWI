package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_MetodoPago")
public class MetodoPago {
	@Id
	@NotEmpty(message = "no debe estar vacío")
	private int idMetodoPago;
	private String descripcion;
}
