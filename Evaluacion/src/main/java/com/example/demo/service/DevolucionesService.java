package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Devoluciones;

public interface DevolucionesService {
	
	public Devoluciones registrar (Devoluciones devoluciones);
	public Devoluciones actulizar (Devoluciones devoluciones);
	public void elimina (Devoluciones devoluciones);
	
	public List<Devoluciones>ver();

}
