package com.vaani.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaani.register.model.User;
import com.vaani.register.repository.UserRepository;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User save(User user) {
		String hashedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(hashedPassword);
		return userRepository.save(user);
	}

	public boolean findByLogin(String userName, String password) {
		User user = userRepository.findByUserName(userName);

		if (user != null && passwordEncoder.matches(password, user.getPassword())) {
			return true;
		}
		return false;
	}

	public boolean findByUserName(String userName) {
		User user = userRepository.findByUserName(userName);

		if (user != null) {
			return true;
		}

		return false;
	}

}
