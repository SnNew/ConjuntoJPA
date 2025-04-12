package com.example.Conjunto.repositorios;

import com.example.Conjunto.modelos.propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepositorio extends JpaRepository<propietario, Long> {

    @Query("SELECT p FROM propietario p LEFT JOIN FETCH p.visitantes WHERE p.id_propietario = :id")
    propietario findPropietarioConVisitantes(Long id);
}
