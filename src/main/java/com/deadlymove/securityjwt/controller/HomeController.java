package com.deadlymove.securityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.ldap.search.LdapUserSearch;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.security.ldap.userdetails.LdapUserDetailsService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deadlymove.securityjwt.ldapRepo.ApacheDSRepositary;
import com.deadlymove.securityjwt.model.AuthenticationRequest;
import com.deadlymove.securityjwt.model.AuthenticationResponse;
import com.deadlymove.securityjwt.model.UserModel;
import com.deadlymove.securityjwt.utils.JWTUtils;

@RestController
public class HomeController<T> {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	
	@Autowired
	JWTUtils JWTTokenUtils;
	
	@Autowired
	ApacheDSRepositary apacheDSRepositary;
	
	@RequestMapping("/")
	public String home() {
		return "<h1>WELCOME</h1>";
	}
	
	@RequestMapping("/ ")
	public String user() {
		return "<h1>WELCOME USER</h1>";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "<h1>WELCOME ADMIN</h1>";
	} 
	
	
	@RequestMapping("/getAllUsers")
	public Iterable<UserModel> getAllUsers() {
		return apacheDSRepositary.findAll();
	} 
	
	@RequestMapping(value ="/api/auth/authenticate",method = RequestMethod.POST)
	public ResponseEntity<AuthenticationResponse> createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
		Authentication authentication =  null;
		try {
			authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			// TODO: handle exception
			throw new Exception("Incorrect username or password",e);
			
		}
		
		String jwt = JWTTokenUtils.generateToken(authentication);
//		UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//		String jwt = JWTTokenUtils.generateToken(userDetails);
		return  ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	
	
}
