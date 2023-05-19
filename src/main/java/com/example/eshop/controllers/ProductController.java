package com.example.eshop.controllers;

import com.example.eshop.requests.CreateProductRequest;
import com.example.eshop.services.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// CRUD

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ResponseEntity<?> create(@RequestBody CreateProductRequest productRequest) {
        try {
            var newProduct = this.productService.create(productRequest);

            return ResponseEntity
                    .ok()
                    .body(new Product(newProduct.getId(), newProduct.getName()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
