package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.DetallePedido;

@Repository
public interface IDetallePedidoRepository 
		extends JpaRepository<DetallePedido, String>{

}
