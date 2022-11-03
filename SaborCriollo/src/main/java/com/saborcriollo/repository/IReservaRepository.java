package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Reserva;

@Repository
public interface IReservaRepository 
		extends JpaRepository<Reserva, String>{
	
}
