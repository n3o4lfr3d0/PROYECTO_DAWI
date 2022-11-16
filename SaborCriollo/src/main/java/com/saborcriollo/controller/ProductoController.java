package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.saborcriollo.repository.ICategoriaRepository;
import com.saborcriollo.repository.IProductoRepository;

@Controller
public class ProductoController {
	
	@Autowired
	private ICategoriaRepository repocate;
	
	@Autowired
	private IProductoRepository repoprod;
}
