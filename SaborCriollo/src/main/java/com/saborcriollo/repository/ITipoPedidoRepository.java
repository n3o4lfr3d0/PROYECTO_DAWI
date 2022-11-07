package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.TipoPedido;

@Repository
public interface ITipoPedidoRepository 
		extends JpaRepository<TipoPedido, String>{

}
