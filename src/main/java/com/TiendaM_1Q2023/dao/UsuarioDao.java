/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaM_1Q2023.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TiendaM_1Q2023.domain.Usuario;

/**
 *
 * @author sebgu
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>
{
    Usuario findByUsername(String username);
}
