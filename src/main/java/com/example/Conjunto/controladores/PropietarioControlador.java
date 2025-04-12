package com.example.Conjunto.controladores;

import com.example.Conjunto.modelos.propietario;
import com.example.Conjunto.servicios.PropietarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioControlador {

    @Autowired
    private PropietarioServicio servicio;

    @PostMapping("/guardar")
    public propietario guardar(@RequestBody propietario p) {
        return servicio.guardar(p);
    }

    @GetMapping("/listar")
    public List<propietario> listar() {
        return servicio.listar();
    }
}
