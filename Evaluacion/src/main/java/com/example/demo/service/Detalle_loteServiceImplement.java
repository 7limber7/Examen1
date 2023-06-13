package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Detalle_lote;
import com.example.demo.repository.Detalle_loteRepository;
@Service
public class Detalle_loteServiceImplement implements Detalle_loteService{
	@Autowired
	Detalle_loteRepository  e;

	@Override
	public Detalle_lote registrar(Detalle_lote detalle_lote) {
		// TODO Auto-generated method stub
		return e.save(detalle_lote);
	}

	@Override
	public Detalle_lote actulizar(Detalle_lote detalle_lote) {
		// TODO Auto-generated method stub
		return e.save(detalle_lote);
	}

	@Override
	public void eliminar(Detalle_lote detalle_lote) {
		// TODO Auto-generated method stub
		e.delete(detalle_lote);
	}

	@Override
	public List<Detalle_lote> ver() {
		// TODO Auto-generated method stub
		return e.findAll();
	}

}
