package com.saborcriollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoController {
	
	// Método get -> url o href
		@GetMapping("/")
		public String cargarPrincipal() {
			return "principal";
		}
}
