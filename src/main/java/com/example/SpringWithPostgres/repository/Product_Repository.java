package com.example.SpringWithPostgres.repository;

import com.example.SpringWithPostgres.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product, Integer> {
    Product findByName(String name);


    Product findByPrice(double price);
}
