package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.saborcriollo.repository.IDetallePedidoRepository;
import com.saborcriollo.repository.IPedidoRepository;
import com.saborcriollo.repository.IPrecioRepository;
import com.saborcriollo.repository.IProductoRepository;

@Controller
public class DetallePedidoController {
	
	@Autowired
	private IPedidoRepository repopedi;
	
	@Autowired
	private IProductoRepository repoprod;
	
	@Autowired
	private IPrecioRepository repopre;
	
	@Autowired
	private IDetallePedidoRepository repodetaped;
}
