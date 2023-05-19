package com.example.eshop.repositories;

import com.example.eshop.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository - vice interface dohromady - strankovani, crud, pagination

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    CartEntity findByName(String name);
}
