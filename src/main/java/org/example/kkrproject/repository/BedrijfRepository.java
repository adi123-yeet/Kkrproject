package org.example.kkrproject.repository;

import org.example.kkrproject.model.Bedrijf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BedrijfRepository extends JpaRepository<Bedrijf, Integer> {

    @Query("""
                SELECT b FROM Bedrijf b
                JOIN Voorraad v ON v.bedrijf = b
                JOIN VoorraadProduct vp ON vp.voorraad = v
                WHERE vp.product.productcode = :productcode
            """)
    List<Bedrijf> findStoresByProduct(Integer productcode);
}
