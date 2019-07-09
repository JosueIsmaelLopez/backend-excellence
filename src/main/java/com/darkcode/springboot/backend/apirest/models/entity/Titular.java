package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "titulares")
public class Titular implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "salario", insertable = true, updatable = true, nullable = false)
	private float Salario;
	
	@Column(name = "nombreTrabajo", length = 30, insertable = true, updatable = true, nullable = true)
	private String NombreTrabajo;
	
	@Column(name = "direccionTrabajo", length = 200, insertable = true, updatable = true, nullable = true)
	private String DireccionTrabajo;
	
	@Column(name = "telefonoTrabajo", length = 30, insertable = true, updatable = true, nullable = true)
	private String TelefonoTrabajo;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Cliente cliente;

	public Titular() {}

}
