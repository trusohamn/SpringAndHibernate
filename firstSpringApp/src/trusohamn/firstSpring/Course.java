package trusohamn.firstSpring;

import trusohamn.dependency.Teacher;

public interface Course {

	public String getDescription();
	
	public String sayHello();
	
	//for injecting setter dependencies
	public void setTeacher(Teacher t);
	
	//for injecting literal dependencies
	public void setEmail(String e);
	public String getEmail();

}
