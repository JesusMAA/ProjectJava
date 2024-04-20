package com.example.prueba.domain.ports.out;

import com.example.prueba.domain.models.Habitacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public interface RepositoryHotel {

    public Flux<Habitacion> listarHabitaciones(Long idHabitacion);
    public Mono<Habitacion> buscarHabitacion(Long idHabitacion);
    public Mono<Habitacion> crearHabitacion(Habitacion habitacion);
    public boolean eliminarHabitacion(Long idHabitacion);
    public Mono<Habitacion> actualizarHabitacion(Habitacion habitacion);

}
