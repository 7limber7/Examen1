package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devoluciones;
import com.example.demo.repository.DevolucionesRepository;
@Service
public class DevolucionesServiceImplement implements DevolucionesService {
	@Autowired
	DevolucionesRepository f;

	@Override
	public Devoluciones registrar(Devoluciones devoluciones) {
		// TODO Auto-generated method stub
		return f.save(devoluciones);
	}

	@Override
	public Devoluciones actulizar(Devoluciones devoluciones) {
		// TODO Auto-generated method stub
		return f.save(devoluciones);
	}

	@Override
	public void elimina(Devoluciones devoluciones) {
		// TODO Auto-generated method stub
		f.delete(devoluciones);
	}

	@Override
	public List<Devoluciones> ver() {
		// TODO Auto-generated method stub
		return f.findAll();
	}

}
