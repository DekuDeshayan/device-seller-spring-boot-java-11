package com.sha.springbootdeviceseller.service;

import java.util.Optional;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;

public interface UserService {

	
	User saveUser(User user);

	Optional<User> findByUsername(String username);

	void changeRole(Role newRole, String username);
}
