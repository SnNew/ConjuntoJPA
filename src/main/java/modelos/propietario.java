package modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_propietario;

    private String nombre;
    private String cedula;
    private LocalDate fecha_visita;
    private LocalTime hora_entrada;

    @OneToOne(mappedBy = "propietario", cascade = CascadeType.ALL)
    private reserva_parqueadero reservaParqueadero;

    public propietario() {
    }

    public Long getId_propietario() {
        return id_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public reserva_parqueadero getReservaParqueadero() {
        return reservaParqueadero;
    }

    public void setId_propietario(Long id_propietario) {
        this.id_propietario = id_propietario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public void setReservaParqueadero(reserva_parqueadero reservaParqueadero) {
        this.reservaParqueadero = reservaParqueadero;
    }
}
