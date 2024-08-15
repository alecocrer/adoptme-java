package com.adoptme.petshop.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Table(name = "invoces")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class Invoices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @Getter @Setter private Products product;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    @Getter @Setter private Carts cart;

}
