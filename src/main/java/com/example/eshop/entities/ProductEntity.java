package com.example.eshop.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity(name="products")
@Getter
public class ProductEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    public ProductEntity() {}

    public ProductEntity(String name) {
        this.name = name;
    }

    public ProductEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
