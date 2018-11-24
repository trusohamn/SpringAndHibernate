package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

//default bean id
@Component
public class Chemistry implements Course {
	//dependency private field
	private Teacher teacher;
	private String email;

	public Chemistry() {
	}
	
	@Autowired
	public Chemistry(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String getDescription() {
		return "You will learn about organic chemicals";
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
