package com.example.eshop.controllers;

import com.example.eshop.requests.CreateCartRequest;
import com.example.eshop.services.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController - davam vedet springu at si to zaregistruje do DI
// vracite data ven - json
// na jake url bude poslouchat tato trida - muzete dospecifikovat na PostMapping, GetMapping atd.

// [POST] http://localhost:8080/api/v1/carts

@RestController
@RequestMapping("/api/v1")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Pouzij POST http motodu
    // ResponseEntity - trida ktera se stara o formatovani requestu
    @PostMapping("/carts")
    public ResponseEntity<Object> create(@RequestBody CreateCartRequest cartRequest) { // cartRequest je body object
        var newCart = this.cartService.create(cartRequest); // provolani service a nasledne preposlani requestu + vraceni noveho zaznamu v db

        //                                         // napamuj mi http request body
        // na tridu CreateCartRequest a vrat instanci
        return ResponseEntity.ok().body(newCart); // vrat mi json + 200 http status (ok) a response body (body) bude newCart - json
    }

    @PostMapping("/carts/products")
    public ResponseEntity<Object> addItem() {
        return ResponseEntity.ok().build();
    }
}
