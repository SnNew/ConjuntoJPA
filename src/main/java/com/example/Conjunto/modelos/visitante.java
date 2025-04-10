package com.example.Conjunto.modelos;
import jakarta.persistence.*;

@Entity
public class visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_visitante;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private propietario propietario;

    public visitante() {
    }

    public Long getId_visitante() {
        return id_visitante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setId_visitante(Long id_visitante) {
        this.id_visitante = id_visitante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }
}
