package modelos;

import jakarta.persistence.*;

@Entity
public class zona_social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_zona;

    private String nombre;
    private String ubicacion;
    private int capacidad;

    public zona_social() {
    }

    public Long getId_zona() {
        return id_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setId_zona(Long id_zona) {
        this.id_zona = id_zona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
