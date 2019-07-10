package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "referencia")
public class Referencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Persona persona;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Titular titular;

	@Column(name = "telefono", length = 20, insertable = true, updatable = true)
	private String Telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Referencia() {
	}

	public Referencia(Long id, Persona persona, Titular titular, String telefono) {
		super();
		this.id = id;
		this.persona = persona;
		this.titular = titular;
		Telefono = telefono;
	}

}
