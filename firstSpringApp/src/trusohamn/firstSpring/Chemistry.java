package trusohamn.firstSpring;

import trusohamn.dependency.Teacher;

public class Chemistry implements Course {
	//dependency private field
	private Teacher teacher;
	private String email;

	public Chemistry() {
	}
	
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

}
