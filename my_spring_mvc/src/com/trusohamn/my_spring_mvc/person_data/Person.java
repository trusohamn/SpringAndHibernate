package com.trusohamn.my_spring_mvc.person_data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	private String firstName;
	@NotNull(message="last name is requireed")
	@Size(min=1, message="last name is required")
	private String lastName;
	private String country;
	private String subject;
	private String[] groups;
	
	public Person() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String[] getGroups() {
		return groups;
	}

	public void setGroups(String[] groups) {
		this.groups = groups;
	}

}
