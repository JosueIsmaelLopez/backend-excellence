package com.darkcode.springboot.backend.apirest.models.entity.composite;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.darkcode.springboot.backend.apirest.models.entity.Alumno;
import com.darkcode.springboot.backend.apirest.models.entity.Asesor;
import com.darkcode.springboot.backend.apirest.models.entity.Titular;

@Embeddable
public class ContratoId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Asesor asesor;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Titular titular;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Alumno alumno;

	public Asesor getAsesor() {
		return asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
}
