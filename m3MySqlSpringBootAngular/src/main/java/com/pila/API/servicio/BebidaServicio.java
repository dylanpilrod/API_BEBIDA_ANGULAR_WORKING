/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pila.API.servicio;

import com.pila.API.modelo.Bebida;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pila.API.repositorio.BebidaRepositorio;
/**
 *
 * @author dylanpilrod
 */
@Service
public class BebidaServicio {
    @Autowired
    private BebidaRepositorio repositorio;
    
    public List<Bebida>listarBebida(){
        return repositorio.findAll();
    }
    
    public void guardarBebida(Bebida bebida){
        repositorio.save(bebida);
    }
    
    public Bebida obtenerBebidaPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarBebida(Integer id){
        repositorio.deleteById(id);
    }
}
