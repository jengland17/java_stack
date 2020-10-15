package com.jengland.events.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.events.models.Answer;
import com.jengland.events.models.Question;
import com.jengland.events.models.Tag;
import com.jengland.events.repositories.AnswerRepo;
import com.jengland.events.repositories.QuestionRepo;
import com.jengland.events.repositories.TagRepo;

@Service
public class QuestionService {

	private final QuestionRepo questionRepo;
	private final TagRepo tagRepo;
	private final AnswerRepo answerRepo;
	
	public QuestionService(QuestionRepo questionRepo, TagRepo tagRepo, AnswerRepo answerRepo) {
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
		this.answerRepo = answerRepo;
	}
	
	public Question create(Question question) {
		return questionRepo.save(question);
	}
	
	public Tag create(Tag tag) {
		return tagRepo.save(tag);
	}
	
	public Answer create(Answer answer) {
		return answerRepo.save(answer);
	}
	
	public List<Tag> getTags() {
		return (List<Tag>) tagRepo.findAll();
		
	}
	
	public List<Question> getQuestions() {
		return (List<Question>) questionRepo.findAll();
		
	}
	
	public Question getQuestion(Long id) {
		Optional<Question> question = questionRepo.findById(id);
		return question.isPresent() ? question.get() : null;
	}
	
	public Tag getTag(Long id) {
		Optional<Tag> tag = tagRepo.findById(id);
		return tag.isPresent() ? tag.get() : null;
	}
	
	public Tag createOrRetrieve(String tagName) {
		Optional<Tag> mightExist = tagRepo.findTagByTag(tagName);
		if (mightExist.isPresent()) {
			return mightExist.get();
		} else {
			return tagRepo.save(new Tag(tagName));
		}
	}
	
	public Question createQuestionWithTags(Question newQuestion) {
		List<Tag> tags = new ArrayList<Tag>();
		for (String tagName: newQuestion.getTagInput().split(",")) {
			tags.add(createOrRetrieve(tagName));
		}
		newQuestion.setTags(tags);
		return questionRepo.save(newQuestion); 
	}
	
	
	
}
