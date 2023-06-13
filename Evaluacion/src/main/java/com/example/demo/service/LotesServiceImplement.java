package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lotes;
import com.example.demo.repository.LotesRepository;
@Service
public class LotesServiceImplement implements LotesService{
	@Autowired
	LotesRepository i;

	@Override
	public Lotes registrar(Lotes lotes) {
		// TODO Auto-generated method stub
		return i.save(lotes);
	}

	@Override
	public Lotes actulizar(Lotes lotes) {
		// TODO Auto-generated method stub
		return i.save(lotes);
	}

	@Override
	public void eliminar(Lotes lotes) {
		// TODO Auto-generated method stub
		i.delete(lotes);
	}

	@Override
	public List<Lotes> ver() {
		// TODO Auto-generated method stub
		return i.findAll();
	}

}
