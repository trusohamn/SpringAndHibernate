package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Value;

import trusohamn.dependency.Teacher;

public class CourseNotAnnotated implements Course {
	private Teacher teacher;
	@Value("${foo.email}")
	private String email;

	public CourseNotAnnotated(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String getDescription() {
		return "Not annotated course!";
	}
	@Override
	public String sayHello() {
		// use the Teacher to sayHello
		return teacher.sayHello();
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getEmail() {
		return email;
	}

}
