package com.TiendaM_1Q2023.dao;

import com.TiendaM_1Q2023.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
    
}
