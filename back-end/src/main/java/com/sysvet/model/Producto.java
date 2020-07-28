package com.sysvet.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto", schema = "management")
public class Producto implements Serializable {

	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;
	
	@Column(name = "nombre_producto")
	private String nombre_producto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_vencimiento")
	private Date fecha_vencimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_producto", referencedColumnName = "id_tipo_producto")
	private TipoProducto tipoProdcuto;
	
	//Ver el tema del Stock

	public Producto(Long id_producto, String nombre_producto, String descripcion, Date fecha_vencimiento,
			TipoProducto tipoProdcuto) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion = descripcion;
		this.fecha_vencimiento = fecha_vencimiento;
		this.tipoProdcuto = tipoProdcuto;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public TipoProducto getTipoProdcuto() {
		return tipoProdcuto;
	}

	public void setTipoProdcuto(TipoProducto tipoProdcuto) {
		this.tipoProdcuto = tipoProdcuto;
	}

}
