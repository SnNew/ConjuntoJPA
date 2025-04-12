package com.example.Conjunto.repositorios;

import com.example.Conjunto.modelos.reserva_parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaParqueaderoRepositorio extends JpaRepository<reserva_parqueadero, Long> {

    @Query("SELECT r FROM reserva_parqueadero r WHERE r.propietario.id_propietario = :idPropietario")
    reserva_parqueadero findByPropietarioId(Long idPropietario);
}
