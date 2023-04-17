/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Bebida to edit this template
 */
package com.pila.API.modelo;
/**
 *
 * @author dylanpilrod
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Bebida {
    @Id @GeneratedValue
    private Integer id;
    private String nombreBebida;
    private String tipoAlcohol;
    private Integer gradosAlcohol;
    private String tipoMezcla;
    private String fechaCreacion;
    private String campoEmail;
    private Boolean mayorEdad;
}
