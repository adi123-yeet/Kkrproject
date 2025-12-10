package org.example.kkrproject.repository;

import org.example.kkrproject.model.VoorraadProduct;
import org.example.kkrproject.model.VoorraadProductId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoorraadProductRepository
        extends JpaRepository<VoorraadProduct, VoorraadProductId> {

    List<VoorraadProduct> findByProduct_Productcode(Integer productcode);
}

