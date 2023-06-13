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

import com.example.demo.entity.Ventas;
import com.example.demo.service.VentasService;
@RestController
@RequestMapping("/ponti")
public class VentasController {
	@Autowired
	VentasService n;
	
	@GetMapping
	public List<Ventas>ver(){
		return n.ver();
	}
	@PostMapping
	public Ventas registrar(@RequestBody Ventas ventas ) {
		return n.registrar(ventas);
		
	}
	@PutMapping
	public Ventas actualizar(@RequestBody Ventas ventas) {
		return n.actulizar(ventas);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Ventas ventas) {
		n.eliminar(ventas);
	}
	

}
