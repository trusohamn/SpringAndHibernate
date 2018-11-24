package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

@Component
@Scope("prototype")
public class Chemistry implements Course {
	
	private Teacher teacher;
	private String email;

	public Chemistry() {
	}
	
	@Autowired 
	public Chemistry(@Qualifier("goodOne")Teacher teacher) {
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
