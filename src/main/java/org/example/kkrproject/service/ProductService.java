package org.example.kkrproject.service;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.model.Product;
import org.example.kkrproject.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepo;

    public Product findById(Integer id) {
        return productRepo.findById(id).orElse(null);
    }
}
