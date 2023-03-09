package com.Cinelitas.repository;

import com.Cinelitas.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {
    
}
