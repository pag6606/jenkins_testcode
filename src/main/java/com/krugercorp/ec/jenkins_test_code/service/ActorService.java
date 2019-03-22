package com.krugercorp.ec.jenkins_test_code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krugercorp.ec.jenkins_test_code.dao.ActorRepository;
import com.krugercorp.ec.jenkins_test_code.model.Actor;

@Service
public class ActorService {
		@Autowired
		ActorRepository actorRepository;
		
		public List<Actor> getAll() {
			List<Actor> actors = new ArrayList<Actor>();
			
			 actorRepository.findAll().forEach(actors::add);
			 return actors;
		}
}
