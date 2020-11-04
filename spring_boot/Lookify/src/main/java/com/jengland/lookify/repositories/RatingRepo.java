package com.jengland.lookify.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.lookify.models.Rating;

@Repository
public interface RatingRepo extends CrudRepository<Rating, Long>{

	@Query(value="SELECT * FROM ratings WHERE user_id = ?1 AND song_id = ?2", nativeQuery=true)
	List<Rating> matchingRatings(Long user_id, Long song_id);
	
}
