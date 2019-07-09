package com.darkcode.springboot.backend.apirest.models.entity.composite;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.darkcode.springboot.backend.apirest.models.entity.Asesor;
import com.darkcode.springboot.backend.apirest.models.entity.Titular;

@Embeddable
public class ContratoId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Asesor asesor;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Titular titular;
	
	/*
	 * private Long titular_id; private Long asesor_id;
	 * 
	 * public Long getTitular_id() { return titular_id; }
	 * 
	 * public void setTitular_id(Long titular_id) { this.titular_id = titular_id; }
	 * 
	 * public Long getAsesor_id() { return asesor_id; }
	 * 
	 * public void setAsesor_id(Long asesor_id) { this.asesor_id = asesor_id; }
	 */

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + nivel; result = prime * result + ((titulo == null)
	 * ? 0 : titulo.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; ContratoId other = (ContratoId) obj; if (nivel != other.nivel) return
	 * false; if (titulo == null) { if (other.titulo != null) return false; } else
	 * if (!titulo.equals(other.titulo)) return false; return true; }
	 */
}
