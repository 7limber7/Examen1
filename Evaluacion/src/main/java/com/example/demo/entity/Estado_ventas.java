package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="estado_ventas")
@Entity(name="Estado_ventas")
public class Estado_ventas {
	@Id
	 String estado_ventas;
	 String descripcion;
	public Estado_ventas(String estado_ventas, String descripcion) {
		super();
		this.estado_ventas = estado_ventas;
		this.descripcion = descripcion;
	}
	public String getEstado_ventas() {
		return estado_ventas;
	}
	public void setEstado_ventas(String estado_ventas) {
		this.estado_ventas = estado_ventas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	 
	 
	 

}
