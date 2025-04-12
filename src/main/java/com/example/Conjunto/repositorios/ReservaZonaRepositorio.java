package com.example.Conjunto.repositorios;

import com.example.Conjunto.modelos.reserva_zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaZonaRepositorio extends JpaRepository<reserva_zona, Long> {

    @Query("SELECT r FROM reserva_zona r WHERE r.fecha = :fecha")
    List<reserva_zona> findByFecha(LocalDate fecha);
}
