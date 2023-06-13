package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="bitExistenciaInicial")
@Entity(name="BitExistenciaInicial")
public class BitExistenciaInicial {
	@Id
	String BitExistenciaInicial;
	String producto;
	String lote;
	String cantidad;
	public BitExistenciaInicial(String bitExistenciaInicial, String producto, String lote, String cantidad) {
		super();
		BitExistenciaInicial = bitExistenciaInicial;
		this.producto = producto;
		this.lote = lote;
		this.cantidad = cantidad;
	}
	public String getBitExistenciaInicial() {
		return BitExistenciaInicial;
	}
	public void setBitExistenciaInicial(String bitExistenciaInicial) {
		BitExistenciaInicial = bitExistenciaInicial;
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
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
