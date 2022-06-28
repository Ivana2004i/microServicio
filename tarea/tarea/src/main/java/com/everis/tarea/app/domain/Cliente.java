package com.everis.tarea.app.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name ="tbl_cliente")

public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", length =8)
	private Long idCliente;
	@Column(name = "nommbre_cliente", length =10, nullable = true)
	private String nombre;
	@Column(name = "apellido_cliente", length =10, nullable = true)
	private String apellidos;
	@Column(name = "edad_cliente", length =3, nullable = true)
	private Integer edad;
	@Column(name = "correo_cliente", length =20, unique = true,  nullable = false)
	private String correo;
	@Column(name = "dni_Cliente", length =8, unique = true,  nullable = false)
	@Size(max = 8)
	private Long dni;
	@Column(name ="direccion", length =50,  nullable = true)
	@Size(max = 50)
	private String direccion;
	
	
	
	
}
