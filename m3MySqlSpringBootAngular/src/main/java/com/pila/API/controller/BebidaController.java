/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pila.API.controller;

import com.pila.API.modelo.Bebida;
import com.pila.API.servicio.BebidaServicio;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dylanpilrod
 */
@RestController
@RequiredArgsConstructor
public class BebidaController {

    private final BebidaServicio bebidaServicio;

    @GetMapping("/bebida")
    public List<Bebida> listarBebida() {
        return bebidaServicio.listarBebida();
    }

    @GetMapping("/bebida/{id}")
    public ResponseEntity<Bebida> obtenerBebida(@PathVariable Integer id) {
        try {
            Bebida bebida = bebidaServicio.obtenerBebidaPorId(id);
            return ResponseEntity.ok(bebida);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/bebida")
    public void nuevoBebida(@RequestBody Bebida bebida) {
        bebidaServicio.guardarBebida(bebida);
    }

    @PutMapping("/bebida/{id}")
    public ResponseEntity<?> editarBebida(@RequestBody Bebida bebida, @PathVariable Integer id) {
        try {
            Bebida bebidaExistente = bebidaServicio.obtenerBebidaPorId(id);
            bebidaExistente.setNombreBebida(bebida.getNombreBebida());
            bebidaExistente.setFechaCreacion(bebida.getFechaCreacion());
            bebidaServicio.guardarBebida(bebidaExistente);
            return new ResponseEntity<Bebida>(bebida, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Bebida>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/bebida/{id}")
    public void borrarBebida(@PathVariable Integer id) {
        bebidaServicio.eliminarBebida(id);
    }

}
