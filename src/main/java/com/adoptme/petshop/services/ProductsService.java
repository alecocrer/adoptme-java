package com.adoptme.petshop.services;

import com.adoptme.petshop.entities.Products;
import com.adoptme.petshop.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired private ProductsRepository repository;

    public Products save(Products products) {
        return repository.save(products);
    }

    public List<Products> readAll() {
        return repository.findAll();
    }

    public Optional<Products> readOne(Long id) {
        return repository.findById(id);
    }

    public void destroyOne(Long id) {
        repository.deleteById(id);
    }
}
