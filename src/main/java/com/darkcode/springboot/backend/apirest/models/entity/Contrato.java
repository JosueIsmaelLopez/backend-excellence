package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.darkcode.springboot.backend.apirest.models.entity.composite.ContratoId;

@Entity
@Table(name = "contratos")
public class Contrato implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ContratoId contratoId;
	
	private Date fechaContrato;
	
	//Getters and Setters
	public ContratoId getContratoId() {
		return contratoId;
	}


	public void setContratoId(ContratoId contratoId) {
		this.contratoId = contratoId;
	}


	public Date getFechaContrato() {
		return fechaContrato;
	}


	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}


	public Contrato() {}

}
