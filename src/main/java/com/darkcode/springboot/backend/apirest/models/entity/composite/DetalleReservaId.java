package com.darkcode.springboot.backend.apirest.models.entity.composite;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.darkcode.springboot.backend.apirest.models.entity.Alumno;
import com.darkcode.springboot.backend.apirest.models.entity.Nivel;
import com.darkcode.springboot.backend.apirest.models.entity.Unidad;

@Embeddable
public class DetalleReservaId implements Serializable {
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Alumno alumno;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Nivel nivel;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Unidad unidad;
	
	private static final long serialVersionUID = 1L;
}
