package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_Ubigeo")
public class Ubigeo {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private String cod_Ubigeo;
	private String departamento;
	private String provincia;
	private String distrito;
}
