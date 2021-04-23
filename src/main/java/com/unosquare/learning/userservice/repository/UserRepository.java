package com.unosquare.learning.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unosquare.learning.commons.learningcommons.model.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
