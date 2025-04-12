package com.example.Conjunto.servicios;

import com.example.Conjunto.modelos.propietario;
import com.example.Conjunto.repositorios.PropietarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServicio {

    @Autowired
    private PropietarioRepositorio propietarioRepositorio;

    public propietario guardar(propietario propietario) {
        return propietarioRepositorio.save(propietario);
    }

    public List<propietario> listar() {
        return propietarioRepositorio.findAll();
    }
}
