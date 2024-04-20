package com.example.prueba.domain.models;

import java.util.Calendar;
import java.util.List;

public class TipoHabitacion extends Habitacion{

    private int idTipoHabitacion;
    private int nombreTipoHabitacion;
    private int valorNoche;

    public TipoHabitacion(int idPiso, int numeroPiso, List<Habitacion> habitacioneDelPiso, Long idHabitacion, Calendar fechaEntrada, Calendar fechaSalida, int cantidadHuespedes, boolean disponible, int idTipoHabitacion, int nombreTipoHabitacion, int valorNoche) {
        super(idPiso, numeroPiso, habitacioneDelPiso, idHabitacion, fechaEntrada, fechaSalida, cantidadHuespedes, disponible);
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
