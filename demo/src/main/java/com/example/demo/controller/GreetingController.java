package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Greeting;
import com.example.demo.service.NapkinService;

@RestController
public class GreetingController {

	Logger logger = LoggerFactory.getLogger(GreetingController.class);
	
	private NapkinService napkinService;

	@Autowired
	public GreetingController(NapkinService napkinService) {
		super();
		this.napkinService = napkinService;
	}
	
	
	@GetMapping(path = "/{name}")
	public Greeting getGreeting(String name) {
		Long id = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
		logger.info("id: {} | name: {}",id, name);
		return new Greeting(id , name);
	}
	
}
