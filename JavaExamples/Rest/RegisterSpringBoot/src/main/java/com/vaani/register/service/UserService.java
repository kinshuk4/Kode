package com.vaani.register.service;

import com.vaani.register.model.User;

public interface UserService {
	  User save(User user);
	  boolean findByLogin(String userName, String password);
	  boolean findByUserName(String userName);
	}
