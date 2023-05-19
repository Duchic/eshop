package com.example.eshop.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddCartProductRequest {

    private int productId;

    private int cartId;
}
