package com.example.demo.model;


import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Actividad")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Actividad {
    @Id
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private int duracion;
    @Column(nullable = false)
    private int calorias;
    @Column(nullable = false)
    private LocalDateTime fecha;
    
}
