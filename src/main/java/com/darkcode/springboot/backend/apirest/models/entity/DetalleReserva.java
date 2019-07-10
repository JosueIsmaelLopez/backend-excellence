package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.darkcode.springboot.backend.apirest.models.entity.composite.DetalleReservaId;

@Entity
@Table(name = "detalle_reserva")
public class DetalleReserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetalleReservaId Id;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Tutor tutor;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Tutoria tutoria;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private Date FechaReserva;
	
	@Basic
	@Temporal(TemporalType.TIME)
	private Date hora;

	@Column(name = "reprogramada", nullable = true, insertable = true, updatable = true)
	private boolean reprogramada;

	@Column(name = "aprobada", nullable = true, insertable = true, updatable = true)
	private boolean aprobada;

	public DetalleReservaId getId() {
		return Id;
	}

	public void setId(DetalleReservaId id) {
		Id = id;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Tutoria getTutoria() {
		return tutoria;
	}

	public void setTutoria(Tutoria tutoria) {
		this.tutoria = tutoria;
	}

	public Date getFechaReserva() {
		return FechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		FechaReserva = fechaReserva;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public boolean isReprogramada() {
		return reprogramada;
	}

	public void setReprogramada(boolean reprogramada) {
		this.reprogramada = reprogramada;
	}

	public boolean isAprobada() {
		return aprobada;
	}

	public void setAprobada(boolean aprobada) {
		this.aprobada = aprobada;
	}

	public DetalleReserva() {}

	public DetalleReserva(DetalleReservaId id, Tutor tutor, Tutoria tutoria, Date fechaReserva, Date hora, boolean reprogramada, boolean aprobada) {
		super();
		Id = id;
		this.tutor = tutor;
		this.tutoria = tutoria;
		FechaReserva = fechaReserva;
		this.hora = hora;
		this.reprogramada = reprogramada;
		this.aprobada = aprobada;
	}

}
