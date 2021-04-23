package com.unosquare.learning.userservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unosquare.learning.commons.learningcommons.model.entity.User;
import com.unosquare.learning.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/list")
	public List<User> list() {
		return userService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@DeleteMapping("/delete/{id]")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
}
