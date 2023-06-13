package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BitExistenciaInicial;

public interface BitExistenciaInicialService {
	
	public BitExistenciaInicial registrar(BitExistenciaInicial bitExistenciaInicial  );
	public BitExistenciaInicial actulizar( BitExistenciaInicial bitExistenciaInicial);
	public void eliminar(BitExistenciaInicial bitExistenciaInicial  );
	
	public List<BitExistenciaInicial>ver();

}
