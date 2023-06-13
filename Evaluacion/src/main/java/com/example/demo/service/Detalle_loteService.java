package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Detalle_lote;

public interface Detalle_loteService {
	
	public Detalle_lote registrar(Detalle_lote detalle_lote );
	public Detalle_lote actulizar(Detalle_lote detalle_lote);
	public void eliminar(Detalle_lote detalle_lote );
	
	public List<Detalle_lote>ver();

}
