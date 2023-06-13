package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Inventario")
@Table(name="inventario")
public class Inventario {
	@Id
	String producto;
	String nombre;
	String id_presentacion;
	String id_laboratorio;
	String concentracion;
	String existencia_minima;
	String idPrescripcion;
	
	public Inventario() {}

	public Inventario(String producto, String nombre, String id_presentacion, String id_laboratorio,
			String concentracion, String existencia_minima, String idPrescripcion) {
		super();
		this.producto = producto;
		this.nombre = nombre;
		this.id_presentacion = id_presentacion;
		this.id_laboratorio = id_laboratorio;
		this.concentracion = concentracion;
		this.existencia_minima = existencia_minima;
		this.idPrescripcion = idPrescripcion;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId_presentacion() {
		return id_presentacion;
	}

	public void setId_presentacion(String id_presentacion) {
		this.id_presentacion = id_presentacion;
	}

	public String getId_laboratorio() {
		return id_laboratorio;
	}

	public void setId_laboratorio(String id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public String getExistencia_minima() {
		return existencia_minima;
	}

	public void setExistencia_minima(String existencia_minima) {
		this.existencia_minima = existencia_minima;
	}

	public String getIdPrescripcion() {
		return idPrescripcion;
	}

	public void setIdPrescripcion(String idPrescripcion) {
		this.idPrescripcion = idPrescripcion;
	}

	
	

}
