package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BitExistenciaInicial;
import com.example.demo.repository.BitExistenciaInicialRepository;

@Service
public class BitExistenciaInicialServiceImplement implements BitExistenciaInicialService{
	@Autowired
	BitExistenciaInicialRepository b;

	@Override
	public BitExistenciaInicial registrar(BitExistenciaInicial bitExistenciaInicial) {
		// TODO Auto-generated method stub
		return b.save(bitExistenciaInicial);
	}

	@Override
	public BitExistenciaInicial actulizar(BitExistenciaInicial bitExistenciaInicial) {
		// TODO Auto-generated method stub
		return b.save(bitExistenciaInicial);
	}

	@Override
	public void eliminar(BitExistenciaInicial bitExistenciaInicial) {
		// TODO Auto-generated method stub
		b.delete(bitExistenciaInicial);
	}

	@Override
	public List<BitExistenciaInicial> ver() {
		// TODO Auto-generated method stub
		return b.findAll();
	}

}