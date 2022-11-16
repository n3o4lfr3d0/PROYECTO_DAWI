package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Producto;

@Repository
public interface IProductoRepository 
		extends JpaRepository<Producto, Integer>{

}
