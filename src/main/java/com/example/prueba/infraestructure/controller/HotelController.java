package com.example.prueba.infraestructure.controller;

import com.example.prueba.application.service.HotelServiceImpl;
import com.example.prueba.domain.models.Habitacion;
import com.example.prueba.domain.ports.in.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/api/hotel")
public class HotelController {

    private HotelService hotelService = new HotelServiceImpl();

    @GetMapping("/listar-disponibles")
    public Flux<Habitacion> listarDispobibles(@RequestBody Habitacion habitacion) {
        return hotelService.listarDispobibles(habitacion.getIdHabitacion());
    }

    @GetMapping("/listar-no-disponibles")
    public Flux<Habitacion> listarNoDispobibles(@RequestBody Habitacion habitacion) {
        return hotelService.listarNoDispobibles(habitacion.getIdHabitacion());
    }

    @PostMapping("/registrar-habitacion")
    public Mono<Habitacion> registrarHabitacion(@RequestBody Habitacion habitacion) {
        return hotelService.registrarHabitacion(habitacion);
    }

    @DeleteMapping("/eliminar-habitacion")
    public boolean eliminarHabitacion(@RequestBody Habitacion habitacion) {
        return hotelService.eliminarHabitacion(habitacion.getIdHabitacion());
    }

    @PutMapping("/actualizar-habitacion")
    public Mono<Habitacion> actualizarHabitacion(@RequestBody Habitacion habitacion) {
        return hotelService.actualizarHabitacion(habitacion);
    }

    @GetMapping("/habitacion-por-fecha-entrada")
    public Flux<Habitacion> buscarHabitacionPorFechaDeEntrada(@RequestBody Habitacion habitacion) {
        return hotelService.buscarHabitacionPorFechaDeEntrada(habitacion.getIdHabitacion(), habitacion.getFechaEntrada());
    }

    @GetMapping("/habitacion-por-fecha-salida")
    public Flux<Habitacion> buscarHabitacionPorFechaDeSalida(@RequestBody Habitacion habitacion) {
        return hotelService.buscarHabitacionPorFechaDeSalida(habitacion.getIdHabitacion(), habitacion.getFechaSalida());
    }

}
