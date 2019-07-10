package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "estrategia")
public class Estrategia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "descripcion", insertable = true, updatable = true, nullable = false)
	@Size(min = 20, max = 35)
	private String Descripcion;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Estrategia() {
	}

	public Estrategia(Long id, @Size(min = 20, max = 35) String descripcion) {
		super();
		Id = id;
		Descripcion = descripcion;
	}

}
