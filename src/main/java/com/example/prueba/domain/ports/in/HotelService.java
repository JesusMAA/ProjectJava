package com.example.prueba.domain.ports.in;

import com.example.prueba.domain.models.Habitacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public interface HotelService {

    public Flux<Habitacion> listarDispobibles(Long idHabitacion);
    public Flux<Habitacion> listarNoDispobibles(Long idHabitacion);
    public Mono<Habitacion> registrarHabitacion(Habitacion habitacion);
    public boolean eliminarHabitacion(Long idHabitacion);
    public Mono<Habitacion> actualizarHabitacion(Habitacion habitacion);
    public Flux<Habitacion> buscarHabitacionPorFechaDeEntrada(Long idHabitacion, Calendar fechaDeEntrada);
    public Flux<Habitacion> buscarHabitacionPorFechaDeSalida(Long idHabitacion, Calendar fechaDeEntrada);

}
