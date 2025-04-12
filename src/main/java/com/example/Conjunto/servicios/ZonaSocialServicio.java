package com.example.Conjunto.servicios;

import com.example.Conjunto.modelos.zona_social;
import com.example.Conjunto.repositorios.ZonaSocialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonaSocialServicio {

    @Autowired
    private ZonaSocialRepositorio zonaSocialRepositorio;

    public zona_social guardar(zona_social zona) {
        return zonaSocialRepositorio.save(zona);
    }

    public List<zona_social> listar() {
        return zonaSocialRepositorio.findAll();
    }
}
