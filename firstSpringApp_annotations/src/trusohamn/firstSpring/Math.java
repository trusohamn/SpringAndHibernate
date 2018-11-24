package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

//default bean id
@Component
public class Math implements Course {
	//dependency private field
	
	//autowiring the field by using reflection
	//no setters needed
	@Autowired
	private Teacher teacher;
	private String email;

	public Math() {
	}
	/*
	@Autowired
	public Chemistry(Teacher teacher) {
		this.teacher = teacher;
	} */
	@Override
	public String getDescription() {
		return "Numbers!";
	}
	@Override
	public String sayHello() {
		// use the Teacher to sayHello
		return teacher.sayHello();
	}
	
	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
