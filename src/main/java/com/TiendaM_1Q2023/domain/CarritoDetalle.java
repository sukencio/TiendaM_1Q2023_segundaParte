/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaM_1Q2023.domain;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "carrito_detalle")
public class CarritoDetalle implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private Long idCarrito;
    @JoinColumn(name="id_carrito",referencedColumnName="id_articulo")
    @ManyToOne
    private Articulo articulo;
    private double precio;
    private int cantidad;

    public CarritoDetalle() {
    }

    public CarritoDetalle(Long idCarrito, Articulo articulo, double precio, int cantidad) {
        this.idCarrito = idCarrito;
        this.articulo = articulo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
}