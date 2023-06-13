package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="devoluciones")
@Entity(name="Devoluciones")
public class Devoluciones {
	@Id
	String id_compra;
	String id_producto;
	double cantidad;
	double precio_compra;
	String lote;
	
	public Devoluciones() {}

	public Devoluciones(String id_compra, String id_producto, double cantidad, double precio_compra, String lote) {
		super();
		this.id_compra = id_compra;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.lote = lote;
	}

	public String getId_compra() {
		return id_compra;
	}

	public void setId_compra(String id_compra) {
		this.id_compra = id_compra;
	}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	
	

}
