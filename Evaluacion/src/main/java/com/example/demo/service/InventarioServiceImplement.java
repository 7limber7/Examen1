package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inventario;
import com.example.demo.repository.InventarioRepository;
@Service
public class InventarioServiceImplement implements InventarioService {
	@Autowired
	InventarioRepository h;

	@Override
	public Inventario registrar(Inventario inventario) {
		// TODO Auto-generated method stub
		return h.save(inventario);
	}

	@Override
	public Inventario actulizar(Inventario inventario) {
		// TODO Auto-generated method stub
		return h.save(inventario);
	}

	@Override
	public void eliminar(Inventario inventario) {
		// TODO Auto-generated method stub
		h.delete(inventario);
	}

	@Override
	public List<Inventario> ver() {
		// TODO Auto-generated method stub
		return h.findAll();
	}

}
