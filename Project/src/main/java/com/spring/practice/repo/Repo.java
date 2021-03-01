package com.spring.practice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.practice.model.User;

@Repository
public interface Repo extends CrudRepository<User, Integer> {

	User getUserByName(String name);

}
