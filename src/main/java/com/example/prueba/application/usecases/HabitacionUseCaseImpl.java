package com.example.prueba.application.usecases;

import com.example.prueba.domain.models.Habitacion;
import com.example.prueba.domain.ports.in.HabitacionUseCase;
import com.example.prueba.domain.ports.out.RepositoryHotel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Calendar;

public class HabitacionUseCaseImpl implements HabitacionUseCase {

    private Logger log = LoggerFactory.getLogger(HabitacionUseCaseImpl.class);
    private RepositoryHotel repositoryHotel;

    public HabitacionUseCaseImpl() {
    }

    @Override
    public Flux<Habitacion> listarDispobibles(Long idHabitacion) {
        Flux<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.listarHabitaciones(idHabitacion).filter(dispobibles -> dispobibles.isDisponible());
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public Flux<Habitacion> listarNoDispobibles(Long idHabitacion) {
        Flux<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.listarHabitaciones(idHabitacion).filter(disponibles -> !disponibles.isDisponible());
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public Mono<Habitacion> registrarHabitacion(Habitacion habitacion) {
        Mono<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.crearHabitacion(habitacion);
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public boolean eliminarHabitacion(Long idHabitacion) {
        boolean respuesta = false;
        try {
            respuesta = repositoryHotel.eliminarHabitacion(idHabitacion);
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public Mono<Habitacion> actualizarHabitacion(Habitacion habitacion) {
        Mono<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.actualizarHabitacion(habitacion);
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public Flux<Habitacion> buscarHabitacionPorFechaDeEntrada(Long idHabitacion, Calendar fechaDeEntrada) {
        Flux<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.listarHabitaciones(idHabitacion).filter(fechaInicio -> fechaInicio.getFechaEntrada().equals(fechaDeEntrada));
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }

    @Override
    public Flux<Habitacion> buscarHabitacionPorFechaDeSalida(Long idHabitacion, Calendar fechaDeSalida) {
        Flux<Habitacion> respuesta = null;
        try {
            respuesta = repositoryHotel.listarHabitaciones(idHabitacion).filter(fechaFin -> fechaFin.getFechaSalida().equals(fechaDeSalida));
        }
        catch (Exception e){
            log.info(e.getMessage());
        }

        return respuesta;
    }
}
