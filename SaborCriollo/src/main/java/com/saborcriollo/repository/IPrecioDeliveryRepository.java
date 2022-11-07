package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.PrecioDelivery;

@Repository
public interface IPrecioDeliveryRepository 
		extends JpaRepository<PrecioDelivery, String>{

}
