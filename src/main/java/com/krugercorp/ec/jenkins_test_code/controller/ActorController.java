package com.krugercorp.ec.jenkins_test_code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krugercorp.ec.jenkins_test_code.model.Actor;
import com.krugercorp.ec.jenkins_test_code.service.ActorService;

@RestController
@RequestMapping("/")
public class ActorController {
	@Autowired
	ActorService actorService;
	
	@GetMapping
	public List<Actor> getActors() {
		return actorService.getAll();
	}
	
}
