package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ajustes;
import com.example.demo.repository.AjustesRepository;
@Service
public class AjustesServiceImplement implements AjustesService{
	@Autowired
	AjustesRepository a;

	@Override
	public Ajustes registrar(Ajustes ajustes) {
		// TODO Auto-generated method stub
		return a.save(ajustes);
	}

	@Override
	public Ajustes actulizar(Ajustes ajustes) {
		// TODO Auto-generated method stub
		return a.save(ajustes);
	}

	@Override
	public void eliminar(Ajustes ajustes) {
		// TODO Auto-generated method stub
		a.delete(ajustes);
	}

	@Override
	public List<Ajustes> ver() {
		// TODO Auto-generated method stub
		return a.findAll();
	}

}
