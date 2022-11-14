package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Cargo;


@Repository
public interface ICargoRepository extends JpaRepository<Cargo, Integer>{

}
