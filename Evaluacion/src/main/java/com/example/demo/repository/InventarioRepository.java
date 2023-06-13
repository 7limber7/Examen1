package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inventario;

public interface InventarioRepository  extends JpaRepository<Inventario, String>{

}
