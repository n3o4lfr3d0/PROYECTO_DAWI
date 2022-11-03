package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.saborcriollo.model.Cliente;
import com.saborcriollo.repository.IClienteRepository;

@Controller
public class PedidoController {

	// llama al repository de Clientes
	@Autowired
	private IClienteRepository recliente;
	
	/*@Autowired
	private IMetodoPagoRepository remetodo;*/
	
	@GetMapping("/clientes/cargar")
	public String abrirPagCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		model.addAttribute("lstClientes", recliente.findAll()); // select * from...
		// enviar listado clientes
		return "crudclientes";
	}
	
	@GetMapping("/clientes/listado")
	public String listadoDeClientes(Model model) {
		// obtener un listado de los clientes y enviar a la página listado
		model.addAttribute("lstClientes", recliente.findAll());
		return "listado";
	}
	
	/*@PostMapping("/clientes/editar")
	public String cargarCliente(@ModelAttribute Cliente cl, Model model) {
		// lee el obj c de Cliente enviado desde el listado
		// obtiene el contenido del Cliente y lo envía a la página
		model.addAttribute("cliente", recliente.findById(cl.getIdCliente()));
		
		model.addAttribute("lstClientes", recliente.findAll()); 
		// enviar listado clientes
		return "crudclientes";
	}*/
	
	@PostMapping("/clientes/grabar")
	public String leerPagCliente(@ModelAttribute Cliente cliente, 
				  Model model) {
		System.out.println(cliente);
		// grabar en la tabla
		
		try {
			recliente.save(cliente); 
			model.addAttribute("mensaje", "Cliente agregado");
			model.addAttribute("clasemensaje", "alert alert-success");
		} catch (Exception e) {
			model.addAttribute("mensaje", "Error al registrar Cliente");
			model.addAttribute("clasemensaje", "alert alert-danger");
		}
		
		model.addAttribute("lstCategorias", recliente.findAll()); // select * from...
		// enviar listado clientes
		return "crudclientes";
	}
}
