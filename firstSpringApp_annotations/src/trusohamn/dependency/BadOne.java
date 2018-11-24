package trusohamn.dependency;
import org.springframework.stereotype.Component;

@Component
public class BadOne implements Teacher {

	@Override
	public String sayHello() {
		return "It's not going to be fun";
	}

}
