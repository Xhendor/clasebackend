package com.uabc.edu.clase.backend.repository;

import com.uabc.edu.clase.backend.model.Heroe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository   //CREATE/READ/UPDATE/DELETE
public interface HeroesRepository extends CrudRepository<Heroe,Integer> {



    public List<Heroe> findByName(String name);
    public List<Heroe> findByNameIsLike(String name);

    public List<Heroe> findByNameContains(String name);


}
