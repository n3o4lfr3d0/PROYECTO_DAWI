package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Cliente;

@Repository
public interface IClienteRepository 
		extends JpaRepository<Cliente, String>{
	// crear nuestros métodos --> query methods
	
	// validar si existe un Cliente según id
	// select * from tb... where id = ?
	Cliente findAllById (int idCliente);
}
