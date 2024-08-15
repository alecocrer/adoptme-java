package com.adoptme.petshop.repositories;

import com.adoptme.petshop.entities.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices, Long> {
}
