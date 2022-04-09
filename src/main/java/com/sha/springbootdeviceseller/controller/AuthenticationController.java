package com.sha.springbootdeviceseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootdeviceseller.model.User;
import com.sha.springbootdeviceseller.service.AuthenticationService;
import com.sha.springbootdeviceseller.service.UserService;

@RestController
@RequestMapping("/api/authentication/")// pre-path-url-padrao-da-api
public class AuthenticationController {
	
	/*
	 * Injectando os servicos de autenticacao e utilizadores
	 */
	
	@Autowired
	private AuthenticationService authenticationService;
	@Autowired
	private UserService userService;
	
	//Criando os metodos da api
	//metodo signUp-cadastro de usuarios...
	
	@PostMapping("sign-up")//api/authentication/sign-up
	public ResponseEntity<?> signUp (@RequestBody User user){
		
		
		if(userService.findByUsername(user.getUsername()).isPresent()) {
			
			return new ResponseEntity<>(HttpStatus.CONFLICT);	
		}
		
		//metodo do userServices para salvar users...
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
	}
	
	
	@PostMapping("sign-in")//api/authentication/sign-in
	public ResponseEntity<?> signIn(@RequestBody User user){
		
		//metodo do authService efetuar login...
		return new ResponseEntity<> (authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
	}
	
	
	
	
	
	

}
