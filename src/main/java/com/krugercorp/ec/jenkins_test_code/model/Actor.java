package com.krugercorp.ec.jenkins_test_code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	private int actor_id;
	@Column(columnDefinition = "first_name")
	private String firstName;
	@Column(columnDefinition = "last_name")
	private String LastName;

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Actor() {

	}

	public Actor(int actor_id, String firstName, String lastName) {
		super();
		this.actor_id = actor_id;
		this.firstName = firstName;
		LastName = lastName;
	}

}
