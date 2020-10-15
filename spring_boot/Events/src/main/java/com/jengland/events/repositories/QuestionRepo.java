package com.jengland.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.events.models.Question;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {

}
