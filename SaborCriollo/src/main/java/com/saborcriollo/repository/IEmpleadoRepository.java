package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Empleado;

@Repository
public interface IEmpleadoRepository 
	extends JpaRepository<Empleado, Integer> {
	

}
