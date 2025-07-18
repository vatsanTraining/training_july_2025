package com.example.demo.services;

import java.util.Optional;

import com.example.demo.ifacdes.UserRepository;
import com.example.demo.model.User;

public class UserService {

	
	private UserRepository repo;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	public User saveUser(User obj) {
		
		obj.setName(obj.getName().toUpperCase());
		
		return this.repo.saveUser(obj);
		
	}
	
	public Optional<User> findUserByEmail(String email) {
		
		return this.repo.findUserByEmail(email);
		       
		//return Optional.of(new User("ram","ram@abc.com"));
	}
	
	
	
}
