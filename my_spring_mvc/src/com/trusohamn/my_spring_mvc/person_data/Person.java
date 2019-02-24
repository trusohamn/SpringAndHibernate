package com.trusohamn.my_spring_mvc.person_data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
	@Min(value=0, message="must be greater or equal to 0")
	@Max(value=100, message="must be smaller or equal to 100 ")
	private int age;
	
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
