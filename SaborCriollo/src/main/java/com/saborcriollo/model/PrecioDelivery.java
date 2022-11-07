package com.saborcriollo.model;

import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_PrecioDelivery")
public class PrecioDelivery {
	@Id
	/*@NotEmpty(message = "no debe estar vacío")*/
	private int idDelivery;
	private String cod_Ubigeo;
	private DecimalFormat Costo;
	
	public Ubigeo getobjUbigeo() {
		return objUbigeo;
	}

	public void setobjUbigeo(Ubigeo objUbigeo) {
		this.objUbigeo = objUbigeo;
	}

	@ManyToOne
	@JoinColumn(name="cod_Ubigeo",insertable = false,updatable = false)
	private Ubigeo objUbigeo;
}
