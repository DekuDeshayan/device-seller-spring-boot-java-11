package com.sha.springbootdeviceseller.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;
import com.sha.springbootdeviceseller.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	//Dependecy Injection 
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User saveUser (User user) { 
	    user.setPassword(passwordEncoder.encode(user.getPassword()));//setando e encodando a password
		user.setRole(Role.USER);
		user.setCreateTime(LocalDateTime.now());
		return userRepository.save(user);
	}
	
	@Override
	public Optional<User> findByUsername (String username){	
		return userRepository.findByUsername(username);	
	}
	
	@Override
	@Transactional
	public void changeRole(Role newRole, String username) {
		
		userRepository.updateUserRole(username, newRole);
		
	}
	
	
	
	
}
