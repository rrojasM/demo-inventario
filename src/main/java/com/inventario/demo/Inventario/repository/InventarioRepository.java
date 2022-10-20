package com.inventario.demo.Inventario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.inventario.demo.Inventario.model.Inventario;

public interface InventarioRepository extends MongoRepository<Inventario, Integer> {

}
