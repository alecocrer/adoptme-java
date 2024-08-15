package com.adoptme.petshop.services;

import com.adoptme.petshop.entities.Carts;
import com.adoptme.petshop.repositories.CartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartsService {

    @Autowired private CartsRepository repository;

    public Carts save(Carts carts) {
        return repository.save(carts);
    }

    public List<Carts> readAll() {
        return repository.findAll();
    }

    public Optional<Carts> readOne(Long id) {
        return repository.findById(id);
    }

    public void destroyOne(Long id) {
        repository.deleteById(id);
    }
}
