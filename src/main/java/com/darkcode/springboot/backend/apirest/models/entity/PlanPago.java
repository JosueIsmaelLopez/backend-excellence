package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plan")
public class PlanPago implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "valorTotal",insertable = true, updatable = true,nullable = false)
	private float ValorTotal;
	
	@Column(name = "inscripcion",insertable = true, updatable = true,nullable = true)
	private float Inscripcion;
	
	@Column(name = "costoMensual",insertable = true, updatable = true,nullable = true)
	private float CostoMensual;
	
	@Column(name = "cantidadMeses",insertable = true, updatable = true,nullable = true)
	private float CantidadMeses;
	
	
	
	public PlanPago() {}

}
