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
	@Column(name = "ci_cliente")
	private Long cedula;
	
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
	
	@Column(name = "apellido_cliente")
	private String ciudad;
	
	// metodo que regresa un tipo de cliente
	public Cliente(Long cedula, String nombre_cliente, String apellido_cliente) {
		this.cedula = cedula;
		this.nombre_cliente = nombre_cliente;
		this.apellido_cliente = apellido_cliente;
		
	}

	
	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
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
