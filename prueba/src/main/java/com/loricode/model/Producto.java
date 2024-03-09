package com.loricode.model;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="producto")
public class Producto {

	@Id
	@Column(length = 36)
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy="org.hibernate.id.UUIDGenerator")
	private String id;
	
	@Column(name="nombre", length = 180)
	private String nombre;
	
	@Column(name="fec_registro", unique = true)
	private String fec_registro;
	
	public Producto() {
		
	}

	public Producto(String id, String nombre, String fec_registro, String cursor, String codigo, String mensaje) {
		this.id = id;
		this.nombre = nombre;
		this.fec_registro = fec_registro;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFec_registro() {
		return fec_registro;
	}

	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}

	public void setId(String id) {
		this.id = id;
	}

}
