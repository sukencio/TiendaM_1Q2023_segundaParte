/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaM_1Q2023.service;

import com.TiendaM_1Q2023.dao.CarritoDao;
import com.TiendaM_1Q2023.domain.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl implements CarritoService{
    
    @Autowired
    CarritoDao carritoDao;
    
    
    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findByIdCliente(carrito.getIdCarrito()).orElse(null);
    }

    @Override
    public Carrito getCarritoCliente(Long idCliente) {
        Carrito carritoCliente = carritoDao.findByIdCliente(idCliente).orElse(null);
        
        
        if(carritoCliente == null){
            Carrito carritoNuevo = new Carrito(idCliente);
            carritoDao.save(carritoNuevo);
        }
        
        return carritoCliente;
    }
    
}
