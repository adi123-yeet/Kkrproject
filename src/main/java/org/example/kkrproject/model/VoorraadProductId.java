package org.example.kkrproject.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class VoorraadProductId implements Serializable {

    private Integer voorraadcode;
    private Integer productcode;
}
