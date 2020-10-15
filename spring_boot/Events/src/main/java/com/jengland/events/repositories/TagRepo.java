package com.jengland.events.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.events.models.Tag;

@Repository
public interface TagRepo extends CrudRepository<Tag, Long>{
	
	Optional<Tag> findTagByTag(String tag);

}
