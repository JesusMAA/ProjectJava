package com.example.prueba.domain.models;

import java.util.Calendar;
import java.util.List;

public class Habitacion extends Piso{

    private Long idHabitacion;
    private Calendar fechaEntrada;
    private Calendar fechaSalida;
    private int cantidadHuespedes;

    private boolean disponible;

    public Habitacion(int idPiso, int numeroPiso, List<Habitacion> habitacioneDelPiso, Long idHabitacion, Calendar fechaEntrada, Calendar fechaSalida, int cantidadHuespedes, boolean disponible) {
        super(idPiso, numeroPiso, habitacioneDelPiso);
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHuespedes = cantidadHuespedes;
        this.disponible = disponible;
    }

    public Long getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Long idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadHuespedes() {
        return cantidadHuespedes;
    }

    public void setCantidadHuespedes(int cantidadHuespedes) {
        this.cantidadHuespedes = cantidadHuespedes;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
