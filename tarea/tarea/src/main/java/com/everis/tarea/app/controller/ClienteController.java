package com.everis.tarea.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.tarea.app.domain.Cliente;
import com.everis.tarea.app.repository.IRepositoryCliente;
import com.everis.tarea.app.service.IClienteService;

import lombok.extern.log4j.Log4j2;




@RestController
@RequestMapping("/cliente")
@Log4j2
public class ClienteController {
	
	@Autowired
	public IClienteService clienteService;
	
	@Autowired
	public IRepositoryCliente repo;
	 
	
	@PostMapping("/guardar")
	public ResponseEntity<Object> metodoGuardarCliente(@RequestBody Cliente c) {
		
		Cliente cliente= clienteService.guardarCliente(c);
		
		return new ResponseEntity<>(cliente, HttpStatus.CREATED);
	}
	
	@GetMapping("/listar")
	public List<Cliente> metodoListarCliente() {
		return clienteService.listarCliente();
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Object> metodoActualizarCliente(@RequestBody Cliente c, @PathVariable Long id) {
		
		
		Optional<Cliente> estudiante = repo.findById(id);
		
		if(!estudiante.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		//a.setIdCliente(id);
		
		clienteService.updateCliente(c);
		
		return ResponseEntity.accepted().build();
	}
	@DeleteMapping("/eliminar/{id}")
	public void metodoEliminarAlumno( @PathVariable Long id) {
		
		
		
		clienteService.eliminarCliente(id);
		System.out.println("EL CLIENTE" + id + " fue eliminado");
		log.info("EL CLIENTE A TRAVES DE LOG " + id + "fue eliminado");

	}

	@GetMapping("/buscar")
	public Cliente metodoBuscarCliente(@RequestParam Long id) {

		System.out.println("Se obtuvo el" + id);
		log.info("EL CLIENTE A TRAVES DE LOG ");
		return clienteService.buscarCliente(id);

	}


}
