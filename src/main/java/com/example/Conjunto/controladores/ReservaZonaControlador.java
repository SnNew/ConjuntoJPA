package com.example.Conjunto.controladores;

import com.example.Conjunto.modelos.reserva_zona;
import com.example.Conjunto.servicios.ReservaZonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas-zona")
public class ReservaZonaControlador {

    @Autowired
    private ReservaZonaServicio servicio;

    @PostMapping("/guardar")
    public reserva_zona guardar(@RequestBody reserva_zona r) {
        return servicio.guardar(r);
    }

    @GetMapping("/listar")
    public List<reserva_zona> listar() {
        return servicio.listar();
    }
}
