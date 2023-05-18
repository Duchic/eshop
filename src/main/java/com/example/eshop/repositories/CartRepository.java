package com.example.eshop3.repositories;

import com.example.eshop3.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    CartEntity findByName(String name);
}
