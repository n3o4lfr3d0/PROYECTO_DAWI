package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.saborcriollo.model.Cliente;
import com.saborcriollo.repository.IClienteRepository;
import com.saborcriollo.repository.ITipoDocumentoRepository;
import com.saborcriollo.repository.IUbigeoRepository;

@Controller
public class ClienteController {

	@Autowired
	private ITipoDocumentoRepository repotipdoc;
	
	@Autowired
	private IClienteRepository repocli;
	
	@Autowired
	private IUbigeoRepository repoubigeo;
	
	@GetMapping("/cliente/cargar")
	public String listadoDeClientes(Model model) {
		model.addAttribute("lstClientes", repocli.findAll());
		return "listado";
	}			
}
