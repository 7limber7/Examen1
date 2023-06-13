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

import com.example.demo.entity.Ajustes;
import com.example.demo.service.AjustesService;
@RestController
@RequestMapping("/ruta")
public class AjustesController {
	@Autowired
	AjustesService ñ;
	
	@GetMapping
	public List<Ajustes>ver(){
		return ñ.ver();
	}
	@PostMapping
	public Ajustes registrar(@RequestBody Ajustes ajustes) {
		return ñ.registrar(ajustes);
		
	}
	@PutMapping
	public Ajustes actualizar(@RequestBody Ajustes ajustes) {
		return ñ.actulizar(ajustes);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Ajustes ajustes) {
		ñ.eliminar(ajustes);
	}
	

}
