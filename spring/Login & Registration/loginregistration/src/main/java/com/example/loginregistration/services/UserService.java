package com.example.loginregistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.loginregistration.model.LoginUser;
import com.example.loginregistration.model.User;
import com.example.loginregistration.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User register(User newUser, BindingResult result) {
		String passwordEntered = newUser.getPassword();
		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
		}

		if (result.hasErrors()) {

			return null;
		}
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);

		return userRepository.save(newUser);
	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> user = userRepository.findByEmail(newLoginObject.getEmail());

		String passwordEntered = newLoginObject.getPassword();

		if (!user.isPresent()) {
			result.rejectValue("email", "Exists", "email doesnt exist");
			return null;
		} else {
			User userToLogin = user.get();

			if (!BCrypt.checkpw(passwordEntered, (String) userToLogin.getPassword())) {
				result.rejectValue("password", "Matches", "Invalid Password!");
				return null;
			}

		}

		return user.get();
	}

	public User find_User(Long id) {
		Optional<User> findUser = userRepository.findById(id);
		return findUser.get();
	}

}