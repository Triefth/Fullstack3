package com.example.demo.service;

import com.example.demo.model.Actividad;
import com.example.demo.repository.ActividadRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActividadService {
    @Autowired
    private ActividadRepositoryJPA repository;

    public List<Actividad> getAll() {
        return repository.findAll();
    }

    public Actividad add(Actividad actividad) {
        if (actividad.getNombre() == null || actividad.getTipo() == null) {
            throw new IllegalArgumentException("Nombre y tipo son requeridos");
        }
        actividad.setFecha(LocalDateTime.now());
        actividad.setCalorias(actividad.getDuracion() * 5); // Simulación de cálculo
        return repository.save(actividad);
    }
}