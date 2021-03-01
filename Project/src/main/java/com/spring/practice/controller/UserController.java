package com.spring.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.practice.model.User;
import com.spring.practice.repo.Repo;

@RestController
public class UserController {


	@Autowired
	Repo repo;
	
	@GetMapping("/user/{name}")  
	private User getUser(@PathVariable("name") String name)   
	{  
	return repo.getUserByName(name);  
	}  
	
	@PostMapping("/user")  
	private int saveStudent(@RequestBody User user)   
	{  
		repo.save(user);  
	return user.getId();  
	}  
}
