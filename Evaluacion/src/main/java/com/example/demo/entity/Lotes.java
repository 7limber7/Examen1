package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="lotes")
@Entity(name="Lotes")
public class Lotes {
	@Id
	String lote;
	String _fecha_vencimiento;
	
	public Lotes() {}

	public Lotes(String lote, String _fecha_vencimiento) {
		super();
		this.lote = lote;
		this._fecha_vencimiento = _fecha_vencimiento;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String get_fecha_vencimiento() {
		return _fecha_vencimiento;
	}

	public void set_fecha_vencimiento(String _fecha_vencimiento) {
		this._fecha_vencimiento = _fecha_vencimiento;
	}
	
	

}
