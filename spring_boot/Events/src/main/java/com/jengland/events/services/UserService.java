package com.jengland.events.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jengland.events.models.LoginUser;
import com.jengland.events.models.User;
import com.jengland.events.repositories.UserRepo;

@Service
public class UserService {
	
	private final UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public User create(User registerringUser) {
		String hashed = BCrypt.hashpw(registerringUser.getPassword(), BCrypt.gensalt());
		registerringUser.setPassword(hashed);
		return userRepo.save(registerringUser);
	}
	
	public User getUser(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User getUser(String email) {
		Optional<User> potentialUser = userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User login(LoginUser loginUser, BindingResult result) {
		if (result.hasErrors()) {
			return null;
		}
		User existingUser = getUser(loginUser.getEmail());
		if (existingUser == null) {
			result.rejectValue("email", "Unique", "Unknown email!");
			return null;
		}
		if (!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
			result.rejectValue("password", "Matches", "Incorrect Password!");
			return null;
		}
		return existingUser;
	}

}
