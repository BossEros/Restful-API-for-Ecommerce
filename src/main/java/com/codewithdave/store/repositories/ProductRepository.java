package com.codewithdave.store.repositories;

import com.codewithdave.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByCategoryId(Byte categoryID);
}