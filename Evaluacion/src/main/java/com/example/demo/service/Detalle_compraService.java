package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Detalle_compra;

public interface Detalle_compraService {
	
	public Detalle_compra registrar(Detalle_compra detalle_compra  );
	public Detalle_compra actulizar(Detalle_compra  detalle_compra);
	public void eliminar(Detalle_compra detalle_compra );
	
	public List<Detalle_compra>ver();

}
