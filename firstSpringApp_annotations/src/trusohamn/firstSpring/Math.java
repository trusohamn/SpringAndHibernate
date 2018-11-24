package trusohamn.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import trusohamn.dependency.Teacher;

@Component 
public class Math implements Course {
	@Autowired
	@Qualifier("badOne")
	private Teacher teacher;
	//dependency private field
	//autowiring the field by using reflection
	//no setters needed
	
	//injection of the value from the file
	@Value("${foo.email}")
	private String email;

	public Math() {
		
	}

	@Override
	public String getDescription() {
		return "Numbers!";
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
