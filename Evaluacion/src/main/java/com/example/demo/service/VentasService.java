package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Ventas;

public interface VentasService {

	public Ventas registrar(Ventas ventas );
	public Ventas actulizar(Ventas ventas);
	public void eliminar(Ventas ventas);
	
	public List<Ventas>ver();

}
