package com.adoptme.petshop.repositories;

import com.adoptme.petshop.entities.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartsRepository extends JpaRepository<Carts, Long> {
}
