package com.example.prueba.infraestructure.repository;

import com.example.prueba.domain.models.Habitacion;
import com.example.prueba.domain.ports.out.RepositoryHotel;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class RepositoryHotelImpl implements RepositoryHotel {
    @Override
    public Flux<Habitacion> listarHabitaciones(Long idHabitacion) {
        return null;
    }

    @Override
    public Mono<Habitacion> buscarHabitacion(Long idHabitacion) {
        return null;
    }

    @Override
    public Mono<Habitacion> crearHabitacion(Habitacion habitacion) {
        return null;
    }

    @Override
    public boolean eliminarHabitacion(Long idHabitacion) {
        return false;
    }

    @Override
    public Mono<Habitacion> actualizarHabitacion(Habitacion habitacion) {
        return null;
    }
}
