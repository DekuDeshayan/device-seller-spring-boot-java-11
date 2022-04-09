package com.sha.springbootdeviceseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.security.UserPrincipal;
import com.sha.springbootdeviceseller.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PutMapping("change/{role}")//api/user/change/{role}
	public ResponseEntity<?> changeRole(@PathVariable Role role, @AuthenticationPrincipal UserPrincipal userPrincipal){
		
		
		userService.changeRole(role, userPrincipal.getUsername());
		
		return ResponseEntity.ok(true);
		
	}
	
}
