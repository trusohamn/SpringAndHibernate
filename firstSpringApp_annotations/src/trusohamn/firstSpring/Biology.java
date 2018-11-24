package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

@Component("myCourse")
public class Biology implements Course {
	//dependency private field
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
	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	/*@Autowired
	public void checkAutowired() {
		System.out.println("checking method autowired");
	}
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	//an init method
	public void myInit() {
		System.out.println("inside myInit method");		
	}
	//a destroy method
	public void myDestroy() {
		System.out.println("inside myDestroy method");	
	}

}
