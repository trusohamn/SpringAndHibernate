package trusohamn.firstSpring;

import trusohamn.dependency.Teacher;

public class Biology implements Course {
	//dependency private field
	private Teacher teacher;
	private String email;
	
	public Biology() {
	}
	
	public Biology(Teacher teacher) {
		this.teacher = teacher;
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

	@Override
	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
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
