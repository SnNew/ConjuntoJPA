package com.example.Conjunto.servicios;

import com.example.Conjunto.modelos.reserva_zona;
import com.example.Conjunto.repositorios.ReservaZonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaZonaServicio {

    @Autowired
    private ReservaZonaRepositorio reservaZonaRepositorio;

    public reserva_zona guardar(reserva_zona reserva) {
        return reservaZonaRepositorio.save(reserva);
    }

    public List<reserva_zona> listar() {
        return reservaZonaRepositorio.findAll();
    }
}
