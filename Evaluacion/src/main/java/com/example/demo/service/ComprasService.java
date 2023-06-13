package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Compras;

public interface ComprasService {
	public Compras registrar(Compras compras );
	public Compras actulizar(Compras compras);
	public void eliminar(Compras compras);
	
	public List <Compras>ver();
	
 

}
