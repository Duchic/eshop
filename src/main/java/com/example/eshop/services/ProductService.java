package com.example.eshop.services;

import com.example.eshop.entities.ProductEntity;
import com.example.eshop.repositories.ProductRepository;
import com.example.eshop.requests.CreateProductRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductEntity create(CreateProductRequest data) {
        var product = new ProductEntity(data.getName());
        return this.productRepository.save(product);
    }
}
