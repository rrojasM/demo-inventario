package com.inventario.demo.Inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.demo.Inventario.model.Inventario;
import com.inventario.demo.Inventario.repository.InventarioRepository;

@RestController
@RequestMapping("/api")
public class InventarioController {

	@Autowired
	InventarioRepository inventarioRepo;
	
	@PostMapping("/createInventario")
	public String saveInventario(@RequestBody Inventario inventario) {
		inventarioRepo.save(inventario);
		return "Add Successfully";
	}
	
	@GetMapping("/inventario")
	public List<Inventario> getProducts(){
		return inventarioRepo.findAll();
	}
}
