package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_Cliente")
public class Cliente {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private int idCliente;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private int idTipoDocumento;
	private String documento;
	private String cod_Ubigeo;
	private String direccion;

	/*public TipoDocumento getobjTipoDocumento() {
		return objTipoDocumento;
	}

	public void setobjTipoDocumento(TipoDocumento objTipoDocumento) {
		this.objTipoDocumento = objTipoDocumento;
	}
	
	public Ubigeo getobjUbigeo() {
		return objUbigeo;
	}

	public void setobjUbigeo(Ubigeo objUbigeo) {
		this.objUbigeo = objUbigeo;
	}
	
	@ManyToOne
	@JoinColumn(name="idTipoDocumento",insertable = false,updatable = false)
	private TipoDocumento objTipoDocumento;
	@JoinColumn(name="cod_Ubigeo",insertable = false,updatable = false)
	private Ubigeo objUbigeo;*/
}
