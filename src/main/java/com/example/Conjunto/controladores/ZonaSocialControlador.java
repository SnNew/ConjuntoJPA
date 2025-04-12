package com.example.Conjunto.controladores;

import com.example.Conjunto.modelos.zona_social;
import com.example.Conjunto.servicios.ZonaSocialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonas-sociales")
public class ZonaSocialControlador {

    @Autowired
    private ZonaSocialServicio servicio;

    @PostMapping("/guardar")
    public zona_social guardar(@RequestBody zona_social z) {
        return servicio.guardar(z);
    }

    @GetMapping("/listar")
    public List<zona_social> listar() {
        return servicio.listar();
    }
}
