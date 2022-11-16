package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.saborcriollo.model.Precio;

@Repository
public interface IPrecioRepository 
	extends JpaRepository<Precio, Integer>{

}
