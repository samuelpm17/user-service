package com.unosquare.learning.userservice.service;

import java.util.List;

import com.unosquare.learning.commons.learningcommons.model.entity.User;

public interface UserService {

	public List<User> findAll();
	public User findById(Long id);
	public User save(User user);
	public void delete(Long id);
	
}
