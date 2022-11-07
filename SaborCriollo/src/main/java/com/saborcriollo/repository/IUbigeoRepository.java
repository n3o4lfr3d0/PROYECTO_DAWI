package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Ubigeo;

@Repository
public interface IUbigeoRepository 
		extends JpaRepository<Ubigeo, String>{

}
