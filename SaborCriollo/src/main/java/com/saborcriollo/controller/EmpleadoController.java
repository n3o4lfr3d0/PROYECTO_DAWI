package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saborcriollo.repository.ICargoRepository;
import com.saborcriollo.repository.IEmpleadoRepository;
import com.saborcriollo.repository.ILocalRepository;
import com.saborcriollo.repository.ITipoDocumentoRepository;
import com.saborcriollo.repository.IUbigeoRepository;
import com.saborcriollo.model.Empleado;



@RequestMapping
@Controller
public class EmpleadoController {
	
	
	@Autowired
	private ILocalRepository repoL;
	
	@Autowired
	private IUbigeoRepository repoUbi;
	
	@Autowired
	private ICargoRepository repoC;
	
	@Autowired
	private ITipoDocumentoRepository repoTD;
	
	@Autowired
	private IEmpleadoRepository repoE;
	
	@GetMapping("/empleado/lista")
	public String listaEmpleado(Model model) {
		model.addAttribute("lstEmpleados", repoE.findAll());
		return "lista-empleado";
	}
	
	
	
	@PostMapping("/empleado/editar/{idEmpleado}")
	public String editarPagina(@PathVariable int idEmpleado,@ModelAttribute Empleado e, Model model) {
		model.addAttribute("Empleado", repoE.findById(idEmpleado));
		model.addAttribute("lstDocumento", repoTD.findAll());
		model.addAttribute("lstCargo", repoC.findAll());
		model.addAttribute("lstUbigeo", repoUbi.findAll());
		model.addAttribute("lstLocal", repoL.findAll());
		return "mantenimiento-empleado";
	}
	
	@GetMapping("/empleado/agregar")
	public String nuevoRegistro(Model model) {
		model.addAttribute("Empleado", new Empleado());
		model.addAttribute("lstDocumento", repoTD.findAll());
		model.addAttribute("lstCargo", repoC.findAll());
		model.addAttribute("lstUbigeo", repoUbi.findAll());
		model.addAttribute("lstLocal", repoL.findAll());
		return "mantenimiento-empleado";
	}
	
	
	@GetMapping("/empleado/eliminar/{idEmpleado}")
	public String eliminarRegistro(Model model, @PathVariable int idEmpleado) {
		repoE.deleteById(idEmpleado);
		return "redirect:/empleado/lista";
	}
	
	@PostMapping("/empleado/grabar")
	public String grabarPagina(@ModelAttribute Empleado e,Model model) {
		String respuesta ="No registro";
		Empleado obje= repoE.save(e); 
		if(!obje.equals(null)) {
			respuesta = "registro ok";
		}
		model.addAttribute("lstEmpleados", repoE.findAll());
		model.addAttribute("Mensaje", respuesta);
		return "redirect:/empleado/lista";
	}
	

}
