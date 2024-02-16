package com.fm.Fleet.Management.Software.models;

import jakarta.persistence.*;

@Entity // cada columna en base de datos
@Table(name = "taxis")
public class TaxiModel {
    @Id
    private Integer id;
    private String plate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
