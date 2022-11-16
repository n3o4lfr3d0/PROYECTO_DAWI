package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.saborcriollo.model.Categoria;

@Repository
public interface ICategoriaRepository 
	extends JpaRepository<Categoria, Integer>{

}
