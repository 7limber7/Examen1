package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Detalle_compra;
import com.example.demo.repository.Detalle_compraRepository;
@Service
public class Detalle_compraServiceImplement implements Detalle_compraService{
	
	Detalle_compraRepository d;

	@Override
	public Detalle_compra registrar(Detalle_compra detalle_compra) {
		// TODO Auto-generated method stub
		return d.save(detalle_compra);
	}

	@Override
	public Detalle_compra actulizar(Detalle_compra detalle_compra) {
		// TODO Auto-generated method stub
		return d.save(detalle_compra);
	}

	@Override
	public void eliminar(Detalle_compra detalle_compra) {
		// TODO Auto-generated method stub
		d.delete(detalle_compra);
	}

	@Override
	public List<Detalle_compra> ver() {
		// TODO Auto-generated method stub
		return d.findAll();
	}

}
