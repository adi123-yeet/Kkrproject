package org.example.kkrproject.service;

import lombok.RequiredArgsConstructor;
import org.example.kkrproject.model.Bedrijf;
import org.example.kkrproject.repository.BedrijfRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BedrijfService {

    private final BedrijfRepository bedrijfRepo;

    public List<Bedrijf> getStoresByProduct(Integer productcode) {
        return bedrijfRepo.findStoresByProduct(productcode);
    }
}
