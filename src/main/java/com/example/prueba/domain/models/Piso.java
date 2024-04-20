package com.example.prueba.domain.models;

import java.util.List;

public class Piso {

    private int idPiso;
    private int numeroPiso;
    private List<Habitacion> habitacioneDelPiso;

    public Piso(int idPiso, int numeroPiso, List<Habitacion> habitacioneDelPiso) {
        this.idPiso = idPiso;
        this.numeroPiso = numeroPiso;
        this.habitacioneDelPiso = habitacioneDelPiso;
    }

    public int getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(int idPiso) {
        this.idPiso = idPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public List<Habitacion> getHabitacioneDelPiso() {
        return habitacioneDelPiso;
    }

    public void setHabitacioneDelPiso(List<Habitacion> habitacioneDelPiso) {
        this.habitacioneDelPiso = habitacioneDelPiso;
    }
}
