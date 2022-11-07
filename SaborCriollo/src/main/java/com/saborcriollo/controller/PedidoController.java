package com.saborcriollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.saborcriollo.model.Pedido;
import com.saborcriollo.repository.IClienteRepository;
import com.saborcriollo.repository.IMetodoPagoRepository;
import com.saborcriollo.repository.IPedidoRepository;
import com.saborcriollo.repository.ITipoPedidoRepository;
import com.saborcriollo.repository.IUbigeoRepository;

@Controller
public class PedidoController {

	@Autowired
	private IClienteRepository repocli;
	
	@Autowired
	private ITipoPedidoRepository repotipope;
	
	@Autowired
	private IMetodoPagoRepository remetodo;
	
	@Autowired
	private IUbigeoRepository repoubigeo;
	
	@Autowired
	private IPedidoRepository repopedi;
	
	@GetMapping("/pedido/cargar")
	public String abrirPagPedido(Model model) {
		model.addAttribute("pedido", new Pedido());
		model.addAttribute("lstPedidos", repopedi.findAll());
		return "crudpedidos";
	}
	
	@GetMapping("/pedido/listado")
	public String listadoDeClientes(Model model) {
		model.addAttribute("lstPedidos", repopedi.findAll());
		return "listado";
	}
	
	/*@PostMapping("/pedido/editar")
	public String cargarPedido(@ModelAttribute Pedido p, Model model) {
		model.addAttribute("pedido", repopedi.findById(p.getIdPedido()));
		
		model.addAttribute("lstTipoPedidos", repotipope.findAll());
		return "crudpedidos";
	}*/
	
	@PostMapping("/pedido/grabar")
	public String leerPagPedido(@ModelAttribute Pedido pedido, 
				  Model model) {
		System.out.println(pedido);
		
		try {
			repopedi.save(pedido); 
			model.addAttribute("mensaje", "Pedido agregado");
			model.addAttribute("clasemensaje", "alert alert-success");
		} catch (Exception e) {
			model.addAttribute("mensaje", "Error al registrar Pedido");
			model.addAttribute("clasemensaje", "alert alert-danger");
		}
		
		model.addAttribute("lstPedidos", repopedi.findAll());
		return "crudpedidos";
	}
}
