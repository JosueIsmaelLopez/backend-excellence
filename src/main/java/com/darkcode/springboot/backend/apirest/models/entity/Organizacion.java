package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizaciones")
public class Organizacion implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombreOrganizacion", length = 50, insertable = true, updatable = true, nullable = false)
	private String NombreOrganizacion;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreOrganizacion() {
		return NombreOrganizacion;
	}


	public void setNombreOrganizacion(String nombreOrganizacion) {
		NombreOrganizacion = nombreOrganizacion;
	}


	public Organizacion() {}


	public Organizacion(Long id, String nombreOrganizacion) {
		super();
		this.id = id;
		NombreOrganizacion = nombreOrganizacion;
	}
	
	
}
