package org.example.kkrproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bedrijf")
public class Bedrijf {

    @Id
    @Column(name = "bedrijfcode")
    private Integer bedrijfcode;

    @Column(name = "naam")
    private String naam;

    @Column(name = "locatie")
    private String locatie;

    @Column(name = "type")
    private String type;

    // GETTERS & SETTERS
    public Integer getBedrijfcode() {
        return bedrijfcode;
    }

    public void setBedrijfcode(Integer bedrijfcode) {
        this.bedrijfcode = bedrijfcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
