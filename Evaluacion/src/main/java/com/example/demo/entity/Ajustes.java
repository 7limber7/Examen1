package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Ajustes")
@Table(name="ajustes")
public class Ajustes {
	@Id
	String id;
	String producto;
	String motivo;
	int cantidad;
	String fecha;
	String tipo;
	String lote;
	
		public Ajustes() {}

		public Ajustes(String id, String producto, String motivo, int cantidad, String fecha, String tipo,
				String lote) {
			super();
			this.id = id;
			this.producto = producto;
			this.motivo = motivo;
			this.cantidad = cantidad;
			this.fecha = fecha;
			this.tipo = tipo;
			this.lote = lote;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProducto() {
			return producto;
		}

		public void setProducto(String producto) {
			this.producto = producto;
		}

		public String getMotivo() {
			return motivo;
		}

		public void setMotivo(String motivo) {
			this.motivo = motivo;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getLote() {
			return lote;
		}

		public void setLote(String lote) {
			this.lote = lote;
		}

		
}
