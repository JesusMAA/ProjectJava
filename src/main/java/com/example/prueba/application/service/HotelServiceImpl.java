package com.example.prueba.application.service;

import com.example.prueba.application.usecases.HabitacionUseCaseImpl;
import com.example.prueba.domain.models.Habitacion;
import com.example.prueba.domain.ports.in.HotelService;
import com.example.prueba.domain.ports.in.HabitacionUseCase;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public class HotelServiceImpl implements HotelService {

    private HabitacionUseCase habitacionUseCase = new HabitacionUseCaseImpl();

    public HotelServiceImpl() {
    }

    @Override
    public Flux<Habitacion> listarDispobibles(Long idHabitacion) {
        return habitacionUseCase.listarDispobibles(idHabitacion);
    }

    @Override
    public Flux<Habitacion> listarNoDispobibles(Long idHabitacion) {
        return habitacionUseCase.listarNoDispobibles(idHabitacion);
    }

    @Override
    public Mono<Habitacion> registrarHabitacion(Habitacion habitacion) {
        return habitacionUseCase.registrarHabitacion(habitacion);
    }

    @Override
    public boolean eliminarHabitacion(Long idHabitacion) {
        return habitacionUseCase.eliminarHabitacion(idHabitacion);
    }

    @Override
    public Mono<Habitacion> actualizarHabitacion(Habitacion habitacion) {
        return habitacionUseCase.actualizarHabitacion(habitacion);
    }

    @Override
    public Flux<Habitacion> buscarHabitacionPorFechaDeEntrada(Long idHabitacion, Calendar fechaDeEntrada) {
        return habitacionUseCase.buscarHabitacionPorFechaDeEntrada(idHabitacion, fechaDeEntrada);
    }

    @Override
    public Flux<Habitacion> buscarHabitacionPorFechaDeSalida(Long idHabitacion, Calendar fechaDeEntrada) {
        return habitacionUseCase.buscarHabitacionPorFechaDeSalida(idHabitacion, fechaDeEntrada);
    }
}
