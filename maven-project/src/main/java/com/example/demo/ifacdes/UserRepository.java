package com.example.demo.ifacdes;

import java.util.Optional;

import com.example.demo.model.User;

public interface UserRepository {

	User findByUsername(String username);
    boolean existsByUsername(String username);
	User saveUser(User user);
	Optional<User> findUserByEmail(String email);

}
