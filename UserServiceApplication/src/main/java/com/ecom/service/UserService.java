package com.ecom.service;

import java.util.Optional;

import com.ecom.entity.User;

public interface UserService {
	
	User registerUser(String email,String password,String name);
	
	Optional<User> getUserById(long id);
	
	Optional<User> getUserByEmail(String email);

}
