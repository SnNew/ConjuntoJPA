package com.example.Conjunto.controladores;

import com.example.Conjunto.modelos.reserva_parqueadero;
import com.example.Conjunto.servicios.ReservaParqueaderoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas-parqueadero")
public class ReservaParqueaderoControlador {

    @Autowired
    private ReservaParqueaderoServicio servicio;

    @PostMapping("/guardar")
    public reserva_parqueadero guardar(@RequestBody reserva_parqueadero r) {
        return servicio.guardar(r);
    }

    @GetMapping("/listar")
    public List<reserva_parqueadero> listar() {
        return servicio.listar();
    }

    @GetMapping("/por-propietario/{id}")
    public reserva_parqueadero obtenerPorPropietario(@PathVariable Long id) {
        return servicio.obtenerPorPropietario(id);
    }
}
