package com.TiendaM_1Q2023.dao;

import com.TiendaM_1Q2023.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
