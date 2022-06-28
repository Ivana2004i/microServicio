package com.everis.tarea.app.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.tarea.app.domain.Cliente;
import com.everis.tarea.app.repository.IRepositoryCliente;
import com.everis.tarea.app.service.IClienteService;

@Service

public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	
	public IRepositoryCliente repo;

	@Override
	public Cliente guardarCliente(Cliente c) {
		 return repo.save(c);
		
	}

	@Override
	public List<Cliente> listarCliente() {
		return repo.findAll();
	}


	@Override
	public Cliente updateCliente(Cliente c) {
		return repo.save(c);
	}

	@Override
	public void eliminarCliente(Long id) {
		 repo.deleteById(id);
		
	}

	@Override
	public Cliente buscarCliente(Long id) {
		
		return repo.findById(id).get();
	}

}
