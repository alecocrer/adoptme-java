package com.adoptme.petshop.services;

import com.adoptme.petshop.entities.Invoices;
import com.adoptme.petshop.repositories.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoicesService {

    @Autowired private InvoicesRepository repository;

    public Invoices save(Invoices invoices) {
        return repository.save(invoices);
    }

    public List<Invoices> readAll() {
        return repository.findAll();
    }

    public Optional<Invoices> readOne(Long id) {
        return repository.findById(id);
    }

    public void destroyOne(Long id) {
        repository.deleteById(id);
    }
}
