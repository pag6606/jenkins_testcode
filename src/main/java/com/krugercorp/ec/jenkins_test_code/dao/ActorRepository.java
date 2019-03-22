package com.krugercorp.ec.jenkins_test_code.dao;

import org.springframework.data.repository.CrudRepository;

import com.krugercorp.ec.jenkins_test_code.model.Actor;

public interface ActorRepository extends CrudRepository<Actor, Long>{

}
