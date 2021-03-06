package com.sysvet.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "mascota", schema = "data")
public class Mascota implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mascota")
	private Long id_mascota;
	

	@Column(name ="image_perfil")
	private String image_perfil;
	
	@Column(name ="nombre_mascota")
	private String nombre_mascota;
	
	@Column(name = "tatuaje")
	private String tatuaje;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "peso")
	private String peso;
	
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	
	@Column(name = "color_pelaje")
	private String color_pelaje;
	
	@Column(name = "especie")
	private String especie;
	
	@Column(name = "raza")
	private String raza;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	// Completar este metodo
	public Mascota() {}


	public Mascota(Long id_mascota, String image_perfil, String nombre_mascota, String tatuaje, String sexo,
			       String peso, String fecha_nacimiento, String color_pelaje, String especie, String raza, Cliente cliente) {
		this.id_mascota = id_mascota;
		this.image_perfil = image_perfil;
		this.nombre_mascota = nombre_mascota;
		this.tatuaje = tatuaje;
		this.sexo = sexo;
		this.peso = peso;
		this.fecha_nacimiento = fecha_nacimiento;
		this.color_pelaje = color_pelaje;
		this.especie = especie;
		this.raza = raza;
		this.cliente = cliente;
	}


	public Long getId_mascota() {
		return id_mascota;
	}


	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}


	public String getImage_perfil() {
		return image_perfil;
	}


	public void setImage_perfil(String image_perfil) {
		this.image_perfil = image_perfil;
	}


	public String getNombre_mascota() {
		return nombre_mascota;
	}


	public void setNombre_mascota(String nombre_mascota) {
		this.nombre_mascota = nombre_mascota;
	}


	public String getTatuaje() {
		return tatuaje;
	}


	public void setTatuaje(String tatuaje) {
		this.tatuaje = tatuaje;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getColor_pelaje() {
		return color_pelaje;
	}


	public void setColor_pelaje(String color_pelaje) {
		this.color_pelaje = color_pelaje;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
	
	
