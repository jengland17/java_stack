package com.jengland.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jengland.events.models.Answer;

@Repository
public interface AnswerRepo extends CrudRepository<Answer, Long>{

}
