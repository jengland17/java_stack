package com.jengland.dojos.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.dojos.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	
}
