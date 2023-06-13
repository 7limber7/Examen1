package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Inventario;



public interface InventarioService {
	public Inventario registrar(Inventario inventario );
	public Inventario actulizar(Inventario inventario);
	public void eliminar(Inventario inventario );
	
	public List<Inventario>ver();

}
