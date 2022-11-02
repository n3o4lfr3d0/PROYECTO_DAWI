package com.saborcriollo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "tb_TomaPedido")
public class TomaPedido {
	@Id
	public int idPedido;
	public int idEmpleado;
	
	
}
