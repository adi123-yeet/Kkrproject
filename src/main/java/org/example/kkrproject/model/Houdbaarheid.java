package org.example.kkrproject.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "houdbaarheid")
public class Houdbaarheid {

    @Id
    @Column(name = "houdbaarheidscode")
    private Integer houdbaarheidscode;

    @Column(name = "vervaldatum")
    private Date vervaldatum;

    @Column(name = "isverlopen")
    private Boolean isverlopen;

    @Column(name = "leverdatum")
    private Date leverdatum;

    // Getters en setters
    public Integer getHoudbaarheidscode() {
        return houdbaarheidscode;
    }

    public void setHoudbaarheidscode(Integer houdbaarheidscode) {
        this.houdbaarheidscode = houdbaarheidscode;
    }

    public Date getVervaldatum() {
        return vervaldatum;
    }

    public void setVervaldatum(Date vervaldatum) {
        this.vervaldatum = vervaldatum;
    }

    public Boolean getIsverlopen() {
        return isverlopen;
    }

    public void setIsverlopen(Boolean isverlopen) {
        this.isverlopen = isverlopen;
    }

    public Date getLeverdatum() {
        return leverdatum;
    }

    public void setLeverdatum(Date leverdatum) {
        this.leverdatum = leverdatum;
    }
}
