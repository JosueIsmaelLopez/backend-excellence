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
@Table(name = "alumno")
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Cliente cliente;
	
	@Column(name ="nivel", insertable = true, updatable = true, nullable = false)
	private short Nivel;
	
	@Column(name ="activo", insertable = true, updatable = true, nullable = false)
	private boolean activo;
	
	public Alumno() {}

}
