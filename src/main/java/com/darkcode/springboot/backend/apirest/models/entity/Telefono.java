package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "telefono_id")
	private Long Id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id")
	private Cliente cliente;
	
	@Column(name = "telefono", insertable = true, updatable = true, length = 15, nullable = false)
	private String Telefono;
	
	public Telefono() {}

}
