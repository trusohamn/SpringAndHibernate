package trusohamn.firstSpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

@Component("myCourse")
public class Biology implements Course {
	private Teacher teacher;
	private String email;
	
	public Biology() {
	}

	@Override
	public String getDescription() {
		return "You will learn about plants and animals";
	}
	@Override
	public String sayHello() {
		// use the Teacher to sayHello
		return teacher.sayHello();
	}
	@Autowired
	@Qualifier("goodOne")
	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	//an init method
	@PostConstruct
	public void myInit() {
		System.out.println("inside myInit method");		
	}
	//a destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("inside myDestroy method");	
	}

}
