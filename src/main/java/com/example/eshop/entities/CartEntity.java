package com.example.eshop.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity(name="carts") // Oznaceni tridy ze reprezentuje tabulku a name = nazev tabulky v databazi
@Setter
@Getter
//@JsonIgnoreProperties("products")
public class CartEntity {
    @Id() // Oznaceni primarniho klice
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name="cart_id") // dodatecne contrainty nebo informace ke sloupecku
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name="cart_id"))
    private Set<ProductEntity> products; // m:n -> vytvori to vazebni tabulku

    public CartEntity() {}

    public CartEntity(String name) {
        this. name = name;
    }
}