package com.adoptme.petshop.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Table(name = "products")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private Integer price;
    @Getter @Setter private Integer stock;

    @ManyToMany(mappedBy = "products")
    @Getter @Setter private List<Carts> carts;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Getter @Setter private List<Invoices> invoices;
}