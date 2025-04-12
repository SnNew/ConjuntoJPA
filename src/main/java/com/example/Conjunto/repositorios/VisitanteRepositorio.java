package com.example.Conjunto.repositorios;

import com.example.Conjunto.modelos.visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepositorio extends JpaRepository<visitante, Long> {
}
