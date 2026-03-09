package com.example.demo.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Actividad;

@Repository
public class ActividadRepository {
    public List<Actividad> listarActividades() {
        return Collections.unmodifiableList(listarActividades());
    }
    
}


