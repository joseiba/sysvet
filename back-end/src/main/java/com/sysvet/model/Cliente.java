/**
 * 
 */
package com.sysvet.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "cliente", schema = "data")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id_cliente;
	
	
	@Column(name = "ci_cliente")
	private String cedula;
	
	@Column(name ="nombre_cliente")
	private String nombre_cliente;
	
	@Column(name = "apellido_cliente")
	private String apellido_cliente;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ruc")
	private String ruc;
	
	@Column(name = "telefono")
	private String celular;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	public Cliente() {}
	
	// metodo que regresa un tipo de cliente
	public Cliente(Long id_cliente, String cedula, String nombre_cliente, String apellido_cliente, String direccion,
			String ruc, String celular, String email, String ciudad) {
		super();
		this.id_cliente = id_cliente;
		this.cedula = cedula;
		this.nombre_cliente = nombre_cliente;
		this.apellido_cliente = apellido_cliente;
		this.direccion = direccion;
		this.ruc = ruc;
		this.celular = celular;
		this.email = email;
		this.ciudad = ciudad;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getApellido_cliente() {
		return apellido_cliente;
	}

	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
}
