package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_empleado")
public class Empleado {
	@Id
	public int idEmpleado;
	public String nombre;
	public String apellido;
	public String correo;
	public String telefono;
	public int idTipoDocumento;
	public String documento;
	public int idCargo;
	public String cod_Ubigeo;
	public String direccion;
	public int idLocal;

}

