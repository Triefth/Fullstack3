package com.example.demo.controller;

import com.example.demo.model.Actividad;
import com.example.demo.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividades")
public class ActividadController {
    @Autowired
    private ActividadService service;

    @GetMapping
    public List<Actividad> getActividades() {
        return service.getAll();
    }

    @PostMapping
    public Actividad addActividad(@RequestBody Actividad actividad) {
        return service.add(actividad);
    }
}