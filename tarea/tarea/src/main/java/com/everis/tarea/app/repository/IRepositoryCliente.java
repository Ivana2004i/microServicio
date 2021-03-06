package com.everis.tarea.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.tarea.app.domain.Cliente;

@Repository
public interface IRepositoryCliente extends JpaRepository <Cliente, Long>{

	
}
