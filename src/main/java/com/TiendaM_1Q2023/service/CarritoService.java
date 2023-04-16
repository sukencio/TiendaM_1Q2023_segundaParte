/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaM_1Q2023.service;

import com.TiendaM_1Q2023.domain.Carrito;

/**
 *
 * @author sebgu
 */
public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(Long idCliente);
    
}
