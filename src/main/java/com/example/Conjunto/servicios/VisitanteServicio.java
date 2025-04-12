package com.example.Conjunto.servicios;

import com.example.Conjunto.modelos.visitante;
import com.example.Conjunto.repositorios.VisitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServicio {

    @Autowired
    private VisitanteRepositorio visitanteRepositorio;

    public visitante guardar(visitante visitante) {
        return visitanteRepositorio.save(visitante);
    }

    public List<visitante> listar() {
        return visitanteRepositorio.findAll();
    }
}
