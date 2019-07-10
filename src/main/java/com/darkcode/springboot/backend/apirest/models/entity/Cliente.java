package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "direccion", length = 200, insertable = true, updatable = true, nullable = true)
	private String Direccion;
	
	@Column(name = "cedula", length = 200, insertable = true, updatable = true, nullable = true)
	private String Cedula;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Persona persona;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Telefono> telefono;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getCedula() {
		return Cedula;
	}


	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	

	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	//Constructor
	public Cliente() {}

}
