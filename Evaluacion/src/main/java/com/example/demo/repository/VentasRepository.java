package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Ventas;

public interface VentasRepository  extends JpaRepository<Ventas, String>{

}
