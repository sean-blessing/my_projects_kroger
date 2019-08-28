package com.rs.business.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.business.Request;
import com.rs.business.RequestRepository;

@RestController
@RequestMapping("/requests")
public class RequestController {

	@Autowired
	private RequestRepository requestRepo;
	
	@GetMapping("/")
	public Iterable<Request> getAll() {
	
		return requestRepo.findAll();
	}
}
