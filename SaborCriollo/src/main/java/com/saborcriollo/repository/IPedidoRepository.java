package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Pedido;

@Repository
public interface IPedidoRepository 
		extends JpaRepository<Pedido, String>{

}