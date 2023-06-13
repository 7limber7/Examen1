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

import com.example.demo.entity.Estado_ventas;
import com.example.demo.service.Estado_ventasService;
@RestController
@RequestMapping("/limber")
public class Estado_ventasController {
	@Autowired
	Estado_ventasService t;
	
	@GetMapping
	public List<Estado_ventas>ver(){
		return t.ver();
	}
	@PostMapping
	public 	Estado_ventas registrar(@RequestBody 	Estado_ventas 	estado_ventas) {
		return t.registrar(estado_ventas);
		
	}
	@PutMapping
	public 	Estado_ventas actualizar(@RequestBody 	Estado_ventas 	estado_ventas) {
		return t.actulizar(estado_ventas);
	}
	@DeleteMapping
	public void eliminar(@RequestBody 	Estado_ventas 	estado_ventas) {
		t.eliminar(estado_ventas);
	}
	
	

}
