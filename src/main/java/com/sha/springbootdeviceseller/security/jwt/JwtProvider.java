package com.sha.springbootdeviceseller.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

import com.sha.springbootdeviceseller.security.UserPrincipal;



public interface JwtProvider {

	Authentication getAuthentication(HttpServletRequest request);

	boolean isTokenValid(HttpServletRequest request);

	String generateToken(UserPrincipal auth);

}
