package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="detalle_compra")
@Entity(name="Detalle_compra")
public class Detalle_compra {
	@Id
	String id_compra;
	String id_producto;
	String cantidad;
	String precio_compra;
	String lote;
	 public Detalle_compra() {}
	public Detalle_compra(String id_compra, String id_producto, String cantidad, String precio_compra, String lote) {
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
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	 
	

}
