package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ajustes;

public interface AjustesService {
	public Ajustes registrar(Ajustes ajustes );
	public Ajustes actulizar(Ajustes ajustes);
	public void eliminar(Ajustes ajustes );
	
	public List<Ajustes>ver();

}
