package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.Local;

@Repository
public interface ILocalRepository extends JpaRepository<Local, Integer>{

}
