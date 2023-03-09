package com.Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table (name= "salas")
public class Sala implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre_sala;
    private String capacidad;
    private String numero_sala;

    public String getNombre_sala() {
        return nombre_sala;
    }

    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(String numero_sala) {
        this.numero_sala = numero_sala;
    }
    
}
