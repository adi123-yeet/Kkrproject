package org.example.kkrproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "voorraad")
public class Voorraad {

    @Id
    @Column(name = "voorraadcode")
    private Integer voorraadcode;

    @Column(name = "aantal")
    private Integer aantal;

    @ManyToOne
    @JoinColumn(name = "houdbaarheidscode")
    private Houdbaarheid houdbaarheid;

    @ManyToOne
    @JoinColumn(name = "bedrijfcode")
    private Bedrijf bedrijf;

    // --- Getters & Setters ---
    public Integer getVoorraadcode() {
        return voorraadcode;
    }

    public void setVoorraadcode(Integer voorraadcode) {
        this.voorraadcode = voorraadcode;
    }

    public Integer getAantal() {
        return aantal;
    }

    public void setAantal(Integer aantal) {
        this.aantal = aantal;
    }

    public Houdbaarheid getHoudbaarheid() {
        return houdbaarheid;
    }

    public void setHoudbaarheid(Houdbaarheid houdbaarheid) {
        this.houdbaarheid = houdbaarheid;
    }

    public Bedrijf getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(Bedrijf bedrijf) {
        this.bedrijf = bedrijf;
    }
}
