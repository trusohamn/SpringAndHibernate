
package trusohamn.dependency;


public class TeacherNoAnnotation implements Teacher {

	@Override
	public String sayHello() {
		return "I am not annotated!";
	}

}
