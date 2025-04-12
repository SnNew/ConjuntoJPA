package com.example.Conjunto.controladores;

import com.example.Conjunto.modelos.visitante;
import com.example.Conjunto.servicios.VisitanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitantes")
public class VisitanteControlador {

    @Autowired
    private VisitanteServicio servicio;

    @PostMapping("/guardar")
    public visitante guardar(@RequestBody visitante v) {
        return servicio.guardar(v);
    }

    @GetMapping("/listar")
    public List<visitante> listar() {
        return servicio.listar();
    }
}
