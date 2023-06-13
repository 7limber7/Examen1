package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Estado_ventas;
import com.example.demo.repository.Estado_ventasRepository;
@Service
public class Estado_ventasServiceImplement implements Estado_ventasService {
	@Autowired
	Estado_ventasRepository g;

	@Override
	public Estado_ventas registrar(Estado_ventas estado_ventas) {
		// TODO Auto-generated method stub
		return g.save(estado_ventas );
	}

	@Override
	public Estado_ventas actulizar(Estado_ventas estado_ventas) {
		// TODO Auto-generated method stub
		return g.save(estado_ventas );
	}

	@Override
	public void eliminar(Estado_ventas estado_ventas) {
		// TODO Auto-generated method stub
		g.delete(estado_ventas);
	}

	@Override
	public List<Estado_ventas> ver() {
		// TODO Auto-generated method stub
		return g.findAll();
	}

	
	
}
