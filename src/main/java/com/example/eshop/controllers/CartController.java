package com.example.eshop3.controllers;

import com.example.eshop3.requests.AddCartProductRequest;
import com.example.eshop3.requests.CreateCartRequest;
import com.example.eshop3.services.CartService;
import com.example.eshop3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/carts/{id}")
    public ResponseEntity<Object> create(@RequestBody CreateCartRequest createCartRequest) {
        this.cartService.
    }

    @PostMapping("/carts/products")
    public ResponseEntity<Object> addItem(@RequestBody AddCartProductRequest addCartProductRequest) {

    }
}
