package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_TipoDocumento")
public class TipoDocumento {
	@Id
	@NotEmpty(message = "no debe estar vacío")
	private int idTipoDocumento;
	private String descripcion;	
}
