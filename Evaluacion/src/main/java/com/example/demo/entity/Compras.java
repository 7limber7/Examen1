package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="compras")
@Entity(name="Compras")
public class Compras {
	@Id
	String compra;
	String id_proveedor;
	String no_factura;
	String fecha;
	
	public Compras() {}

	public Compras(String compra, String id_proveedor, String no_factura, String fecha) {
		super();
		this.compra = compra;
		this.id_proveedor = id_proveedor;
		this.no_factura = no_factura;
		this.fecha = fecha;
	}

	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	public String getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getNo_factura() {
		return no_factura;
	}

	public void setNo_factura(String no_factura) {
		this.no_factura = no_factura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

}
