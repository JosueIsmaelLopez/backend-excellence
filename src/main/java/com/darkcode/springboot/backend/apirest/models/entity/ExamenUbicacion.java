package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class ExamenUbicacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Alumno alumno;

	@Column(name = "nivel_examen", insertable = true, updatable = true, nullable = false)
	private short nivelExamen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public short getNivelExamen() {
		return nivelExamen;
	}

	public void setNivelExamen(short nivelExamen) {
		this.nivelExamen = nivelExamen;
	}

	public ExamenUbicacion() {
	}

	public ExamenUbicacion(Long id, Alumno alumno, short nivelExamen) {
		super();
		this.id = id;
		this.alumno = alumno;
		this.nivelExamen = nivelExamen;
	}

}
