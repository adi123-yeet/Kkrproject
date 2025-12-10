package org.example.kkrproject.service;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.repository.VoorraadProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoorraadService {

    private final VoorraadProductRepository voorraadProductRepo;

    public int getTotalStockForProduct(Integer productcode) {
        return voorraadProductRepo.findByProduct_Productcode(productcode)
                .stream()
                .mapToInt(vp -> vp.getVoorraad().getAantal())
                .sum();
    }
}
