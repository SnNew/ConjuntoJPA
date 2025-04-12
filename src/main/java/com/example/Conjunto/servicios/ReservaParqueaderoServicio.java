package com.example.Conjunto.servicios;

import com.example.Conjunto.modelos.reserva_parqueadero;
import com.example.Conjunto.repositorios.ReservaParqueaderoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaParqueaderoServicio {

    @Autowired
    private ReservaParqueaderoRepositorio repositorio;

    public reserva_parqueadero guardar(reserva_parqueadero r) {
        return repositorio.save(r);
    }

    public List<reserva_parqueadero> listar() {
        return repositorio.findAll();
    }

    public reserva_parqueadero obtenerPorPropietario(Long idPropietario) {
        return repositorio.findByPropietarioId(idPropietario);
    }
}
