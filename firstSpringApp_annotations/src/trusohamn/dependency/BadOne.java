package trusohamn.dependency;

public class BadOne implements Teacher {

	@Override
	public String sayHello() {
		return "It's not going to be fun";
	}

}
