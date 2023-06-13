package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Detalle_lote")
@Table(name="detalle_lote")
public class Detalle_lote {
	 @Id
	 String producto;
	 String lote;
	String fechaIngreso;
	String cantidad;
	String precio_compra;
	String porcentaje_Ganancia;
	String porcentaje_Descuento;
	String precio_venta;
	
	
	public Detalle_lote () {}


	public Detalle_lote(String producto, String lote, String fechaIngreso, String cantidad, String precio_compra,
			String porcentaje_Ganancia, String porcentaje_Descuento, String precio_venta) {
		super();
		this.producto = producto;
		this.lote = lote;
		this.fechaIngreso = fechaIngreso;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.porcentaje_Ganancia = porcentaje_Ganancia;
		this.porcentaje_Descuento = porcentaje_Descuento;
		this.precio_venta = precio_venta;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		this.lote = lote;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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


	public String getPorcentaje_Ganancia() {
		return porcentaje_Ganancia;
	}


	public void setPorcentaje_Ganancia(String porcentaje_Ganancia) {
		this.porcentaje_Ganancia = porcentaje_Ganancia;
	}


	public String getPorcentaje_Descuento() {
		return porcentaje_Descuento;
	}


	public void setPorcentaje_Descuento(String porcentaje_Descuento) {
		this.porcentaje_Descuento = porcentaje_Descuento;
	}


	public String getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}

	
}
