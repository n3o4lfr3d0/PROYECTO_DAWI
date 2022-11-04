package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.saborcriollo.repository.IEmpleadoRepository;

@Controller
public class EmpleadoController {
	
	
	@Autowired
	private IEmpleadoRepository repoE;
	
	@GetMapping("/empleado/lista")
	public String listaEmpleado(Model model) {
		model.addAttribute("lstEmpleados", repoE.findAll());
		return "lista-empleado";
	}
	
	
	
	@PostMapping("/mantemp")
	public String guardarPagina() {
		return "lista-empleado";
	}

}
