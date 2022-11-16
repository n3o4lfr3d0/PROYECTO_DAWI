package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_Ubigeo")
public class Ubigeo {
	@Id
	@NotEmpty(message = "no debe estar vacío")
	private String cod_Ubigeo;
	private String departamento;
	private String provincia;
	private String distrito;
	
	
	public String getCod_Ubigeo() {
		return cod_Ubigeo;
	}
	public void setCod_Ubigeo(String cod_Ubigeo) {
		this.cod_Ubigeo = cod_Ubigeo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
	
	
}

