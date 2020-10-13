package com.jengland.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jengland.languages.models.Language;
import com.jengland.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private final LanguageRepository languageRepo;
	
	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	public List<Language> allLanguages() {
		return languageRepo.findAll();
	}
	
	public Language create(Language lang) {
		return languageRepo.save(lang);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = languageRepo.findById(id);
		if (optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	
	public Language editLanguage(Language language) {
		return languageRepo.save(language);
	}
	
	public void remove(Long id) {
		languageRepo.deleteById(id);
		
	}
	
	
	
}
