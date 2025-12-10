package org.example.kkrproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int productcode;
    private String naam;
    private String categorie;
    private int originelePrijs;
    private int afgekortePrijs;
    private String beschrijving;

    // Getter & Setter voor productcode
    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    // Getter & Setter voor naam
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Getter & Setter voor categorie
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    // Getter & Setter voor originelePrijs
    public int getOriginelePrijs() {
        return originelePrijs;
    }

    public void setOriginelePrijs(int originelePrijs) {
        this.originelePrijs = originelePrijs;
    }

    // Getter & Setter voor afgekortePrijs
    public int getAfgekortePrijs() {
        return afgekortePrijs;
    }

    public void setAfgekortePrijs(int afgekortePrijs) {
        this.afgekortePrijs = afgekortePrijs;
    }

    // Getter & Setter voor beschrijving
    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }
}
