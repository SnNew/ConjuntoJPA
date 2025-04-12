package com.example.Conjunto.repositorios;

import com.example.Conjunto.modelos.zona_social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaSocialRepositorio extends JpaRepository<zona_social, Long> {
}
