package com.rs.business.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.business.User;
import com.rs.business.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public Iterable<User> getAll() {
	
		return userRepo.findAll();
	}
}
