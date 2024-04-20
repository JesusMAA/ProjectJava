package com.example.prueba.domain.models;

import java.util.Calendar;

public class Habitacion extends TipoHabitacion{

    private Long idHabitacion;
    private Calendar fechaEntrada;
    private Calendar fechaSalida;
    private int cantidadHuespedes;

    public Habitacion(int idTipoHabitacion, int nombreTipoHabitacion, int valorNoche, Long idHabitacion, Calendar fechaEntrada, Calendar fechaSalida, int cantidadHuespedes) {
        super(idTipoHabitacion, nombreTipoHabitacion, valorNoche);
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHuespedes = cantidadHuespedes;
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
}
