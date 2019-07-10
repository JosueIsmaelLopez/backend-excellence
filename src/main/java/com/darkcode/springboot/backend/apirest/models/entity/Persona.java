package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 2L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre", length = 50, insertable = true, updatable = true, nullable = false)
	private String Nombre;
	@Column(name = "apellido", length = 50, insertable = true, updatable = true, nullable = false)
	private String Apellido;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

}
