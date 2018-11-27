package trusohamn.dependency;

import org.springframework.stereotype.Component;

@Component
public class GoodOne implements Teacher {

	@Override
	public String sayHello() {
		return "So lets get started";
	}

}
