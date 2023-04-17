/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.BebidaRepositorio to edit this template
 */
package com.pila.API.repositorio;

import com.pila.API.modelo.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author dylanpilrod
 */
public interface BebidaRepositorio extends JpaRepository<Bebida, Integer> {
    
}
