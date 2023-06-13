package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Ventas")
@Table(name="ventas")
public class Ventas {
	@Id
	String ventas;
	String id_producto;
	String estado;
	String  lote;
	double cantidad ;
	 double precio;
	 double descuento;
	 String total_importe;
	 String fecha;
	 String hora;
	 String id_empleado;
	 
	 public Ventas() {}

	public Ventas(String ventas, String id_producto, String estado, String lote, double cantidad, double precio,
			double descuento, String total_importe, String fecha, String hora, String id_empleado) {
		super();
		this.ventas = ventas;
		this.id_producto = id_producto;
		this.estado = estado;
		this.lote = lote;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descuento = descuento;
		this.total_importe = total_importe;
		this.fecha = fecha;
		this.hora = hora;
		this.id_empleado = id_empleado;
	}

	public String getVentas() {
		return ventas;
	}

	public void setVentas(String ventas) {
		this.ventas = ventas;
	}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getTotal_importe() {
		return total_importe;
	}

	public void setTotal_importe(String total_importe) {
		this.total_importe = total_importe;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}

	
}
