package org.example.kkrproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vooraad_product")
public class VoorraadProduct {

    @EmbeddedId
    private VoorraadProductId id;

    @ManyToOne
    @MapsId("voorraadcode")
    @JoinColumn(name = "voorraadcode")
    private Voorraad voorraad;

    @ManyToOne
    @MapsId("productcode")
    @JoinColumn(name = "productcode")
    private Product product;

    // Getters & setters
    public VoorraadProductId getId() {
        return id;
    }

    public void setId(VoorraadProductId id) {
        this.id = id;
    }

    public Voorraad getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(Voorraad voorraad) {
        this.voorraad = voorraad;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
