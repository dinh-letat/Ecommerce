package com.dinhle.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinhle.ecommerce.model.User;
import com.dinhle.ecommerce.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost/3000")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<User> createUser(
			@RequestParam("username") String username, 
			@RequestParam("password") String password, 
			@RequestParam("email") String email){
		User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userService.createUser(user);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(
			@RequestParam("username") String username, 
			@RequestParam("password") String password){
		if()
	}
	
}
