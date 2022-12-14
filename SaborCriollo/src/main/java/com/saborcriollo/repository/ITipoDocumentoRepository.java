package com.saborcriollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborcriollo.model.TipoDocumento;

@Repository
public interface ITipoDocumentoRepository 
		extends JpaRepository<TipoDocumento, String>{

}
