package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Detalle_lote;
import com.example.demo.service.Detalle_loteService;
@RestController
@RequestMapping("/zea")
public class Detalle_loteController {
	@Autowired
	Detalle_loteService v;
	
	@GetMapping
	public List<Detalle_lote>ver(){
		return v.ver();
	}
	@PostMapping
	public Detalle_lote registrar(@RequestBody Detalle_lote detalle_lote) {
		return v.registrar(detalle_lote);
		
	}
	@PutMapping
	public Detalle_lote actualizar(@RequestBody Detalle_lote detalle_lote) {
		return v.actulizar(detalle_lote);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Detalle_lote detalle_lote) {
		v.eliminar(detalle_lote);
	}

}
