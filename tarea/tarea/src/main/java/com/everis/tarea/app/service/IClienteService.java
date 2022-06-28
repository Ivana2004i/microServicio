package com.everis.tarea.app.service;

import java.util.List;

import com.everis.tarea.app.domain.Cliente;

public interface IClienteService {
	
	public Cliente guardarCliente (Cliente c);
	public List<Cliente> listarCliente();
	public Cliente updateCliente(Cliente c);
	public void eliminarCliente(Long id);
	public Cliente buscarCliente(Long id);
	
	

}
