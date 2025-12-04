package org.example.kkrproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int productcode;
    private String naam;
    private String categorie;
    private int originele_prijs;
    private int afgekorte_prijs;
    private String beschrijving;

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getOriginele_prijs() {
        return originele_prijs;
    }

    public void setOriginele_prijs(int originele_prijs) {
        this.originele_prijs = originele_prijs;
    }

    public int getAfgekorte_prijs() {
        return afgekorte_prijs;
    }

    public void setAfgekorte_prijs(int afgekorte_prijs) {
        this.afgekorte_prijs = afgekorte_prijs;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }
}
