package org.example.kkrproject.repository;

import org.example.kkrproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Product, Integer> {
}
