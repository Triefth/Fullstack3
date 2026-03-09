package com.example.demo.repository;

import com.example.demo.model.Actividad;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ActividadRepository {
    private List<Actividad> actividades = new ArrayList<>();

    public List<Actividad> listarActividades() {
        return new ArrayList<>(actividades); // Copia para inmodificable
    }

    public void agregar(Actividad actividad) {
        actividades.add(actividad);
    }
}