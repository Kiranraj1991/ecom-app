package com.ecom.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecom.entity.User;
import com.ecom.repository.UserRepository;
import com.ecom.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{


	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;


	@Override
	public User registerUser(String email, String password, String name) {
		// TODO Auto-generated method stub
		User user = User.builder().
				email(email).
				passwordHash(passwordEncoder.encode(password)).
				name(name).
				status("ACTIVE").
				createdAt(LocalDateTime.now()).build();
		return user;
	}

	@Override
	public Optional<User> getUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

}
