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

import com.example.demo.entity.Compras;
import com.example.demo.service.ComprasService;
@RestController
@RequestMapping("/ver")
public class ComprasController {
	@Autowired
	ComprasService x;
	
	@GetMapping
	public List<Compras>ver(){
		return x.ver();
	}
	@PostMapping
	public Compras registrar(@RequestBody Compras compras) {
		return x.registrar(compras);
		
	}
	@PutMapping
	public Compras actualizar(@RequestBody Compras compras) {
		return x.actulizar(compras);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Compras compras) {
		x.eliminar(compras);
	}
	

}
