package com.saborcriollo.model;

import java.text.DateFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table (name ="tb_Local")
public class Local {
	
	@Id
	public int idLocal;
	public String nombre;
	public String cod_Ubigeo;
	public String direccion;
	public String telefono;
	public DateFormat horarioAtencion;
	
	
	
	public int getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCod_Ubigeo() {
		return cod_Ubigeo;
	}
	public void setCod_Ubigeo(String cod_Ubigeo) {
		this.cod_Ubigeo = cod_Ubigeo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public DateFormat getHorarioAtencion() {
		return horarioAtencion;
	}
	public void setHorarioAtencion(DateFormat horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}
	
	
	
	
	

}
