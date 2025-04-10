package com.example.Conjunto.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class reserva_zona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reserva;

    private LocalDate fecha;
    private LocalTime hora_inicio;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private propietario propietario;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    private zona_social zona;

    public reserva_zona() {
    }

    public Long getId_reserva() {
        return id_reserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public zona_social getZona() {
        return zona;
    }

    public void setId_reserva(Long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }

    public void setZona(zona_social zona) {
        this.zona = zona;
    }
}
