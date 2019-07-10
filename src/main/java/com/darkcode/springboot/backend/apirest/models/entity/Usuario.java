package com.darkcode.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Empleado empleado;
	
	@Column(name = "username", length = 50, insertable = true, updatable = false, nullable = false)
	private String username;
	
	@Column(name = "password", length = 50, insertable = true, updatable = false, nullable = false)
	private String password;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Usuario() {}

	public Usuario(long id, Empleado empleado, String username, String password) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.username = username;
		this.password = password;
	}
	
}
