package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Estado_ventas;

public interface Estado_ventasService {
	
	public  Estado_ventas registrar(Estado_ventas estado_ventas  );
	public Estado_ventas actulizar(Estado_ventas estado_ventas);
	public void eliminar(Estado_ventas estado_ventas); 
	
	public List<Estado_ventas>ver();


}
