package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Lotes;

public interface LotesService {
	public Lotes registrar(Lotes lotes );
	public Lotes actulizar(Lotes lotes);
	public void eliminar(Lotes lotes );
	
	public List<Lotes>ver();


}
