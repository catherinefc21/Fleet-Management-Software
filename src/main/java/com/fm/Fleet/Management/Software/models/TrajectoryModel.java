package com.fm.Fleet.Management.Software.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "trajectories")
public class TrajectoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)// ManyToOne: multiples entradas en trajectories pueden estar relacionada
    // con un taxi y FetchType.LAZY: los detalles del taxi se cargarán a demanda
    @JoinColumn(name = "taxi_id", nullable = false)
    private TaxiModel taxi;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TaxiModel getTaxi() {
        return taxi;
    }

    public void setTaxi(TaxiModel taxi) {
        this.taxi = taxi;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
