package org.example.kkrproject.service;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.repository.VoorraadProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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

    @Transactional
    public void verlaagVoorraadMetEen(Integer productcode) {

        var voorraadProducten =
                voorraadProductRepo.findByProduct_Productcode(productcode);

        if (voorraadProducten.isEmpty()) {
            throw new RuntimeException("Geen voorraad gevonden voor product " + productcode);
        }

        // Kies de eerste voorraad met aantal > 0
        var voorraadOpt = voorraadProducten.stream()
                .map(vp -> vp.getVoorraad())
                .filter(v -> v.getAantal() > 0)
                .findFirst();

        if (voorraadOpt.isEmpty()) {
            throw new RuntimeException("Product is niet meer op voorraad");
        }

        var voorraad = voorraadOpt.get();
        voorraad.setAantal(voorraad.getAantal() - 1);

        // save is vaak niet eens nodig door @Transactional,
        // maar expliciet is prima
    }
}

