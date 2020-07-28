package com.sysvet.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_producto", schema = "data")
public class TipoProducto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_producto")
	private Long id_tipo_producto;
	
	@Column(name = "nombre_tipo")
	private String nombre_tipo;
	
	@Column(name = "fecha_alta")
	private Date fecha_alta;
	
	@Column(name = "fecha_baja")
	private Date fecha_baja;
	
	public TipoProducto() {}

	public TipoProducto(Long id_tipo_producto, String nombre_tipo, Date fecha_alta, Date fecha_baja) {
		this.id_tipo_producto = id_tipo_producto;
		this.nombre_tipo = nombre_tipo;
		this.fecha_alta = fecha_alta;
		this.fecha_baja = fecha_baja;
	}

	public Long getId_tipo_producto() {
		return id_tipo_producto;
	}

	public void setId_tipo_producto(Long id_tipo_producto) {
		this.id_tipo_producto = id_tipo_producto;
	}

	public String getNombre_tipo() {
		return nombre_tipo;
	}

	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	
}
