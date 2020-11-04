package com.jengland.lookify.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.lookify.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	
	Optional<User> findByEmail(String email);

}
