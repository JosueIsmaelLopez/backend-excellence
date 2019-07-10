package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mensualidad")
public class Mensualidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private Titular titular;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private Cobrador cobrador;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private PlanPago planPago;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private FormaPago forma;

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pagar", insertable = true, updatable = true, nullable = false)
	private Date FechaPagar;

	@Basic
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pago", insertable = true, updatable = true, nullable = false)
	private Date FechaPago;

	@Column(name = "valor_pagar", insertable = true, updatable = true, nullable = false)
	private float ValorPagar;

	@Column(name = "dias_mora", insertable = true, updatable = true, nullable = true)
	private short diasMora;

	@Column(name = "saldo_pendiente", insertable = true, updatable = true, nullable = true)
	private float saldoPendiente;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Cobrador getCobrador() {
		return cobrador;
	}

	public void setCobrador(Cobrador cobrador) {
		this.cobrador = cobrador;
	}

	public PlanPago getPlanPago() {
		return planPago;
	}

	public void setPlanPago(PlanPago planPago) {
		this.planPago = planPago;
	}

	public FormaPago getForma() {
		return forma;
	}

	public void setForma(FormaPago forma) {
		this.forma = forma;
	}

	public Date getFechaPagar() {
		return FechaPagar;
	}

	public void setFechaPagar(Date fechaPagar) {
		FechaPagar = fechaPagar;
	}

	public Date getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}

	public float getValorPagar() {
		return ValorPagar;
	}

	public void setValorPagar(float valorPagar) {
		ValorPagar = valorPagar;
	}

	public short getDiasMora() {
		return diasMora;
	}

	public void setDiasMora(short diasMora) {
		this.diasMora = diasMora;
	}

	public float getSaldoPendiente() {
		return saldoPendiente;
	}

	public void setSaldoPendiente(float saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}

	public Mensualidad() {
	}

	public Mensualidad(Long id, Titular titular, Cobrador cobrador, PlanPago planPago, FormaPago forma, Date fechaPagar,
			Date fechaPago, float valorPagar, short diasMora, float saldoPendiente) {
		super();
		Id = id;
		this.titular = titular;
		this.cobrador = cobrador;
		this.planPago = planPago;
		this.forma = forma;
		FechaPagar = fechaPagar;
		FechaPago = fechaPago;
		ValorPagar = valorPagar;
		this.diasMora = diasMora;
		this.saldoPendiente = saldoPendiente;
	}
}
