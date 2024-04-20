package com.example.prueba.domain.models;

public class TipoHabitacion {

    private int idTipoHabitacion;
    private int nombreTipoHabitacion;
    private int valorNoche;

    public TipoHabitacion(int idTipoHabitacion, int nombreTipoHabitacion, int valorNoche) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.nombreTipoHabitacion = nombreTipoHabitacion;
        this.valorNoche = valorNoche;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getNombreTipoHabitacion() {
        return nombreTipoHabitacion;
    }

    public void setNombreTipoHabitacion(int nombreTipoHabitacion) {
        this.nombreTipoHabitacion = nombreTipoHabitacion;
    }

    public int getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(int valorNoche) {
        this.valorNoche = valorNoche;
    }
}
