package com.sysvet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario", schema = "data")
public class Usuario implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contrasenha")
	private String contrasenha;
	
	@Column(name = "rol")
	private String rol;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "numero_celular")
	private String numeroCelular;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// Anotacion que hashea el password del usuario
	@JsonIgnore
	public String getContrasenha() {
		return contrasenha;
	}

	// Anotacion que permite 
	// La deserializacion del password
	@JsonProperty
	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	
	
	
	
}
