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

import com.example.demo.entity.BitExistenciaInicial;
import com.example.demo.service.BitExistenciaInicialService;
@RestController
@RequestMapping("/ojo")
public class BitExistenciaInicialController {
	@Autowired
	 BitExistenciaInicialService y;
	
	@GetMapping
	public List< BitExistenciaInicial>ver(){
		return y.ver();
	}
	@PostMapping
	public  BitExistenciaInicial registrar(@RequestBody  BitExistenciaInicial  bitExistenciaInicial) {
		return y.registrar( bitExistenciaInicial);
		
	}
	@PutMapping
	public  BitExistenciaInicial actualizar(@RequestBody  BitExistenciaInicial  bitExistenciaInicial) {
		return y.actulizar(bitExistenciaInicial);
	}
	@DeleteMapping
	public void eliminar(@RequestBody  BitExistenciaInicial  bitExistenciaInicial) {
		y.eliminar( bitExistenciaInicial);
	}
	 

}
