package com.vaani.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vaani.register.model.User;
import com.vaani.register.repository.UserRepository;

@Service("userservice")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Transactional
  public User save(User user) {
      return userRepository.save(user);
  }

  public boolean findByLogin(String userName, String password) {  
      User user = userRepository.findByUserName(userName);

      if(user != null && user.getPassword().equals(password)) {
          return true;
      } 

      return false;       
  }

  public boolean findByUserName(String userName) {
      User user = userRepository.findByUserName(userName);

      if(user != null) {
          return true;
      }

      return false;
  }

}
