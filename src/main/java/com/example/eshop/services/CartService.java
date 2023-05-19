package com.example.eshop.services;

import com.example.eshop.entities.CartEntity;
import com.example.eshop.repositories.CartRepository;
import com.example.eshop.requests.CreateCartRequest;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {// dotazeni zavislosti v nasem pripade cartrepository
//        // abysme mohli provest ukladani na databazi
        this.cartRepository = cartRepository;
    }

    // ziskat data, ktera nasledne ulozim v databazi - vytvorim tridy (record), ktera bude reprezentovat request data
    // budu potrebovat komunikovat s db - repository
    // Budu vracet neco z metody???
    // ano minimalne id - tady si muzeme dovolit celou entity
    public CartEntity create(CreateCartRequest data) {
        // vytvoreni objektu cart tj. priprava pro ulozeni do db
        var newCart = new CartEntity(data.getName());

        // pokazde kdyz budu vytvaret novy radek v databazi
        // budu vytvaret instanci z entity

        // ulozeni entity do databaze, vraci tu samou entity vcetne primarniho klice
        return this.cartRepository.save(newCart);
    }
}
