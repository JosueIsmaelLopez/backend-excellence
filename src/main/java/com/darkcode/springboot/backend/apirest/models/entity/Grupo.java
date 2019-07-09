package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombreGrupo", length = 50, insertable = true, updatable = true, nullable = false)
	private String NombreGrupo;
	
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Organizacion organizacion;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreGrupo() {
		return NombreGrupo;
	}


	public void setNombreGrupo(String nombreGrupo) {
		NombreGrupo = nombreGrupo;
	}


	public Grupo() {}


	public Grupo(Long id, String nombreGrupo) {
		super();
		this.id = id;
		NombreGrupo = nombreGrupo;
	}
	
	
}
