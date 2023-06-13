package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ventas;
import com.example.demo.repository.VentasRepository;
@Service
public class VentasServiceImplement implements VentasService{
	@Autowired
	VentasRepository j;

	@Override
	public Ventas registrar(Ventas ventas) {
		// TODO Auto-generated method stub
		return j.save(ventas);
	}

	@Override
	public Ventas actulizar(Ventas ventas) {
		// TODO Auto-generated method stub
		return j.save(ventas);
	}

	@Override
	public void eliminar(Ventas ventas) {
		// TODO Auto-generated method stub
		j.delete(ventas);
	}

	@Override
	public List<Ventas> ver() {
		// TODO Auto-generated method stub
		return j.findAll();
	}

}
