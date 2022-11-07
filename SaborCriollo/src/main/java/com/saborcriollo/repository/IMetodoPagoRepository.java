package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.MetodoPago;

@Repository
public interface IMetodoPagoRepository 
		extends JpaRepository<MetodoPago, String>{

}
